package o;

import android.net.Uri;
/* loaded from: classes6.dex */
public class setExitAnimationOrder extends setSpecialEffectsControllerFactory {
    private static volatile setExitAnimationOrder ah$a;
    private Uri values;

    public static setExitAnimationOrder values() {
        if (isStateAtLeast.values(setExitAnimationOrder.class)) {
            return null;
        }
        try {
            if (ah$a == null) {
                synchronized (setExitAnimationOrder.class) {
                    if (ah$a == null) {
                        ah$a = new setExitAnimationOrder();
                    }
                }
            }
            return ah$a;
        } catch (Throwable th) {
            isStateAtLeast.values(th, setExitAnimationOrder.class);
            return null;
        }
    }

    public void valueOf(Uri uri) {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            this.values = uri;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }
}
