package com.sendbird.android.shadow.okhttp3.internal.platform;

import android.os.Build;
import android.util.Log;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.sendbird.android.shadow.okhttp3.Protocol;
import com.sendbird.android.shadow.okhttp3.internal.Util;
import com.sendbird.android.shadow.okhttp3.internal.tls.CertificateChainCleaner;
import com.sendbird.android.shadow.okhttp3.internal.tls.TrustRootIndex;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o.isLast;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class AndroidPlatform extends Platform {
    private static final int MAX_LOG_LENGTH = 4000;
    private final CloseGuard closeGuard = CloseGuard.get();
    private final OptionalMethod<Socket> getAlpnSelectedProtocol;
    private final OptionalMethod<Socket> setAlpnProtocols;
    private final OptionalMethod<Socket> setHostname;
    private final OptionalMethod<Socket> setUseSessionTickets;
    private final Class<?> sslParametersClass;

    AndroidPlatform(Class<?> cls, OptionalMethod<Socket> optionalMethod, OptionalMethod<Socket> optionalMethod2, OptionalMethod<Socket> optionalMethod3, OptionalMethod<Socket> optionalMethod4) {
        this.sslParametersClass = cls;
        this.setUseSessionTickets = optionalMethod;
        this.setHostname = optionalMethod2;
        this.getAlpnSelectedProtocol = optionalMethod3;
        this.setAlpnProtocols = optionalMethod4;
    }

    @Override // com.sendbird.android.shadow.okhttp3.internal.platform.Platform
    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!Util.isAndroidGetsocknameError(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e2);
                throw iOException;
            }
            throw e2;
        } catch (SecurityException e3) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e3);
            throw iOException2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.sendbird.android.shadow.okhttp3.internal.platform.Platform
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        Object readFieldOrNull = readFieldOrNull(sSLSocketFactory, this.sslParametersClass, "sslParameters");
        if (readFieldOrNull == null) {
            try {
                readFieldOrNull = readFieldOrNull(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.trustManager(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) readFieldOrNull(readFieldOrNull, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) readFieldOrNull(readFieldOrNull, X509TrustManager.class, "trustManager");
    }

    @Override // com.sendbird.android.shadow.okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (str != null) {
            this.setUseSessionTickets.invokeOptionalWithoutCheckedException(sSLSocket, true);
            this.setHostname.invokeOptionalWithoutCheckedException(sSLSocket, str);
        }
        OptionalMethod<Socket> optionalMethod = this.setAlpnProtocols;
        if (optionalMethod == null || !optionalMethod.isSupported(sSLSocket)) {
            return;
        }
        this.setAlpnProtocols.invokeWithoutCheckedException(sSLSocket, concatLengthPrefixed(list));
    }

    @Override // com.sendbird.android.shadow.okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        byte[] bArr;
        OptionalMethod<Socket> optionalMethod = this.getAlpnSelectedProtocol;
        if (optionalMethod == null || !optionalMethod.isSupported(sSLSocket) || (bArr = (byte[]) this.getAlpnSelectedProtocol.invokeWithoutCheckedException(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, Util.UTF_8);
    }

    @Override // com.sendbird.android.shadow.okhttp3.internal.platform.Platform
    public void log(int i, String str, Throwable th) {
        int min;
        int i2 = i != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + MAX_LOG_LENGTH);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    @Override // com.sendbird.android.shadow.okhttp3.internal.platform.Platform
    public Object getStackTraceForCloseable(String str) {
        return this.closeGuard.createAndOpen(str);
    }

    @Override // com.sendbird.android.shadow.okhttp3.internal.platform.Platform
    public void logCloseableLeak(String str, Object obj) {
        if (this.closeGuard.warnIfOpen(obj)) {
            return;
        }
        log(5, str, null);
    }

    @Override // com.sendbird.android.shadow.okhttp3.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return super.isCleartextTrafficPermitted(str);
        }
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return api24IsCleartextTrafficPermitted(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.isCleartextTrafficPermitted(str);
        } catch (IllegalAccessException e) {
            e = e;
            throw Util.assertionError("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw Util.assertionError("unable to determine cleartext support", e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw Util.assertionError("unable to determine cleartext support", e);
        }
    }

    private boolean api24IsCleartextTrafficPermitted(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return api23IsCleartextTrafficPermitted(str, cls, obj);
        }
    }

    private boolean api23IsCleartextTrafficPermitted(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.isCleartextTrafficPermitted(str);
        }
    }

    private static boolean supportsAlpn() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // com.sendbird.android.shadow.okhttp3.internal.platform.Platform
    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new AndroidCertificateChainCleaner(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.buildCertificateChainCleaner(x509TrustManager);
        }
    }

    public static Platform buildIfSupported() {
        Class<?> cls;
        OptionalMethod optionalMethod;
        OptionalMethod optionalMethod2;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            OptionalMethod optionalMethod3 = new OptionalMethod(null, "setUseSessionTickets", Boolean.TYPE);
            OptionalMethod optionalMethod4 = new OptionalMethod(null, "setHostname", String.class);
            if (supportsAlpn()) {
                OptionalMethod optionalMethod5 = new OptionalMethod(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                optionalMethod2 = new OptionalMethod(null, "setAlpnProtocols", byte[].class);
                optionalMethod = optionalMethod5;
            } else {
                optionalMethod = null;
                optionalMethod2 = null;
            }
            return new AndroidPlatform(cls2, optionalMethod3, optionalMethod4, optionalMethod, optionalMethod2);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    @Override // com.sendbird.android.shadow.okhttp3.internal.platform.Platform
    public TrustRootIndex buildTrustRootIndex(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new AndroidTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.buildTrustRootIndex(x509TrustManager);
        }
    }

    /* loaded from: classes5.dex */
    static final class AndroidCertificateChainCleaner extends CertificateChainCleaner {
        private static int HaptikSDK$b = 1;
        private static boolean ag$a = true;
        private static int ah$a = 5;
        private static int toString = 0;
        private static boolean valueOf = true;
        private static char[] values = {'W', 'X', 'F'};
        private final Method checkServerTrusted;
        private final Object x509TrustManagerExtensions;

        public int hashCode() {
            int i = toString + 7;
            HaptikSDK$b = i % 128;
            if (i % 2 == 0) {
            }
            int i2 = toString + 45;
            HaptikSDK$b = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        AndroidCertificateChainCleaner(Object obj, Method method) {
            this.x509TrustManagerExtensions = obj;
            this.checkServerTrusted = method;
        }

        @Override // com.sendbird.android.shadow.okhttp3.internal.tls.CertificateChainCleaner
        public List<Certificate> clean(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            int i = HaptikSDK$b + 13;
            toString = i % 128;
            int i2 = i % 2;
            try {
                List<Certificate> list2 = (List) this.checkServerTrusted.invoke(this.x509TrustManagerExtensions, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), ag$a(null, null, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, new byte[]{-125, -126, -127}).intern(), str);
                int i3 = toString + 55;
                HaptikSDK$b = i3 % 128;
                int i4 = i3 % 2;
                return list2;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            int i = toString + 7;
            HaptikSDK$b = i % 128;
            if (!(i % 2 != 0)) {
                try {
                    boolean z = obj instanceof AndroidCertificateChainCleaner;
                    Object obj2 = null;
                    super.hashCode();
                    return z;
                } catch (Exception e) {
                    throw e;
                }
            }
            return obj instanceof AndroidCertificateChainCleaner;
        }

        private static String ag$a(char[] cArr, int[] iArr, int i, byte[] bArr) {
            synchronized (isLast.valueOf) {
                char[] cArr2 = values;
                int i2 = ah$a;
                if (ag$a) {
                    int length = bArr.length;
                    isLast.values = length;
                    char[] cArr3 = new char[length];
                    isLast.toString = 0;
                    while (isLast.toString < isLast.values) {
                        cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                        isLast.toString++;
                    }
                    return new String(cArr3);
                } else if (valueOf) {
                    int length2 = cArr.length;
                    isLast.values = length2;
                    char[] cArr4 = new char[length2];
                    isLast.toString = 0;
                    while (isLast.toString < isLast.values) {
                        cArr4[isLast.toString] = (char) (cArr2[cArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                        isLast.toString++;
                    }
                    return new String(cArr4);
                } else {
                    int length3 = iArr.length;
                    isLast.values = length3;
                    char[] cArr5 = new char[length3];
                    isLast.toString = 0;
                    while (isLast.toString < isLast.values) {
                        cArr5[isLast.toString] = (char) (cArr2[iArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                        isLast.toString++;
                    }
                    return new String(cArr5);
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    static final class CloseGuard {
        private final Method getMethod;
        private final Method openMethod;
        private final Method warnIfOpenMethod;

        CloseGuard(Method method, Method method2, Method method3) {
            this.getMethod = method;
            this.openMethod = method2;
            this.warnIfOpenMethod = method3;
        }

        Object createAndOpen(String str) {
            Method method = this.getMethod;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.openMethod.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        boolean warnIfOpen(Object obj) {
            if (obj != null) {
                try {
                    this.warnIfOpenMethod.invoke(obj, new Object[0]);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
            return false;
        }

        static CloseGuard get() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method2 = cls.getMethod(TtmlNode.TEXT_EMPHASIS_MARK_OPEN, String.class);
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new CloseGuard(method3, method2, method);
        }
    }

    /* loaded from: classes5.dex */
    static final class AndroidTrustRootIndex implements TrustRootIndex {
        private final Method findByIssuerAndSignatureMethod;
        private final X509TrustManager trustManager;

        AndroidTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            this.findByIssuerAndSignatureMethod = method;
            this.trustManager = x509TrustManager;
        }

        @Override // com.sendbird.android.shadow.okhttp3.internal.tls.TrustRootIndex
        public X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.findByIssuerAndSignatureMethod.invoke(this.trustManager, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e) {
                throw Util.assertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof AndroidTrustRootIndex) {
                AndroidTrustRootIndex androidTrustRootIndex = (AndroidTrustRootIndex) obj;
                return this.trustManager.equals(androidTrustRootIndex.trustManager) && this.findByIssuerAndSignatureMethod.equals(androidTrustRootIndex.findByIssuerAndSignatureMethod);
            }
            return false;
        }

        public int hashCode() {
            return this.trustManager.hashCode() + (this.findByIssuerAndSignatureMethod.hashCode() * 31);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (android.os.Build.VERSION.SDK_INT < 22) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0012 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.sendbird.android.shadow.okhttp3.internal.platform.Platform
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public javax.net.ssl.SSLContext getSSLContext() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoClassDefFoundError -> Lf
            r1 = 16
            if (r0 < r1) goto Ld
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoClassDefFoundError -> Lf
            r1 = 22
            if (r0 >= r1) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            if (r0 == 0) goto L19
            java.lang.String r0 = "TLSv1.2"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L19
            return r0
        L19:
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L20
            return r0
        L20:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No TLS provider"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.internal.platform.AndroidPlatform.getSSLContext():javax.net.ssl.SSLContext");
    }
}
