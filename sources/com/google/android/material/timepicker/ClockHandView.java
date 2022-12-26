package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;
import o.Preference;
import o.Preference$BaseSavedState$HaptikSDK$e;
import o.Preference$BaseSavedState$ah$a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class ClockHandView extends View {
    private float HaptikSDK$a;
    private final List<ClockHandView$ah$a> HaptikSDK$b;
    private float HaptikSDK$c;
    private final Paint HaptikSDK$d;
    private ValueAnimator HaptikSDK$e;
    private float HaptikWebView;
    private final int a;
    private double ag$a;
    private boolean ah$a;
    private boolean ah$b;
    private final RectF getInitSettings;
    private int getSignupData;
    private valueOf invoke;
    private final int isLogoutPending;
    private boolean toString;
    private int valueOf;
    private final float values;

    /* loaded from: classes7.dex */
    public interface valueOf {
        void toString(float f, boolean z);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Preference.BaseSavedState.values.materialClockStyle);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.HaptikSDK$b = new ArrayList();
        Paint paint = new Paint();
        this.HaptikSDK$d = paint;
        this.getInitSettings = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Preference.BaseSavedState.getSignupData.ClockHandView, i, Preference$BaseSavedState$HaptikSDK$e.Widget_MaterialComponents_TimePicker_Clock);
        this.valueOf = obtainStyledAttributes.getDimensionPixelSize(Preference.BaseSavedState.getSignupData.ClockHandView_materialCircleRadius, 0);
        this.a = obtainStyledAttributes.getDimensionPixelSize(Preference.BaseSavedState.getSignupData.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.isLogoutPending = resources.getDimensionPixelSize(Preference$BaseSavedState$ah$a.material_clock_hand_stroke_width);
        this.values = resources.getDimensionPixelSize(Preference$BaseSavedState$ah$a.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(Preference.BaseSavedState.getSignupData.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.getSignupData = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.setImportantForAccessibility(this, 2);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setHandRotation(ag$a());
    }

    public void setHandRotation(float f) {
        setHandRotation(f, false);
    }

    public void setHandRotation(float f, boolean z) {
        ValueAnimator valueAnimator = this.HaptikSDK$e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            valueOf(f, false);
            return;
        }
        Pair<Float, Float> ag$a = ag$a(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ag$a.first).floatValue(), ((Float) ag$a.second).floatValue());
        this.HaptikSDK$e = ofFloat;
        ofFloat.setDuration(200L);
        this.HaptikSDK$e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.ClockHandView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.this.valueOf(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        this.HaptikSDK$e.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.timepicker.ClockHandView.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
        this.HaptikSDK$e.start();
    }

    private Pair<Float, Float> ag$a(float f) {
        float ag$a = ag$a();
        if (Math.abs(ag$a - f) > 180.0f) {
            if (ag$a > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (ag$a < 180.0f && f > 180.0f) {
                ag$a += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(ag$a), Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void valueOf(float f, boolean z) {
        float f2 = f % 360.0f;
        this.HaptikWebView = f2;
        this.ag$a = Math.toRadians(f2 - 90.0f);
        float width = (getWidth() / 2) + (this.valueOf * ((float) Math.cos(this.ag$a)));
        float height = (getHeight() / 2) + (this.valueOf * ((float) Math.sin(this.ag$a)));
        RectF rectF = this.getInitSettings;
        float f3 = this.a;
        rectF.set(width - f3, height - f3, width + f3, height + f3);
        for (ClockHandView$ah$a clockHandView$ah$a : this.HaptikSDK$b) {
            clockHandView$ah$a.valueOf(f2, z);
        }
        invalidate();
    }

    public void setAnimateOnTouchUp(boolean z) {
        this.ah$a = z;
    }

    public void valueOf(ClockHandView$ah$a clockHandView$ah$a) {
        this.HaptikSDK$b.add(clockHandView$ah$a);
    }

    public void setOnActionUpListener(valueOf valueof) {
        this.invoke = valueof;
    }

    public float ag$a() {
        return this.HaptikWebView;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ah$a(canvas);
    }

    private void ah$a(Canvas canvas) {
        int width;
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f = height;
        this.HaptikSDK$d.setStrokeWidth(0.0f);
        canvas.drawCircle((this.valueOf * ((float) Math.cos(this.ag$a))) + width2, (this.valueOf * ((float) Math.sin(this.ag$a))) + f, this.a, this.HaptikSDK$d);
        double sin = Math.sin(this.ag$a);
        double cos = Math.cos(this.ag$a);
        this.HaptikSDK$d.setStrokeWidth(this.isLogoutPending);
        canvas.drawLine(width2, f, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.HaptikSDK$d);
        canvas.drawCircle(width2, f, this.values, this.HaptikSDK$d);
    }

    public RectF valueOf() {
        return this.getInitSettings;
    }

    public int ah$a() {
        return this.a;
    }

    public void setCircleRadius(int i) {
        this.valueOf = i;
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        valueOf valueof;
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.HaptikSDK$a);
                int i2 = (int) (y - this.HaptikSDK$c);
                this.ah$b = (i * i) + (i2 * i2) > this.getSignupData;
                z4 = this.toString;
                z = actionMasked == 1;
            } else {
                z = false;
                z4 = false;
            }
            z2 = z4;
            z3 = false;
        } else {
            this.HaptikSDK$a = x;
            this.HaptikSDK$c = y;
            this.ah$b = true;
            this.toString = false;
            z = false;
            z2 = false;
            z3 = true;
        }
        boolean ah$a = ah$a(x, y, z2, z3, z) | this.toString;
        this.toString = ah$a;
        if (ah$a && z && (valueof = this.invoke) != null) {
            valueof.toString(valueOf(x, y), this.ah$b);
        }
        return true;
    }

    private boolean ah$a(float f, float f2, boolean z, boolean z2, boolean z3) {
        float valueOf2 = valueOf(f, f2);
        boolean z4 = false;
        boolean z5 = ag$a() != valueOf2;
        if (z2 && z5) {
            return true;
        }
        if (z5 || z) {
            if (z3 && this.ah$a) {
                z4 = true;
            }
            setHandRotation(valueOf2, z4);
            return true;
        }
        return false;
    }

    private int valueOf(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }
}
