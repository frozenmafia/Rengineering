package o;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import o.accept;
import okhttp3.Protocol;
/* loaded from: classes5.dex */
public final class getLastInfo extends accept.lambda1 {
    public static final values ag$a = new values(null);
    private final Method ah$a;
    private final Class<?> ah$b;
    private final Method toString;
    private final Method valueOf;
    private final Class<?> values;

    public getLastInfo(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        runAnimators.ag$a(method, "putMethod");
        runAnimators.ag$a(method2, "getMethod");
        runAnimators.ag$a(method3, "removeMethod");
        runAnimators.ag$a(cls, "clientProviderClass");
        runAnimators.ag$a(cls2, "serverProviderClass");
        this.ah$a = method;
        this.toString = method2;
        this.valueOf = method3;
        this.values = cls;
        this.ah$b = cls2;
    }

    @Override // o.accept.lambda1
    public void valueOf(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        runAnimators.ag$a(sSLSocket, "sslSocket");
        runAnimators.ag$a(list, "protocols");
        try {
            this.ah$a.invoke(null, sSLSocket, Proxy.newProxyInstance(accept.lambda1.class.getClassLoader(), new Class[]{this.values, this.ah$b}, new getLastInfo$ag$a(accept.lambda1.invoke.valueOf(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // o.accept.lambda1
    public void values(SSLSocket sSLSocket) {
        runAnimators.ag$a(sSLSocket, "sslSocket");
        try {
            this.valueOf.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // o.accept.lambda1
    public String valueOf(SSLSocket sSLSocket) {
        runAnimators.ag$a(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.toString.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            getLastInfo$ag$a getlastinfo_ag_a = (getLastInfo$ag$a) invocationHandler;
            if (!getlastinfo_ag_a.valueOf() && getlastinfo_ag_a.ah$a() == null) {
                accept.lambda1.ag$a(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            } else if (getlastinfo_ag_a.valueOf()) {
                return null;
            } else {
                return getlastinfo_ag_a.ah$a();
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    /* loaded from: classes5.dex */
    public static final class values {
        private values() {
        }

        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        public final accept.lambda1 ag$a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                runAnimators.ah$a(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod(ProductAction.ACTION_REMOVE, SSLSocket.class);
                runAnimators.ah$a(method, "putMethod");
                runAnimators.ah$a(method2, "getMethod");
                runAnimators.ah$a(method3, "removeMethod");
                runAnimators.ah$a(cls3, "clientProviderClass");
                runAnimators.ah$a(cls4, "serverProviderClass");
                return new getLastInfo(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }
}
