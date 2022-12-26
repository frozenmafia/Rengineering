package o;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.swmansion.gesturehandler.GestureHandler;
/* loaded from: classes5.dex */
public final class Migration extends GestureHandler<Migration> {
    public static final Migration$ag$a ag$a = new Migration$ag$a(null);
    private int HaptikSDK$b;
    private float ah$b;
    private float getSignupData;
    private Handler values;
    private int invoke = 1;
    private int toString = 1;
    private final long HaptikSDK$c = 800;
    private final long HaptikSDK$a = 160;
    private final Runnable valueOf = new Runnable() { // from class: o.migrate
        @Override // java.lang.Runnable
        public final void run() {
            Migration.values(Migration.this);
        }
    };

    public final void values(int i) {
        this.invoke = i;
    }

    public final void ag$a(int i) {
        this.toString = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(Migration migration) {
        runAnimators.ag$a(migration, "this$0");
        migration.getSignupData();
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void ah$a() {
        super.ah$a();
        this.invoke = 1;
        this.toString = 1;
    }

    private final void ag$a(MotionEvent motionEvent) {
        this.ah$b = motionEvent.getRawX();
        this.getSignupData = motionEvent.getRawY();
        HaptikSDK$a();
        this.HaptikSDK$b = 1;
        Handler handler = this.values;
        if (handler == null) {
            this.values = new Handler(Looper.getMainLooper());
        } else {
            runAnimators.toString(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.values;
        runAnimators.toString(handler2);
        handler2.postDelayed(this.valueOf, this.HaptikSDK$c);
    }

    private final boolean toString(MotionEvent motionEvent) {
        if (this.HaptikSDK$b != this.invoke || (((this.toString & 1) == 0 || motionEvent.getRawX() - this.ah$b <= ((float) this.HaptikSDK$a)) && (((this.toString & 2) == 0 || this.ah$b - motionEvent.getRawX() <= ((float) this.HaptikSDK$a)) && (((this.toString & 4) == 0 || this.getSignupData - motionEvent.getRawY() <= ((float) this.HaptikSDK$a)) && ((this.toString & 8) == 0 || motionEvent.getRawY() - this.getSignupData <= ((float) this.HaptikSDK$a)))))) {
            return false;
        }
        Handler handler = this.values;
        runAnimators.toString(handler);
        handler.removeCallbacksAndMessages(null);
        ah$b();
        return true;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void valueOf(boolean z) {
        super.valueOf(z);
        HaptikWebView();
    }

    private final void valueOf(MotionEvent motionEvent) {
        if (toString(motionEvent)) {
            return;
        }
        getSignupData();
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void valueOf(MotionEvent motionEvent, MotionEvent motionEvent2) {
        runAnimators.ag$a(motionEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        runAnimators.ag$a(motionEvent2, "sourceEvent");
        int ak$a = ak$a();
        if (ak$a == 0) {
            ag$a(motionEvent2);
        }
        if (ak$a == 2) {
            toString(motionEvent2);
            if (motionEvent2.getPointerCount() > this.HaptikSDK$b) {
                this.HaptikSDK$b = motionEvent2.getPointerCount();
            }
            if (motionEvent2.getActionMasked() == 1) {
                valueOf(motionEvent2);
            }
        }
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void valueOf() {
        Handler handler = this.values;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void values() {
        Handler handler = this.values;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }
}
