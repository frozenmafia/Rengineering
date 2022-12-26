package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.swmansion.gesturehandler.GestureHandler;
/* loaded from: classes5.dex */
public final class unlock extends GestureHandler<unlock> {
    public static final toString ag$a = new toString(null);
    private float HaptikSDK$a;
    private long HaptikSDK$b;
    private long HaptikSDK$c;
    private float ah$b;
    private long invoke;
    private float toString;
    private Handler valueOf;
    private final float values;

    public unlock(Context context) {
        runAnimators.ag$a(context, "context");
        this.invoke = 500L;
        HaptikSDK$b(true);
        float f = context.getResources().getDisplayMetrics().density * 10.0f;
        float f2 = f * f;
        this.values = f2;
        this.toString = f2;
    }

    public final void ah$a(long j) {
        this.invoke = j;
    }

    public final int extraCommand() {
        return (int) (this.HaptikSDK$c - this.HaptikSDK$b);
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void ah$a() {
        super.ah$a();
        this.invoke = 500L;
        this.toString = this.values;
    }

    public final unlock toString(float f) {
        this.toString = f * f;
        return this;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void valueOf(MotionEvent motionEvent, MotionEvent motionEvent2) {
        runAnimators.ag$a(motionEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        runAnimators.ag$a(motionEvent2, "sourceEvent");
        if (ak$a() == 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.HaptikSDK$c = uptimeMillis;
            this.HaptikSDK$b = uptimeMillis;
            HaptikSDK$a();
            this.ah$b = motionEvent2.getRawX();
            this.HaptikSDK$a = motionEvent2.getRawY();
            Handler handler = new Handler(Looper.getMainLooper());
            this.valueOf = handler;
            int i = (this.invoke > 0L ? 1 : (this.invoke == 0L ? 0 : -1));
            if (i > 0) {
                runAnimators.toString(handler);
                handler.postDelayed(new Runnable() { // from class: o.CursorUtil
                    @Override // java.lang.Runnable
                    public final void run() {
                        unlock.ag$a(unlock.this);
                    }
                }, this.invoke);
            } else if (i == 0) {
                ah$b();
            }
        }
        if (motionEvent2.getActionMasked() == 1) {
            Handler handler2 = this.valueOf;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                this.valueOf = null;
            }
            if (ak$a() == 4) {
                HaptikWebView();
                return;
            } else {
                getSignupData();
                return;
            }
        }
        float rawX = motionEvent2.getRawX() - this.ah$b;
        float rawY = motionEvent2.getRawY() - this.HaptikSDK$a;
        if ((rawX * rawX) + (rawY * rawY) > this.toString) {
            if (ak$a() == 4) {
                HaptikSDK$b();
            } else {
                getSignupData();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ag$a(unlock unlockVar) {
        runAnimators.ag$a(unlockVar, "this$0");
        unlockVar.ah$b();
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void toString(int i, int i2) {
        Handler handler = this.valueOf;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.valueOf = null;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void valueOf(int i, int i2) {
        this.HaptikSDK$c = SystemClock.uptimeMillis();
        super.valueOf(i, i2);
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void ah$a(MotionEvent motionEvent) {
        runAnimators.ag$a(motionEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        this.HaptikSDK$c = SystemClock.uptimeMillis();
        super.ah$a(motionEvent);
    }

    /* loaded from: classes5.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }
    }
}
