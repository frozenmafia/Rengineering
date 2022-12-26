package o;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
/* loaded from: classes5.dex */
public class FtsTableInfo {
    private float HaptikSDK$a;
    private float HaptikSDK$b;
    private long HaptikSDK$c;
    private float HaptikSDK$d;
    private boolean HaptikSDK$e;
    private GestureDetector HaptikWebView;
    private float a;
    private float ag$a;
    private int ah$a;
    private float ah$b;
    private final toString aj$a;
    private float ak;
    private boolean ak$a;
    private boolean ak$b;
    private int extraCallback;
    private long extraCallbackWithResult;
    private final Handler getInitSettings;
    private float getSignupData;
    private boolean invoke;
    private int isLogoutPending;
    private float onXdkEvent;
    private final Context toString;
    private float valueOf;
    private float values;

    /* loaded from: classes5.dex */
    public interface toString {
        boolean ag$a(FtsTableInfo ftsTableInfo);

        void ah$a(FtsTableInfo ftsTableInfo);

        boolean toString(FtsTableInfo ftsTableInfo);
    }

    public FtsTableInfo(Context context, toString tostring) {
        this(context, tostring, null);
    }

    public FtsTableInfo(Context context, toString tostring, Handler handler) {
        this.ah$a = 0;
        this.toString = context;
        this.aj$a = tostring;
        this.extraCallback = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.isLogoutPending = 0;
        this.getInitSettings = handler;
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i > 18) {
            valueOf(true);
        }
        if (i > 22) {
            ah$a(true);
        }
    }

    public boolean ag$a(MotionEvent motionEvent) {
        float f;
        float f2;
        this.HaptikSDK$c = motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.ak$a) {
            this.HaptikWebView.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z = (motionEvent.getButtonState() & 32) != 0;
        boolean z2 = this.ah$a == 2 && !z;
        boolean z3 = actionMasked == 1 || actionMasked == 3 || z2;
        float f3 = 0.0f;
        if (actionMasked == 0 || z3) {
            if (this.HaptikSDK$e) {
                this.aj$a.ah$a(this);
                this.HaptikSDK$e = false;
                this.getSignupData = 0.0f;
                this.ah$a = 0;
            } else if (HaptikSDK$a() && z3) {
                this.HaptikSDK$e = false;
                this.getSignupData = 0.0f;
                this.ah$a = 0;
            }
            if (z3) {
                return true;
            }
        }
        if (!this.HaptikSDK$e && this.ak$b && !HaptikSDK$a() && !z3 && z) {
            this.ag$a = motionEvent.getX();
            this.valueOf = motionEvent.getY();
            this.ah$a = 2;
            this.getSignupData = 0.0f;
        }
        boolean z4 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z2;
        boolean z5 = actionMasked == 6;
        int actionIndex = z5 ? motionEvent.getActionIndex() : -1;
        int i = z5 ? pointerCount - 1 : pointerCount;
        if (HaptikSDK$a()) {
            f2 = this.ag$a;
            f = this.valueOf;
            if (motionEvent.getY() < f) {
                this.invoke = true;
            } else {
                this.invoke = false;
            }
        } else {
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                if (actionIndex != i2) {
                    f4 += motionEvent.getX(i2);
                    f5 += motionEvent.getY(i2);
                }
            }
            float f6 = i;
            float f7 = f4 / f6;
            f = f5 / f6;
            f2 = f7;
        }
        float f8 = 0.0f;
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (actionIndex != i3) {
                f3 += Math.abs(motionEvent.getX(i3) - f2);
                f8 += Math.abs(motionEvent.getY(i3) - f);
            }
        }
        float f9 = i;
        float f10 = (f3 / f9) * 2.0f;
        float f11 = (f8 / f9) * 2.0f;
        float hypot = HaptikSDK$a() ? f11 : (float) Math.hypot(f10, f11);
        boolean z6 = this.HaptikSDK$e;
        this.ah$b = f2;
        this.HaptikSDK$d = f;
        if (!HaptikSDK$a() && this.HaptikSDK$e && (hypot < this.isLogoutPending || z4)) {
            this.aj$a.ah$a(this);
            this.HaptikSDK$e = false;
            this.getSignupData = hypot;
        }
        if (z4) {
            this.HaptikSDK$a = f10;
            this.ak = f10;
            this.HaptikSDK$b = f11;
            this.a = f11;
            this.values = hypot;
            this.onXdkEvent = hypot;
            this.getSignupData = hypot;
        }
        int i4 = HaptikSDK$a() ? this.extraCallback : this.isLogoutPending;
        if (!this.HaptikSDK$e && hypot >= i4 && (z6 || Math.abs(hypot - this.getSignupData) > this.extraCallback)) {
            this.HaptikSDK$a = f10;
            this.ak = f10;
            this.HaptikSDK$b = f11;
            this.a = f11;
            this.values = hypot;
            this.onXdkEvent = hypot;
            this.extraCallbackWithResult = this.HaptikSDK$c;
            this.HaptikSDK$e = this.aj$a.toString(this);
        }
        if (actionMasked == 2) {
            this.HaptikSDK$a = f10;
            this.HaptikSDK$b = f11;
            this.values = hypot;
            if (this.HaptikSDK$e ? this.aj$a.ag$a(this) : true) {
                this.ak = this.HaptikSDK$a;
                this.a = this.HaptikSDK$b;
                this.onXdkEvent = this.values;
                this.extraCallbackWithResult = this.HaptikSDK$c;
            }
        }
        return true;
    }

    private boolean HaptikSDK$a() {
        return this.ah$a != 0;
    }

    public void valueOf(boolean z) {
        this.ak$a = z;
        if (z && this.HaptikWebView == null) {
            this.HaptikWebView = new GestureDetector(this.toString, new GestureDetector.SimpleOnGestureListener() { // from class: o.FtsTableInfo.2
                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                public boolean onDoubleTap(MotionEvent motionEvent) {
                    FtsTableInfo.this.ag$a = motionEvent.getX();
                    FtsTableInfo.this.valueOf = motionEvent.getY();
                    FtsTableInfo.this.ah$a = 1;
                    return true;
                }
            }, this.getInitSettings);
        }
    }

    public void ah$a(boolean z) {
        this.ak$b = z;
    }

    public float valueOf() {
        return this.ah$b;
    }

    public float ah$a() {
        return this.HaptikSDK$d;
    }

    public float values() {
        return this.values;
    }

    public float ag$a() {
        if (HaptikSDK$a()) {
            boolean z = this.invoke;
            boolean z2 = (z && this.values < this.onXdkEvent) || (!z && this.values > this.onXdkEvent);
            float abs = Math.abs(1.0f - (this.values / this.onXdkEvent)) * 0.5f;
            if (this.onXdkEvent <= this.extraCallback) {
                return 1.0f;
            }
            return z2 ? 1.0f + abs : 1.0f - abs;
        }
        float f = this.onXdkEvent;
        if (f > 0.0f) {
            return this.values / f;
        }
        return 1.0f;
    }

    public long HaptikSDK$b() {
        return this.HaptikSDK$c - this.extraCallbackWithResult;
    }
}
