package o;

import android.util.Log;
/* loaded from: classes3.dex */
public interface WindowCompat$ag$a {
    public static final WindowCompat$ag$a ag$a;
    public static final WindowCompat$ag$a ah$a;
    public static final WindowCompat$ag$a toString = new WindowCompat$ag$a() { // from class: o.WindowCompat$ag$a.1
        @Override // o.WindowCompat$ag$a
        public void ag$a(Throwable th) {
        }
    };
    public static final WindowCompat$ag$a valueOf;

    void ag$a(Throwable th);

    static {
        WindowCompat$ag$a windowCompat$ag$a = new WindowCompat$ag$a() { // from class: o.WindowCompat$ag$a.3
            @Override // o.WindowCompat$ag$a
            public void ag$a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        };
        ag$a = windowCompat$ag$a;
        ah$a = new WindowCompat$ag$a() { // from class: o.WindowCompat$ag$a.5
            @Override // o.WindowCompat$ag$a
            public void ag$a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        };
        valueOf = windowCompat$ag$a;
    }
}
