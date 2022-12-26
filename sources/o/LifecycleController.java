package o;
/* loaded from: classes4.dex */
public final class LifecycleController {
    public static final LifecycleController ag$a = new LifecycleController();
    private static String ah$a = "LogHelper";

    private final void ag$a(int i, String str, Throwable th) {
    }

    private LifecycleController() {
    }

    public final void ag$a(String str) {
        runAnimators.ag$a(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        ag$a(4, str, null);
    }

    public final void values(String str, Throwable th) {
        runAnimators.ag$a(th, "throwable");
        ag$a(6, str, th);
    }
}
