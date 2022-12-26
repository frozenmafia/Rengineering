package o;

import android.view.MotionEvent;
/* loaded from: classes5.dex */
public final class countItems {
    public static final countItems values = new countItems();

    private countItems() {
    }

    public final float ag$a(MotionEvent motionEvent, boolean z) {
        runAnimators.ag$a(motionEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (z) {
            float f = 0.0f;
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                if (i2 != actionIndex) {
                    f += motionEvent.getX(i2);
                    i++;
                }
            }
            return f / i;
        }
        int pointerCount2 = motionEvent.getPointerCount() - 1;
        if (pointerCount2 == actionIndex) {
            pointerCount2--;
        }
        return motionEvent.getX(pointerCount2);
    }

    public final float valueOf(MotionEvent motionEvent, boolean z) {
        runAnimators.ag$a(motionEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (z) {
            float f = 0.0f;
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                if (i2 != actionIndex) {
                    f += motionEvent.getY(i2);
                    i++;
                }
            }
            return f / i;
        }
        int pointerCount2 = motionEvent.getPointerCount() - 1;
        if (pointerCount2 == actionIndex) {
            pointerCount2--;
        }
        return motionEvent.getY(pointerCount2);
    }
}
