package o;
/* loaded from: classes3.dex */
public final class setOnReceiveContentListener implements setImportantForAccessibility {
    public static final setOnReceiveContentListener ah$a = new setOnReceiveContentListener();

    private setOnReceiveContentListener() {
    }

    @Override // o.setImportantForAccessibility
    public void ag$a(String str) {
        runAnimators.valueOf(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        setImportantForAccessibility$ah$a.values(this, str);
    }

    @Override // o.setImportantForAccessibility
    public void ag$a(String str, Throwable th) {
        runAnimators.valueOf(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        runAnimators.valueOf(th, "throwable");
        setImportantForAccessibility$ah$a.toString(this, str, th);
    }

    @Override // o.setImportantForAccessibility
    public void ah$a(String str) {
        runAnimators.valueOf(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        runAnimators.valueOf(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
    }

    @Override // o.setImportantForAccessibility
    public void toString(String str, Throwable th) {
        runAnimators.valueOf(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        runAnimators.valueOf(th, "throwable");
        setImportantForAccessibility$ah$a.values(this, str, th);
    }

    @Override // o.setImportantForAccessibility
    public void valueOf(String str) {
        runAnimators.valueOf(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        setImportantForAccessibility$ah$a.valueOf(this, str);
    }

    @Override // o.setImportantForAccessibility
    public void valueOf(String str, Throwable th) {
        runAnimators.valueOf(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        runAnimators.valueOf(th, "throwable");
        setImportantForAccessibility$ah$a.valueOf(this, str, th);
    }

    @Override // o.setImportantForAccessibility
    public void values(String str) {
        runAnimators.valueOf(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        runAnimators.valueOf(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
    }
}
