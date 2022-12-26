package o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import o.ViewPropertyAnimatorListenerAdapter;
/* loaded from: classes3.dex */
public final class ViewPropertyAnimatorListenerAdapter$ag$a {
    static final int toString;
    ViewPropertyAnimatorListenerAdapter.valueOf HaptikSDK$c;
    final Context ah$a;
    ActivityManager valueOf;
    float values;
    float HaptikSDK$b = 2.0f;
    float HaptikSDK$a = 0.4f;
    float invoke = 0.33f;
    int ag$a = 4194304;

    static {
        toString = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public ViewPropertyAnimatorListenerAdapter$ag$a(Context context) {
        this.values = toString;
        this.ah$a = context;
        this.valueOf = (ActivityManager) context.getSystemService(com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
        this.HaptikSDK$c = new ViewPropertyAnimatorListenerAdapter.values(context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !ViewPropertyAnimatorListenerAdapter.values(this.valueOf)) {
            return;
        }
        this.values = 0.0f;
    }

    public ViewPropertyAnimatorListenerAdapter valueOf() {
        return new ViewPropertyAnimatorListenerAdapter(this);
    }
}
