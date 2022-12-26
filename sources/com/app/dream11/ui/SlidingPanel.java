package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import o.AnyRes;
/* loaded from: classes6.dex */
public class SlidingPanel extends LinearLayout {
    private int HaptikSDK$a;
    private View HaptikSDK$b;
    private int HaptikSDK$c;
    private GestureDetector HaptikSDK$d;
    private int HaptikSDK$e;
    private Interpolator HaptikWebView;
    private float ICustomTabsCallback;
    private boolean a;
    View.OnTouchListener ag$a;
    private Drawable ah$a;
    private int ah$b;
    private int aj$a;
    private int ak;
    private float ak$a;
    private float ak$b;
    private State extraCallback;
    private float extraCallbackWithResult;
    private values getInitSettings;
    private View getSignupData;
    private int invoke;
    private Drawable isLogoutPending;
    private valueOf onPostMessage;
    private boolean onXdkEvent;
    Runnable toString;
    private boolean valueOf;
    View.OnClickListener values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public enum State {
        ABOUT_TO_ANIMATE,
        ANIMATING,
        READY,
        TRACKING,
        FLYING
    }

    /* loaded from: classes6.dex */
    public interface valueOf {
        void ah$a(SlidingPanel slidingPanel);

        void valueOf(SlidingPanel slidingPanel);
    }

    public SlidingPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ag$a = new View.OnTouchListener() { // from class: com.app.dream11.ui.SlidingPanel.3
            int ag$a;
            int valueOf;
            boolean values;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (SlidingPanel.this.extraCallback == State.ANIMATING) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    if (SlidingPanel.this.valueOf) {
                        SlidingPanel.this.bringToFront();
                    }
                    this.valueOf = 0;
                    this.ag$a = 0;
                    if (SlidingPanel.this.HaptikSDK$b.getVisibility() == 8) {
                        if (SlidingPanel.this.ak == 1) {
                            this.ag$a = SlidingPanel.this.aj$a != 0 ? 1 : -1;
                        } else {
                            this.valueOf = SlidingPanel.this.aj$a != 2 ? 1 : -1;
                        }
                    }
                    this.values = true;
                } else {
                    if (this.values) {
                        this.valueOf *= SlidingPanel.this.HaptikSDK$c;
                        this.ag$a *= SlidingPanel.this.ah$b;
                        SlidingPanel.this.getInitSettings.toString(this.valueOf, this.ag$a);
                        this.values = false;
                        this.valueOf = -this.valueOf;
                        this.ag$a = -this.ag$a;
                    }
                    motionEvent.offsetLocation(this.valueOf, this.ag$a);
                }
                if (!SlidingPanel.this.HaptikSDK$d.onTouchEvent(motionEvent) && action == 1) {
                    SlidingPanel slidingPanel = SlidingPanel.this;
                    slidingPanel.post(slidingPanel.toString);
                }
                return false;
            }
        };
        this.values = new View.OnClickListener() { // from class: com.app.dream11.ui.SlidingPanel.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SlidingPanel.this.valueOf) {
                    SlidingPanel.this.bringToFront();
                }
                if (SlidingPanel.this.valueOf()) {
                    SlidingPanel slidingPanel = SlidingPanel.this;
                    slidingPanel.post(slidingPanel.toString);
                }
            }
        };
        this.toString = new Runnable() { // from class: com.app.dream11.ui.SlidingPanel.2
            /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 535
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.ui.SlidingPanel.AnonymousClass2.run():void");
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.SlidingPanel);
        this.invoke = obtainStyledAttributes.getInteger(0, 500);
        int i = 1;
        this.aj$a = obtainStyledAttributes.getInteger(6, 1);
        this.onXdkEvent = obtainStyledAttributes.getBoolean(4, false);
        float fraction = obtainStyledAttributes.getFraction(7, 0, 1, 0.0f);
        this.ak$b = fraction;
        if (fraction < 0.0f || fraction > 1.0f) {
            this.ak$b = 0.0f;
        }
        this.isLogoutPending = obtainStyledAttributes.getDrawable(5);
        this.ah$a = obtainStyledAttributes.getDrawable(1);
        IllegalArgumentException illegalArgumentException = null;
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        this.HaptikSDK$e = resourceId;
        if (resourceId == 0) {
            illegalArgumentException = new IllegalArgumentException(obtainStyledAttributes.getPositionDescription() + ": The handle attribute is required and must refer to a valid child.");
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
        this.HaptikSDK$a = resourceId2;
        if (resourceId2 == 0) {
            illegalArgumentException = new IllegalArgumentException(obtainStyledAttributes.getPositionDescription() + ": The content attribute is required and must refer to a valid child.");
        }
        obtainStyledAttributes.recycle();
        if (illegalArgumentException != null) {
            throw illegalArgumentException;
        }
        int i2 = this.aj$a;
        if (i2 != 0 && i2 != 1) {
            i = 0;
        }
        this.ak = i;
        setOrientation(i);
        this.extraCallback = State.READY;
        this.getInitSettings = new values();
        GestureDetector gestureDetector = new GestureDetector(this.getInitSettings);
        this.HaptikSDK$d = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        setBaselineAligned(false);
    }

    public void setOnPanelListener(valueOf valueof) {
        this.onPostMessage = valueof;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.HaptikWebView = interpolator;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(this.HaptikSDK$e);
        this.getSignupData = findViewById;
        if (findViewById == null) {
            String resourceEntryName = getResources().getResourceEntryName(this.HaptikSDK$e);
            throw new RuntimeException("Your SlidingPanel must have a child View whose id attribute is 'R.id." + resourceEntryName + "'");
        }
        findViewById.setOnTouchListener(this.ag$a);
        this.getSignupData.setOnClickListener(this.values);
        View findViewById2 = findViewById(this.HaptikSDK$a);
        this.HaptikSDK$b = findViewById2;
        if (findViewById2 == null) {
            String resourceEntryName2 = getResources().getResourceEntryName(this.HaptikSDK$e);
            throw new RuntimeException("Your SlidingPanel` must have a child View whose id attribute is 'R.id." + resourceEntryName2 + "'");
        }
        removeView(this.getSignupData);
        removeView(this.HaptikSDK$b);
        int i = this.aj$a;
        if (i == 0 || i == 2) {
            addView(this.HaptikSDK$b);
            addView(this.getSignupData);
        } else {
            addView(this.getSignupData);
            addView(this.HaptikSDK$b);
        }
        Drawable drawable = this.ah$a;
        if (drawable != null) {
            this.getSignupData.setBackgroundDrawable(drawable);
        }
        this.HaptikSDK$b.setClickable(true);
        this.HaptikSDK$b.setVisibility(8);
        if (this.ak$b > 0.0f) {
            ViewGroup.LayoutParams layoutParams = this.HaptikSDK$b.getLayoutParams();
            if (this.ak == 1) {
                layoutParams.height = -1;
            } else {
                layoutParams.width = -1;
            }
            this.HaptikSDK$b.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof FrameLayout)) {
            return;
        }
        this.valueOf = true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        View view;
        if (this.ak$b > 0.0f && this.HaptikSDK$b.getVisibility() == 0 && (view = (View) getParent()) != null) {
            if (this.ak == 1) {
                i2 = View.MeasureSpec.makeMeasureSpec((int) (view.getHeight() * this.ak$b), 1073741824);
            } else {
                i = View.MeasureSpec.makeMeasureSpec((int) (view.getWidth() * this.ak$b), 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.HaptikSDK$c = this.HaptikSDK$b.getWidth();
        this.ah$b = this.HaptikSDK$b.getHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.extraCallback == State.ABOUT_TO_ANIMATE && !this.a) {
            int i = this.ak;
            int i2 = i == 1 ? this.ah$b : this.HaptikSDK$c;
            int i3 = this.aj$a;
            if (i3 == 2 || i3 == 0) {
                i2 = -i2;
            }
            if (i == 1) {
                canvas.translate(0.0f, i2);
            } else {
                canvas.translate(i2, 0.0f);
            }
        }
        if (this.extraCallback == State.TRACKING || this.extraCallback == State.FLYING) {
            canvas.translate(this.extraCallbackWithResult, this.ak$a);
        }
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float ah$a(float f, int i, int i2) {
        return Math.min(Math.max(f, i), i2);
    }

    public boolean valueOf() {
        if (this.extraCallback != State.READY) {
            return false;
        }
        this.extraCallback = State.ABOUT_TO_ANIMATE;
        boolean z = this.HaptikSDK$b.getVisibility() == 0;
        this.a = z;
        if (!z) {
            this.HaptikSDK$b.setVisibility(0);
        }
        return true;
    }

    @Override // android.view.View
    protected void onAnimationEnd() {
        super.onAnimationEnd();
        this.extraCallback = State.READY;
        if (this.a) {
            this.HaptikSDK$b.setVisibility(8);
        }
        ah$a();
    }

    @Override // android.view.View
    protected void onAnimationStart() {
        super.onAnimationStart();
        this.extraCallback = State.ANIMATING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah$a() {
        Drawable drawable;
        Drawable drawable2;
        boolean z = this.a;
        if (z && (drawable2 = this.ah$a) != null) {
            this.getSignupData.setBackgroundDrawable(drawable2);
        } else if (!z && (drawable = this.isLogoutPending) != null) {
            this.getSignupData.setBackgroundDrawable(drawable);
        }
        ag$a();
    }

    public void ag$a() {
        valueOf valueof = this.onPostMessage;
        if (valueof != null) {
            if (this.a) {
                valueof.valueOf(this);
            } else {
                valueof.ah$a(this);
            }
        }
    }

    /* loaded from: classes6.dex */
    class values implements GestureDetector.OnGestureListener {
        float toString;
        float valueOf;

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        values() {
        }

        public void toString(int i, int i2) {
            this.toString = i;
            this.valueOf = i2;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.valueOf = 0.0f;
            this.toString = 0.0f;
            SlidingPanel.this.ag$a();
            SlidingPanel.this.valueOf();
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            SlidingPanel.this.extraCallback = State.FLYING;
            SlidingPanel slidingPanel = SlidingPanel.this;
            if (slidingPanel.ak == 1) {
                f = f2;
            }
            slidingPanel.ICustomTabsCallback = f;
            SlidingPanel slidingPanel2 = SlidingPanel.this;
            slidingPanel2.post(slidingPanel2.toString);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float ah$a;
            float f3;
            SlidingPanel.this.extraCallback = State.TRACKING;
            float f4 = 0.0f;
            if (SlidingPanel.this.ak == 1) {
                this.valueOf -= f2;
                if (SlidingPanel.this.aj$a == 0) {
                    SlidingPanel slidingPanel = SlidingPanel.this;
                    f3 = slidingPanel.ah$a(this.valueOf, -slidingPanel.ah$b, 0);
                } else {
                    SlidingPanel slidingPanel2 = SlidingPanel.this;
                    f3 = slidingPanel2.ah$a(this.valueOf, 0, slidingPanel2.ah$b);
                }
            } else {
                this.toString -= f;
                if (SlidingPanel.this.aj$a == 2) {
                    SlidingPanel slidingPanel3 = SlidingPanel.this;
                    ah$a = slidingPanel3.ah$a(this.toString, -slidingPanel3.HaptikSDK$c, 0);
                } else {
                    SlidingPanel slidingPanel4 = SlidingPanel.this;
                    ah$a = slidingPanel4.ah$a(this.toString, 0, slidingPanel4.HaptikSDK$c);
                }
                f4 = ah$a;
                f3 = 0.0f;
            }
            if (f4 != SlidingPanel.this.extraCallbackWithResult || f3 != SlidingPanel.this.ak$a) {
                SlidingPanel.this.extraCallbackWithResult = f4;
                SlidingPanel.this.ak$a = f3;
                SlidingPanel.this.invalidate();
            }
            return true;
        }
    }
}
