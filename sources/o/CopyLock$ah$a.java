package o;

import android.view.MotionEvent;
import com.swmansion.gesturehandler.GestureHandler;
/* loaded from: classes5.dex */
public interface CopyLock$ah$a {

    /* loaded from: classes5.dex */
    public static final class values {
        public static boolean ah$a(CopyLock$ah$a copyLock$ah$a) {
            runAnimators.ag$a(copyLock$ah$a, "this");
            return false;
        }

        public static boolean ah$a(CopyLock$ah$a copyLock$ah$a, GestureHandler<?> gestureHandler) {
            runAnimators.ag$a(copyLock$ah$a, "this");
            runAnimators.ag$a(gestureHandler, "handler");
            return false;
        }

        public static void toString(CopyLock$ah$a copyLock$ah$a, MotionEvent motionEvent) {
            runAnimators.ag$a(copyLock$ah$a, "this");
            runAnimators.ag$a(motionEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        }

        public static boolean toString(CopyLock$ah$a copyLock$ah$a) {
            runAnimators.ag$a(copyLock$ah$a, "this");
            return false;
        }

        public static void valueOf(CopyLock$ah$a copyLock$ah$a, MotionEvent motionEvent) {
            runAnimators.ag$a(copyLock$ah$a, "this");
            runAnimators.ag$a(motionEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        }
    }

    boolean ag$a();

    boolean ag$a(GestureHandler<?> gestureHandler);

    void ah$a(MotionEvent motionEvent);

    boolean ah$a();

    boolean valueOf();

    void values(MotionEvent motionEvent);
}
