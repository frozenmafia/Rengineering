package o;

import android.net.http.X509TrustManagerExtensions;
import android.os.SystemClock;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
/* renamed from: o.$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ  reason: invalid class name */
/* loaded from: classes5.dex */
public final class C$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ extends SplitPairFilter {
    private static boolean HaptikSDK$a = false;
    private static int HaptikSDK$b = 0;
    private static boolean HaptikSDK$c = false;
    private static char[] ag$a = null;
    private static int ah$b = 1;
    private static int invoke;
    public static final C$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ$ah$a valueOf;
    private final X509TrustManager ah$a;
    private final X509TrustManagerExtensions toString;

    static {
        try {
            values();
            Object[] objArr = null;
            valueOf = new C$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ$ah$a(null);
            int i = ah$b + 29;
            invoke = i % 128;
            if (i % 2 != 0) {
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    static void values() {
        HaptikSDK$a = true;
        HaptikSDK$c = true;
        HaptikSDK$b = 182;
        ag$a = new char[]{264, 265, 247};
    }

    public C$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        try {
            runAnimators.ag$a(x509TrustManager, "trustManager");
            try {
                runAnimators.ag$a(x509TrustManagerExtensions, "x509TrustManagerExtensions");
                this.ah$a = x509TrustManager;
                this.toString = x509TrustManagerExtensions;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // o.SplitPairFilter
    public List<Certificate> valueOf(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
        int i = ah$b + 109;
        invoke = i % 128;
        int i2 = i % 2;
        runAnimators.ag$a(list, "chain");
        runAnimators.ag$a(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        try {
            List<X509Certificate> checkServerTrusted = this.toString.checkServerTrusted((X509Certificate[]) array, toString(null, null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new byte[]{-125, -126, -127}).intern(), str);
            runAnimators.ah$a(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            int i3 = invoke + 3;
            ah$b = i3 % 128;
            int i4 = i3 % 2;
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
        if ((((o.C$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ) r5).ah$a != r4.ah$a) != true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0032, code lost:
        if ((r5 != r0) != true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.C$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ     // Catch: java.lang.Exception -> L45
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3a
            int r0 = o.C$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ.invoke
            int r0 = r0 + 19
            int r3 = r0 % 128
            o.C$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ.ah$b = r3
            int r0 = r0 % 2
            if (r0 != 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == r2) goto L25
            o.$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ r5 = (o.C$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ) r5
            javax.net.ssl.X509TrustManager r5 = r5.ah$a
            javax.net.ssl.X509TrustManager r0 = r4.ah$a
            if (r5 != r0) goto L21
            r5 = 0
            goto L22
        L21:
            r5 = 1
        L22:
            if (r5 == r2) goto L3a
            goto L34
        L25:
            o.$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ r5 = (o.C$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ) r5     // Catch: java.lang.Exception -> L38
            javax.net.ssl.X509TrustManager r5 = r5.ah$a     // Catch: java.lang.Exception -> L38
            javax.net.ssl.X509TrustManager r0 = r4.ah$a     // Catch: java.lang.Exception -> L38
            r3 = 0
            int r3 = r3.length     // Catch: java.lang.Throwable -> L36
            if (r5 != r0) goto L31
            r5 = 0
            goto L32
        L31:
            r5 = 1
        L32:
            if (r5 == r2) goto L3a
        L34:
            r1 = 1
            goto L3a
        L36:
            r5 = move-exception
            throw r5
        L38:
            r5 = move-exception
            throw r5
        L3a:
            int r5 = o.C$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ.ah$b
            int r5 = r5 + 5
            int r0 = r5 % 128
            o.C$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ.invoke = r0
            int r5 = r5 % 2
            return r1
        L45:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int identityHashCode;
        int i = ah$b + 51;
        invoke = i % 128;
        if (i % 2 != 0) {
            identityHashCode = System.identityHashCode(this.ah$a);
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            identityHashCode = System.identityHashCode(this.ah$a);
        }
        int i2 = invoke + 73;
        ah$b = i2 % 128;
        int i3 = i2 % 2;
        return identityHashCode;
    }

    private static String toString(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = ag$a;
            int i2 = HaptikSDK$b;
            if (HaptikSDK$c) {
                int length = bArr.length;
                isLast.values = length;
                char[] cArr3 = new char[length];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                    isLast.toString++;
                }
                return new String(cArr3);
            } else if (HaptikSDK$a) {
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
