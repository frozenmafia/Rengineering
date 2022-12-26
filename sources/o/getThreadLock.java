package o;

import android.view.MotionEvent;
import com.swmansion.gesturehandler.GestureHandler;
/* loaded from: classes5.dex */
public final class getThreadLock extends GestureHandler<getThreadLock> {
    @Override // com.swmansion.gesturehandler.GestureHandler
    public void valueOf(MotionEvent motionEvent, MotionEvent motionEvent2) {
        runAnimators.ag$a(motionEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        runAnimators.ag$a(motionEvent2, "sourceEvent");
        if (ak$a() == 0) {
            HaptikSDK$a();
        }
    }
}
