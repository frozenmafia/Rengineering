package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.swmansion.gesturehandler.GestureHandler;
/* loaded from: classes5.dex */
public final class DBUtil extends GestureHandler<DBUtil> {
    public static final toString ag$a = new toString(null);
    private final float HaptikSDK$c;
    private Handler HaptikWebView;
    private float ICustomTabsCallback$Default;
    private float aj$a;
    private float ak;
    private float ak$a;
    private float extraCallbackWithResult;
    private boolean invoke;
    private float isLogoutPending;
    private float onMessageChannelReady;
    private float onNavigationEvent;
    private float onPostMessage;
    private VelocityTracker onRelationshipValidationResult;
    private long toString;
    private float HaptikSDK$a = Float.MAX_VALUE;
    private float valueOf = Float.MIN_VALUE;
    private float getInitSettings = Float.MIN_VALUE;
    private float getSignupData = Float.MAX_VALUE;
    private float HaptikSDK$b = Float.MAX_VALUE;
    private float ah$b = Float.MIN_VALUE;
    private float HaptikSDK$e = Float.MIN_VALUE;
    private float HaptikSDK$d = Float.MAX_VALUE;
    private float extraCallback = Float.MAX_VALUE;
    private float ak$b = Float.MAX_VALUE;
    private float ICustomTabsCallback = Float.MAX_VALUE;
    private int a = 1;
    private int onXdkEvent = 10;
    private final Runnable values = new Runnable() { // from class: o.findColumnIndexBySuffix
        @Override // java.lang.Runnable
        public final void run() {
            DBUtil.ah$a(DBUtil.this);
        }
    };

    public DBUtil(Context context) {
        this.ak = Float.MIN_VALUE;
        runAnimators.toString(context);
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        float f = scaledTouchSlop * scaledTouchSlop;
        this.HaptikSDK$c = f;
        this.ak = f;
    }

    public final float newSession() {
        return this.onNavigationEvent;
    }

    public final float newSessionWithExtras() {
        return this.onMessageChannelReady;
    }

    public final float extraCommand() {
        return (this.aj$a - this.onPostMessage) + this.ak$a;
    }

    public final float receiveFile() {
        return (this.isLogoutPending - this.ICustomTabsCallback$Default) + this.extraCallbackWithResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ah$a(DBUtil dBUtil) {
        runAnimators.ag$a(dBUtil, "this$0");
        dBUtil.ah$b();
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void ah$a() {
        super.ah$a();
        this.HaptikSDK$a = Float.MAX_VALUE;
        this.valueOf = Float.MIN_VALUE;
        this.getInitSettings = Float.MIN_VALUE;
        this.getSignupData = Float.MAX_VALUE;
        this.HaptikSDK$b = Float.MAX_VALUE;
        this.ah$b = Float.MIN_VALUE;
        this.HaptikSDK$e = Float.MIN_VALUE;
        this.HaptikSDK$d = Float.MAX_VALUE;
        this.extraCallback = Float.MAX_VALUE;
        this.ak$b = Float.MAX_VALUE;
        this.ICustomTabsCallback = Float.MAX_VALUE;
        this.ak = this.HaptikSDK$c;
        this.a = 1;
        this.onXdkEvent = 10;
        this.toString = 0L;
        this.invoke = false;
    }

    public final DBUtil valueOf(float f) {
        DBUtil dBUtil = this;
        dBUtil.HaptikSDK$a = f;
        return dBUtil;
    }

    public final DBUtil ah$a(float f) {
        DBUtil dBUtil = this;
        dBUtil.valueOf = f;
        return dBUtil;
    }

    public final DBUtil HaptikSDK$c(float f) {
        DBUtil dBUtil = this;
        dBUtil.getInitSettings = f;
        return dBUtil;
    }

    public final DBUtil ag$a(float f) {
        DBUtil dBUtil = this;
        dBUtil.getSignupData = f;
        return dBUtil;
    }

    public final DBUtil toString(float f) {
        DBUtil dBUtil = this;
        dBUtil.HaptikSDK$b = f;
        return dBUtil;
    }

    public final DBUtil values(float f) {
        DBUtil dBUtil = this;
        dBUtil.ah$b = f;
        return dBUtil;
    }

    public final DBUtil HaptikSDK$a(float f) {
        DBUtil dBUtil = this;
        dBUtil.HaptikSDK$e = f;
        return dBUtil;
    }

    public final DBUtil ah$b(float f) {
        DBUtil dBUtil = this;
        dBUtil.HaptikSDK$d = f;
        return dBUtil;
    }

    public final DBUtil invoke(float f) {
        DBUtil dBUtil = this;
        dBUtil.ak = f * f;
        return dBUtil;
    }

    public final DBUtil values(int i) {
        DBUtil dBUtil = this;
        dBUtil.a = i;
        return dBUtil;
    }

    public final DBUtil ag$a(int i) {
        DBUtil dBUtil = this;
        dBUtil.onXdkEvent = i;
        return dBUtil;
    }

    public final DBUtil HaptikSDK$a(boolean z) {
        DBUtil dBUtil = this;
        dBUtil.invoke = z;
        return dBUtil;
    }

    public final DBUtil ag$a(long j) {
        DBUtil dBUtil = this;
        dBUtil.toString = j;
        return dBUtil;
    }

    public final DBUtil HaptikSDK$b(float f) {
        DBUtil dBUtil = this;
        dBUtil.ICustomTabsCallback = f * f;
        return dBUtil;
    }

    public final DBUtil HaptikWebView(float f) {
        DBUtil dBUtil = this;
        dBUtil.extraCallback = f;
        return dBUtil;
    }

    public final DBUtil getSignupData(float f) {
        DBUtil dBUtil = this;
        dBUtil.ak$b = f;
        return dBUtil;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x008c, code lost:
        if ((0.0f <= r1 && r1 <= r0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00af, code lost:
        if ((0.0f <= r5 && r5 <= r0) != false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean mayLaunchUrl() {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DBUtil.mayLaunchUrl():boolean");
    }

    private final boolean postMessage() {
        float f = (this.aj$a - this.onPostMessage) + this.ak$a;
        float f2 = (this.isLogoutPending - this.ICustomTabsCallback$Default) + this.extraCallbackWithResult;
        if (this.toString > 0 && (f * f) + (f2 * f2) > this.HaptikSDK$c) {
            Handler handler = this.HaptikWebView;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            return true;
        }
        float f3 = this.getInitSettings;
        if ((f3 == Float.MIN_VALUE) || f >= f3) {
            float f4 = this.getSignupData;
            if ((f4 == Float.MAX_VALUE) || f <= f4) {
                float f5 = this.HaptikSDK$e;
                if ((f5 == Float.MIN_VALUE) || f2 >= f5) {
                    float f6 = this.HaptikSDK$d;
                    return !((f6 > Float.MAX_VALUE ? 1 : (f6 == Float.MAX_VALUE ? 0 : -1)) == 0) && f2 > f6;
                }
                return true;
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
        if (actionMasked == 5 || actionMasked == 6) {
            this.ak$a += this.aj$a - this.onPostMessage;
            this.extraCallbackWithResult += this.isLogoutPending - this.ICustomTabsCallback$Default;
            this.aj$a = countItems.values.ag$a(motionEvent2, this.invoke);
            float valueOf = countItems.values.valueOf(motionEvent2, this.invoke);
            this.isLogoutPending = valueOf;
            this.onPostMessage = this.aj$a;
            this.ICustomTabsCallback$Default = valueOf;
        } else {
            this.aj$a = countItems.values.ag$a(motionEvent2, this.invoke);
            this.isLogoutPending = countItems.values.valueOf(motionEvent2, this.invoke);
        }
        if (ak$a == 0 && motionEvent2.getPointerCount() >= this.a) {
            ICustomTabsService();
            this.ak$a = 0.0f;
            this.extraCallbackWithResult = 0.0f;
            this.onNavigationEvent = 0.0f;
            this.onMessageChannelReady = 0.0f;
            VelocityTracker obtain = VelocityTracker.obtain();
            this.onRelationshipValidationResult = obtain;
            ag$a.values(obtain, motionEvent2);
            HaptikSDK$a();
            if (this.toString > 0) {
                if (this.HaptikWebView == null) {
                    this.HaptikWebView = new Handler(Looper.getMainLooper());
                }
                Handler handler = this.HaptikWebView;
                runAnimators.toString(handler);
                handler.postDelayed(this.values, this.toString);
            }
        } else {
            VelocityTracker velocityTracker = this.onRelationshipValidationResult;
            if (velocityTracker != null) {
                ag$a.values(velocityTracker, motionEvent2);
                VelocityTracker velocityTracker2 = this.onRelationshipValidationResult;
                runAnimators.toString(velocityTracker2);
                velocityTracker2.computeCurrentVelocity(1000);
                VelocityTracker velocityTracker3 = this.onRelationshipValidationResult;
                runAnimators.toString(velocityTracker3);
                this.onNavigationEvent = velocityTracker3.getXVelocity();
                VelocityTracker velocityTracker4 = this.onRelationshipValidationResult;
                runAnimators.toString(velocityTracker4);
                this.onMessageChannelReady = velocityTracker4.getYVelocity();
            }
        }
        if (actionMasked == 1) {
            if (ak$a == 4) {
                HaptikWebView();
            } else {
                getSignupData();
            }
        } else if (actionMasked == 5 && motionEvent2.getPointerCount() > this.onXdkEvent) {
            if (ak$a == 4) {
                HaptikSDK$b();
            } else {
                getSignupData();
            }
        } else if (actionMasked == 6 && ak$a == 4 && motionEvent2.getPointerCount() < this.a) {
            getSignupData();
        } else if (ak$a == 2) {
            if (postMessage()) {
                getSignupData();
            } else if (mayLaunchUrl()) {
                ah$b();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void valueOf(boolean z) {
        if (ak$a() != 4) {
            ICustomTabsService();
        }
        super.valueOf(z);
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void valueOf() {
        Handler handler = this.HaptikWebView;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void values() {
        Handler handler = this.HaptikWebView;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        VelocityTracker velocityTracker = this.onRelationshipValidationResult;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.recycle();
        this.onRelationshipValidationResult = null;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void ICustomTabsService() {
        this.onPostMessage = this.aj$a;
        this.ICustomTabsCallback$Default = this.isLogoutPending;
    }

    /* loaded from: classes5.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void values(VelocityTracker velocityTracker, MotionEvent motionEvent) {
            float rawX = motionEvent.getRawX() - motionEvent.getX();
            float rawY = motionEvent.getRawY() - motionEvent.getY();
            motionEvent.offsetLocation(rawX, rawY);
            runAnimators.toString(velocityTracker);
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
        }
    }
}
