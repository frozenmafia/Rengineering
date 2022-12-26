package o;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.swmansion.gesturehandler.GestureHandler;
/* loaded from: classes5.dex */
public final class readColumns extends GestureHandler<readColumns> {
    public static final values ag$a = new values(null);
    private float HaptikSDK$b;
    private float a;
    private float ah$b;
    private float aj$a;
    private int ak;
    private float getSignupData;
    private float isLogoutPending;
    private Handler values;
    private float HaptikSDK$a = Float.MIN_VALUE;
    private float invoke = Float.MIN_VALUE;
    private float HaptikSDK$e = Float.MIN_VALUE;
    private long HaptikSDK$d = 500;
    private long HaptikSDK$c = 200;
    private int HaptikWebView = 1;
    private int getInitSettings = 1;
    private int toString = 1;
    private final Runnable valueOf = new Runnable() { // from class: o.reThrow
        @Override // java.lang.Runnable
        public final void run() {
            readColumns.toString(readColumns.this);
        }
    };

    public readColumns() {
        HaptikSDK$b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toString(readColumns readcolumns) {
        runAnimators.ag$a(readcolumns, "this$0");
        readcolumns.getSignupData();
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void ah$a() {
        super.ah$a();
        this.HaptikSDK$a = Float.MIN_VALUE;
        this.invoke = Float.MIN_VALUE;
        this.HaptikSDK$e = Float.MIN_VALUE;
        this.HaptikSDK$d = 500L;
        this.HaptikSDK$c = 200L;
        this.HaptikWebView = 1;
        this.getInitSettings = 1;
    }

    public final readColumns values(int i) {
        readColumns readcolumns = this;
        readcolumns.HaptikWebView = i;
        return readcolumns;
    }

    public final readColumns ah$a(long j) {
        readColumns readcolumns = this;
        readcolumns.HaptikSDK$c = j;
        return readcolumns;
    }

    public final readColumns valueOf(long j) {
        readColumns readcolumns = this;
        readcolumns.HaptikSDK$d = j;
        return readcolumns;
    }

    public final readColumns ag$a(float f) {
        readColumns readcolumns = this;
        readcolumns.HaptikSDK$a = f;
        return readcolumns;
    }

    public final readColumns toString(float f) {
        readColumns readcolumns = this;
        readcolumns.invoke = f;
        return readcolumns;
    }

    public final readColumns values(float f) {
        readColumns readcolumns = this;
        readcolumns.HaptikSDK$e = f * f;
        return readcolumns;
    }

    public final readColumns ag$a(int i) {
        readColumns readcolumns = this;
        readcolumns.getInitSettings = i;
        return readcolumns;
    }

    private final void newSession() {
        Handler handler = this.values;
        if (handler == null) {
            this.values = new Handler(Looper.getMainLooper());
        } else {
            runAnimators.toString(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.values;
        runAnimators.toString(handler2);
        handler2.postDelayed(this.valueOf, this.HaptikSDK$d);
    }

    private final void extraCommand() {
        Handler handler = this.values;
        if (handler == null) {
            this.values = new Handler(Looper.getMainLooper());
        } else {
            runAnimators.toString(handler);
            handler.removeCallbacksAndMessages(null);
        }
        int i = this.ak + 1;
        this.ak = i;
        if (i == this.HaptikWebView && this.toString >= this.getInitSettings) {
            ah$b();
            return;
        }
        Handler handler2 = this.values;
        runAnimators.toString(handler2);
        handler2.postDelayed(this.valueOf, this.HaptikSDK$c);
    }

    private final boolean receiveFile() {
        float f = (this.ah$b - this.aj$a) + this.getSignupData;
        if ((this.HaptikSDK$a == Float.MIN_VALUE) || Math.abs(f) <= this.HaptikSDK$a) {
            float f2 = (this.HaptikSDK$b - this.isLogoutPending) + this.a;
            if ((this.invoke == Float.MIN_VALUE) || Math.abs(f2) <= this.invoke) {
                float f3 = this.HaptikSDK$e;
                return !((f3 > Float.MIN_VALUE ? 1 : (f3 == Float.MIN_VALUE ? 0 : -1)) == 0) && (f2 * f2) + (f * f) > f3;
            }
            return true;
        }
        return true;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void valueOf(MotionEvent motionEvent, MotionEvent motionEvent2) {
        runAnimators.ag$a(motionEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        runAnimators.ag$a(motionEvent2, "sourceEvent");
        int ak$a = ak$a();
        int actionMasked = motionEvent2.getActionMasked();
        if (ak$a == 0) {
            this.getSignupData = 0.0f;
            this.a = 0.0f;
            this.aj$a = countItems.values.ag$a(motionEvent2, true);
            this.isLogoutPending = countItems.values.valueOf(motionEvent2, true);
        }
        if (actionMasked == 5 || actionMasked == 6) {
            this.getSignupData += this.ah$b - this.aj$a;
            this.a += this.HaptikSDK$b - this.isLogoutPending;
            this.ah$b = countItems.values.ag$a(motionEvent2, true);
            float valueOf = countItems.values.valueOf(motionEvent2, true);
            this.HaptikSDK$b = valueOf;
            this.aj$a = this.ah$b;
            this.isLogoutPending = valueOf;
        } else {
            this.ah$b = countItems.values.ag$a(motionEvent2, true);
            this.HaptikSDK$b = countItems.values.valueOf(motionEvent2, true);
        }
        if (this.toString < motionEvent2.getPointerCount()) {
            this.toString = motionEvent2.getPointerCount();
        }
        if (receiveFile()) {
            getSignupData();
        } else if (ak$a == 0) {
            if (actionMasked == 0) {
                HaptikSDK$a();
            }
            newSession();
        } else if (ak$a == 2) {
            if (actionMasked == 0) {
                newSession();
            } else if (actionMasked != 1) {
            } else {
                extraCommand();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void valueOf(boolean z) {
        super.valueOf(z);
        HaptikWebView();
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
        this.ak = 0;
        this.toString = 0;
        Handler handler = this.values;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    /* loaded from: classes5.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }
    }
}
