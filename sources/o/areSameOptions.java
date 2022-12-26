package o;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import o.AudioManagerCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class areSameOptions {
    private AudioManagerCompat.Api28Impl HaptikSDK$a;
    private VelocityTracker HaptikSDK$b;
    private float HaptikSDK$c;
    private final ScaleGestureDetector ah$a;
    private final float ah$b;
    private final float invoke;
    private boolean toString;
    private float valueOf;
    private int ag$a = -1;
    private int values = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public areSameOptions(Context context, AudioManagerCompat.Api28Impl api28Impl) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.ah$b = viewConfiguration.getScaledMinimumFlingVelocity();
        this.invoke = viewConfiguration.getScaledTouchSlop();
        this.HaptikSDK$a = api28Impl;
        this.ah$a = new ScaleGestureDetector(context, new ScaleGestureDetector.OnScaleGestureListener() { // from class: o.areSameOptions.4
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                if (scaleFactor >= 0.0f) {
                    areSameOptions.this.HaptikSDK$a.ah$a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    return true;
                }
                return true;
            }
        });
    }

    private float values(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.values);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    private float valueOf(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.values);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    public boolean ag$a() {
        return this.ah$a.isInProgress();
    }

    public boolean valueOf() {
        return this.toString;
    }

    public boolean ah$a(MotionEvent motionEvent) {
        try {
            this.ah$a.onTouchEvent(motionEvent);
            return toString(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    private boolean toString(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.ag$a = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.HaptikSDK$b = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            this.valueOf = values(motionEvent);
            this.HaptikSDK$c = valueOf(motionEvent);
            this.toString = false;
        } else if (action == 1) {
            this.ag$a = -1;
            if (this.toString && this.HaptikSDK$b != null) {
                this.valueOf = values(motionEvent);
                this.HaptikSDK$c = valueOf(motionEvent);
                this.HaptikSDK$b.addMovement(motionEvent);
                this.HaptikSDK$b.computeCurrentVelocity(1000);
                float xVelocity = this.HaptikSDK$b.getXVelocity();
                float yVelocity = this.HaptikSDK$b.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.ah$b) {
                    this.HaptikSDK$a.toString(this.valueOf, this.HaptikSDK$c, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker = this.HaptikSDK$b;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.HaptikSDK$b = null;
            }
        } else if (action == 2) {
            float values = values(motionEvent);
            float valueOf = valueOf(motionEvent);
            float f = values - this.valueOf;
            float f2 = valueOf - this.HaptikSDK$c;
            if (!this.toString) {
                this.toString = Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.invoke);
            }
            if (this.toString) {
                this.HaptikSDK$a.toString(f, f2);
                this.valueOf = values;
                this.HaptikSDK$c = valueOf;
                VelocityTracker velocityTracker2 = this.HaptikSDK$b;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.ag$a = -1;
            VelocityTracker velocityTracker3 = this.HaptikSDK$b;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.HaptikSDK$b = null;
            }
        } else if (action == 6) {
            int ag$a = onLoadItem.ag$a(motionEvent.getAction());
            if (motionEvent.getPointerId(ag$a) == this.ag$a) {
                int i = ag$a == 0 ? 1 : 0;
                this.ag$a = motionEvent.getPointerId(i);
                this.valueOf = motionEvent.getX(i);
                this.HaptikSDK$c = motionEvent.getY(i);
            }
        }
        int i2 = this.ag$a;
        this.values = motionEvent.findPointerIndex(i2 != -1 ? i2 : 0);
        return true;
    }
}
