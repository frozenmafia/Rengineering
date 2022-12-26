package o;

import o.Styleable;
/* loaded from: classes5.dex */
public final class setTranslate {
    public static /* synthetic */ Thread ag$a(boolean z, boolean z2, ClassLoader classLoader, String str, int i, Styleable.ArcMotion arcMotion, int i2, Object obj) {
        return toString((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : classLoader, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? -1 : i, arcMotion);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.setTranslate$ag$a] */
    public static final Thread toString(boolean z, boolean z2, ClassLoader classLoader, String str, int i, final Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        runAnimators.ag$a(arcMotion, "block");
        ?? r0 = new Thread() { // from class: o.setTranslate$ag$a
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                arcMotion.invoke();
            }
        };
        if (z2) {
            r0.setDaemon(true);
        }
        if (i > 0) {
            r0.setPriority(i);
        }
        if (str != null) {
            r0.setName(str);
        }
        if (classLoader != null) {
            r0.setContextClassLoader(classLoader);
        }
        if (z) {
            r0.start();
        }
        return (Thread) r0;
    }
}
