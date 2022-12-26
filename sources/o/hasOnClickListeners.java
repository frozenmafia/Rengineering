package o;

import android.util.Log;
/* loaded from: classes3.dex */
public final class hasOnClickListeners implements setImportantForAccessibility {
    public static final hasOnClickListeners ag$a = new hasOnClickListeners();

    private hasOnClickListeners() {
    }

    @Override // o.setImportantForAccessibility
    public void ag$a(String str) {
        runAnimators.valueOf(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        Log.e("Bugsnag", str);
    }

    @Override // o.setImportantForAccessibility
    public void ag$a(String str, Throwable th) {
        runAnimators.valueOf(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        runAnimators.valueOf(th, "throwable");
        Log.e("Bugsnag", str, th);
    }

    @Override // o.setImportantForAccessibility
    public void ah$a(String str) {
        runAnimators.valueOf(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        Log.w("Bugsnag", str);
    }

    @Override // o.setImportantForAccessibility
    public void toString(String str, Throwable th) {
        runAnimators.valueOf(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        runAnimators.valueOf(th, "throwable");
        Log.w("Bugsnag", str, th);
    }

    @Override // o.setImportantForAccessibility
    public void values(String str) {
        runAnimators.valueOf(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        Log.i("Bugsnag", str);
    }

    @Override // o.setImportantForAccessibility
    public void valueOf(String str) {
        runAnimators.valueOf(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        Log.d("Bugsnag", str);
    }

    @Override // o.setImportantForAccessibility
    public void valueOf(String str, Throwable th) {
        runAnimators.valueOf(str, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        runAnimators.valueOf(th, "throwable");
        Log.d("Bugsnag", str, th);
    }
}
