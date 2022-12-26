package o;

import android.os.Build;
import android.view.View;
/* loaded from: classes4.dex */
class hasDuplicatedItems {
    hasDuplicatedItems() {
    }

    public static void valueOf(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            toString(view, runnable);
        } else {
            view.postDelayed(runnable, 16L);
        }
    }

    private static void toString(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
