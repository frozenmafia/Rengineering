package o;
/* loaded from: classes4.dex */
public final class access$handleDestroy {
    public static final void values(String str) {
        runAnimators.ag$a(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        LifecycleController.ag$a.ag$a(str);
    }

    public static final void ag$a(String str, Throwable th) {
        runAnimators.ag$a(th, "throwable");
        LifecycleController.ag$a.values(str, th);
    }
}
