package o;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import o.countItemsBefore;
import sun.misc.Unsafe;
/* loaded from: classes5.dex */
final class countItemsBefore$HaptikSDK$b extends countItemsBefore.toString {
    static final long HaptikSDK$c;
    static final long ag$a;
    static final long ah$a;
    static final long toString;
    static final Unsafe valueOf;
    static final long values;

    private countItemsBefore$HaptikSDK$b() {
        super();
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: o.countItemsBefore$HaptikSDK$b.5
                    @Override // java.security.PrivilegedExceptionAction
                    /* renamed from: valueOf */
                    public Unsafe run() throws Exception {
                        Field[] declaredFields;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                ag$a = unsafe.objectFieldOffset(countItemsBefore.class.getDeclaredField("invoke"));
                values = unsafe.objectFieldOffset(countItemsBefore.class.getDeclaredField("ah$a"));
                toString = unsafe.objectFieldOffset(countItemsBefore.class.getDeclaredField("HaptikSDK$a"));
                HaptikSDK$c = unsafe.objectFieldOffset(countItemsBefore.HaptikWebView.class.getDeclaredField("toString"));
                ah$a = unsafe.objectFieldOffset(countItemsBefore.HaptikWebView.class.getDeclaredField("values"));
                valueOf = unsafe;
            } catch (Exception e) {
                onDispatchFirstPass.ag$a(e);
                throw new RuntimeException(e);
            }
        } catch (PrivilegedActionException e2) {
            throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // o.countItemsBefore.toString
    void values(countItemsBefore.HaptikWebView haptikWebView, Thread thread) {
        valueOf.putObject(haptikWebView, HaptikSDK$c, thread);
    }

    @Override // o.countItemsBefore.toString
    void valueOf(countItemsBefore.HaptikWebView haptikWebView, countItemsBefore.HaptikWebView haptikWebView2) {
        valueOf.putObject(haptikWebView, ah$a, haptikWebView2);
    }

    @Override // o.countItemsBefore.toString
    boolean values(countItemsBefore<?> countitemsbefore, countItemsBefore.HaptikWebView haptikWebView, countItemsBefore.HaptikWebView haptikWebView2) {
        return valueOf.compareAndSwapObject(countitemsbefore, ag$a, haptikWebView, haptikWebView2);
    }

    @Override // o.countItemsBefore.toString
    boolean valueOf(countItemsBefore<?> countitemsbefore, countItemsBefore$ah$a countitemsbefore_ah_a, countItemsBefore$ah$a countitemsbefore_ah_a2) {
        return valueOf.compareAndSwapObject(countitemsbefore, values, countitemsbefore_ah_a, countitemsbefore_ah_a2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.countItemsBefore.toString
    public boolean ah$a(countItemsBefore<?> countitemsbefore, Object obj, Object obj2) {
        return valueOf.compareAndSwapObject(countitemsbefore, toString, obj, obj2);
    }
}
