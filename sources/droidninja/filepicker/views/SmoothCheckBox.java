package droidninja.filepicker.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Checkable;
import androidx.core.view.MotionEventCompat;
import o.MasterKey$1$HaptikSDK$c;
/* loaded from: classes5.dex */
public class SmoothCheckBox extends View implements Checkable {
    private Paint HaptikSDK$a;
    private int HaptikSDK$b;
    private float HaptikSDK$c;
    private Paint HaptikSDK$d;
    private toString HaptikSDK$e;
    private int HaptikWebView;
    private boolean a;
    private Point ag$a;
    private boolean ah$a;
    private float ah$b;
    private Path aj$a;
    private int ak;
    private int ak$a;
    private int ak$b;
    private Point[] extraCallbackWithResult;
    private float getInitSettings;
    private float getSignupData;
    private int invoke;
    private Paint isLogoutPending;
    private float onXdkEvent;
    private int values;
    private static final int valueOf = Color.parseColor("#FB4846");
    private static final int toString = Color.parseColor("#DFDFDF");

    /* loaded from: classes5.dex */
    public interface toString {
        void ah$a(SmoothCheckBox smoothCheckBox, boolean z);
    }

    public SmoothCheckBox(Context context) {
        this(context, null);
    }

    public SmoothCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SmoothCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onXdkEvent = 1.0f;
        this.HaptikSDK$c = 1.0f;
        toString(attributeSet);
    }

    private void toString(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, MasterKey$1$HaptikSDK$c.SmoothCheckBox);
        int color = obtainStyledAttributes.getColor(MasterKey$1$HaptikSDK$c.SmoothCheckBox_color_tick, -1);
        this.values = obtainStyledAttributes.getInt(MasterKey$1$HaptikSDK$c.SmoothCheckBox_duration, 300);
        this.invoke = obtainStyledAttributes.getColor(MasterKey$1$HaptikSDK$c.SmoothCheckBox_color_unchecked_stroke, toString);
        this.HaptikSDK$b = obtainStyledAttributes.getColor(MasterKey$1$HaptikSDK$c.SmoothCheckBox_color_checked, valueOf);
        this.ak$a = obtainStyledAttributes.getColor(MasterKey$1$HaptikSDK$c.SmoothCheckBox_color_unchecked, -1);
        this.ak = obtainStyledAttributes.getDimensionPixelSize(MasterKey$1$HaptikSDK$c.SmoothCheckBox_stroke_width, ag$a(getContext(), 0.0f));
        obtainStyledAttributes.recycle();
        this.HaptikWebView = this.invoke;
        Paint paint = new Paint(1);
        this.isLogoutPending = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.isLogoutPending.setStrokeCap(Paint.Cap.ROUND);
        this.isLogoutPending.setColor(color);
        Paint paint2 = new Paint(1);
        this.HaptikSDK$a = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.HaptikSDK$a.setColor(this.invoke);
        Paint paint3 = new Paint(1);
        this.HaptikSDK$d = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.HaptikSDK$d.setColor(this.HaptikSDK$b);
        this.aj$a = new Path();
        this.ag$a = new Point();
        Point[] pointArr = new Point[3];
        this.extraCallbackWithResult = pointArr;
        pointArr[0] = new Point();
        this.extraCallbackWithResult[1] = new Point();
        this.extraCallbackWithResult[2] = new Point();
        setOnClickListener(new View.OnClickListener() { // from class: droidninja.filepicker.views.SmoothCheckBox.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SmoothCheckBox.this.toggle();
                SmoothCheckBox.this.a = false;
                SmoothCheckBox.this.ah$b = 0.0f;
                if (SmoothCheckBox.this.isChecked()) {
                    SmoothCheckBox.this.values();
                } else {
                    SmoothCheckBox.this.HaptikSDK$a();
                }
            }
        });
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("InstanceState", super.onSaveInstanceState());
        bundle.putBoolean("InstanceState", isChecked());
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            setChecked(bundle.getBoolean("InstanceState"));
            super.onRestoreInstanceState(bundle.getParcelable("InstanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.ah$a;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.ah$a = z;
        valueOf();
        invalidate();
        toString tostring = this.HaptikSDK$e;
        if (tostring != null) {
            tostring.ah$a(this, this.ah$a);
        }
    }

    public void setChecked(boolean z, boolean z2) {
        if (z2) {
            this.a = false;
            this.ah$a = z;
            this.ah$b = 0.0f;
            if (z) {
                values();
            } else {
                HaptikSDK$a();
            }
            toString tostring = this.HaptikSDK$e;
            if (tostring != null) {
                tostring.ah$a(this, this.ah$a);
                return;
            }
            return;
        }
        setChecked(z);
    }

    private void valueOf() {
        this.a = true;
        this.HaptikSDK$c = 1.0f;
        this.onXdkEvent = isChecked() ? 0.0f : 1.0f;
        this.invoke = isChecked() ? this.HaptikSDK$b : this.HaptikWebView;
        this.ah$b = isChecked() ? this.getInitSettings + this.getSignupData : 0.0f;
    }

    private int values(int i) {
        int ag$a = ag$a(getContext(), 25.0f);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            return Math.min(ag$a, size);
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(values(i), values(i2));
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.ak$b = getMeasuredWidth();
        int i5 = this.ak;
        if (i5 == 0) {
            i5 = getMeasuredWidth() / 10;
        }
        this.ak = i5;
        int measuredWidth = i5 > getMeasuredWidth() / 5 ? getMeasuredWidth() / 5 : this.ak;
        this.ak = measuredWidth;
        if (measuredWidth < 3) {
            measuredWidth = 3;
        }
        this.ak = measuredWidth;
        this.ag$a.x = this.ak$b / 2;
        this.ag$a.y = getMeasuredHeight() / 2;
        this.extraCallbackWithResult[0].x = Math.round((getMeasuredWidth() / 30.0f) * 7.0f);
        this.extraCallbackWithResult[0].y = Math.round((getMeasuredHeight() / 30.0f) * 14.0f);
        this.extraCallbackWithResult[1].x = Math.round((getMeasuredWidth() / 30.0f) * 13.0f);
        this.extraCallbackWithResult[1].y = Math.round((getMeasuredHeight() / 30.0f) * 20.0f);
        this.extraCallbackWithResult[2].x = Math.round((getMeasuredWidth() / 30.0f) * 22.0f);
        this.extraCallbackWithResult[2].y = Math.round((getMeasuredHeight() / 30.0f) * 10.0f);
        this.getInitSettings = (float) Math.sqrt(Math.pow(this.extraCallbackWithResult[1].x - this.extraCallbackWithResult[0].x, 2.0d) + Math.pow(this.extraCallbackWithResult[1].y - this.extraCallbackWithResult[0].y, 2.0d));
        this.getSignupData = (float) Math.sqrt(Math.pow(this.extraCallbackWithResult[2].x - this.extraCallbackWithResult[1].x, 2.0d) + Math.pow(this.extraCallbackWithResult[2].y - this.extraCallbackWithResult[1].y, 2.0d));
        this.isLogoutPending.setStrokeWidth(this.ak);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        ah$a(canvas);
        ag$a(canvas);
        valueOf(canvas);
    }

    private void ag$a(Canvas canvas) {
        this.HaptikSDK$d.setColor(this.ak$a);
        canvas.drawCircle(this.ag$a.x, this.ag$a.y, (this.ag$a.x - this.ak) * this.onXdkEvent, this.HaptikSDK$d);
    }

    private void ah$a(Canvas canvas) {
        this.HaptikSDK$a.setColor(this.invoke);
        canvas.drawCircle(this.ag$a.x, this.ag$a.y, this.ag$a.x * this.HaptikSDK$c, this.HaptikSDK$a);
    }

    private void valueOf(Canvas canvas) {
        if (this.a && isChecked()) {
            values(canvas);
        }
    }

    private void values(Canvas canvas) {
        this.aj$a.reset();
        float f = this.ah$b;
        if (f < this.getInitSettings) {
            float f2 = this.ak$b / 20.0f;
            this.ah$b = f + (f2 >= 3.0f ? f2 : 3.0f);
            float f3 = ((this.extraCallbackWithResult[1].x - this.extraCallbackWithResult[0].x) * this.ah$b) / this.getInitSettings;
            float f4 = ((this.extraCallbackWithResult[1].y - this.extraCallbackWithResult[0].y) * this.ah$b) / this.getInitSettings;
            this.aj$a.moveTo(this.extraCallbackWithResult[0].x, this.extraCallbackWithResult[0].y);
            this.aj$a.lineTo(this.extraCallbackWithResult[0].x + f3, this.extraCallbackWithResult[0].y + f4);
            canvas.drawPath(this.aj$a, this.isLogoutPending);
            float f5 = this.ah$b;
            float f6 = this.getInitSettings;
            if (f5 > f6) {
                this.ah$b = f6;
            }
        } else {
            this.aj$a.moveTo(this.extraCallbackWithResult[0].x, this.extraCallbackWithResult[0].y);
            this.aj$a.lineTo(this.extraCallbackWithResult[1].x, this.extraCallbackWithResult[1].y);
            canvas.drawPath(this.aj$a, this.isLogoutPending);
            if (this.ah$b < this.getInitSettings + this.getSignupData) {
                float f7 = ((this.extraCallbackWithResult[2].x - this.extraCallbackWithResult[1].x) * (this.ah$b - this.getInitSettings)) / this.getSignupData;
                float f8 = ((this.extraCallbackWithResult[1].y - this.extraCallbackWithResult[2].y) * (this.ah$b - this.getInitSettings)) / this.getSignupData;
                this.aj$a.reset();
                this.aj$a.moveTo(this.extraCallbackWithResult[1].x, this.extraCallbackWithResult[1].y);
                this.aj$a.lineTo(this.extraCallbackWithResult[1].x + f7, this.extraCallbackWithResult[1].y - f8);
                canvas.drawPath(this.aj$a, this.isLogoutPending);
                int i = this.ak$b / 20;
                this.ah$b += i >= 3 ? i : 3.0f;
            } else {
                this.aj$a.reset();
                this.aj$a.moveTo(this.extraCallbackWithResult[1].x, this.extraCallbackWithResult[1].y);
                this.aj$a.lineTo(this.extraCallbackWithResult[2].x, this.extraCallbackWithResult[2].y);
                canvas.drawPath(this.aj$a, this.isLogoutPending);
            }
        }
        if (this.ah$b < this.getInitSettings + this.getSignupData) {
            postDelayed(new Runnable() { // from class: droidninja.filepicker.views.SmoothCheckBox.5
                @Override // java.lang.Runnable
                public void run() {
                    SmoothCheckBox.this.postInvalidate();
                }
            }, 10L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void values() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration((this.values / 3) * 2);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: droidninja.filepicker.views.SmoothCheckBox.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmoothCheckBox.this.onXdkEvent = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SmoothCheckBox smoothCheckBox = SmoothCheckBox.this;
                smoothCheckBox.invoke = SmoothCheckBox.valueOf(smoothCheckBox.ak$a, SmoothCheckBox.this.HaptikSDK$b, 1.0f - SmoothCheckBox.this.onXdkEvent);
                SmoothCheckBox.this.postInvalidate();
            }
        });
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
        ofFloat2.setDuration(this.values);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: droidninja.filepicker.views.SmoothCheckBox.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmoothCheckBox.this.HaptikSDK$c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SmoothCheckBox.this.postInvalidate();
            }
        });
        ofFloat2.start();
        ah$a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HaptikSDK$a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(this.values);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: droidninja.filepicker.views.SmoothCheckBox.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmoothCheckBox.this.onXdkEvent = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SmoothCheckBox smoothCheckBox = SmoothCheckBox.this;
                smoothCheckBox.invoke = SmoothCheckBox.valueOf(smoothCheckBox.HaptikSDK$b, SmoothCheckBox.toString, SmoothCheckBox.this.onXdkEvent);
                SmoothCheckBox.this.postInvalidate();
            }
        });
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
        ofFloat2.setDuration(this.values);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: droidninja.filepicker.views.SmoothCheckBox.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmoothCheckBox.this.HaptikSDK$c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SmoothCheckBox.this.postInvalidate();
            }
        });
        ofFloat2.start();
    }

    private void ah$a() {
        postDelayed(new Runnable() { // from class: droidninja.filepicker.views.SmoothCheckBox.10
            @Override // java.lang.Runnable
            public void run() {
                SmoothCheckBox.this.a = true;
                SmoothCheckBox.this.postInvalidate();
            }
        }, this.values);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int valueOf(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(255, (int) ((((i & 16711680) >> 16) * f2) + (((16711680 & i2) >> 16) * f)), (int) ((((i & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8) * f2) + (((65280 & i2) >> 8) * f)), (int) (((i & 255) * f2) + ((i2 & 255) * f)));
    }

    public void setOnCheckedChangeListener(toString tostring) {
        this.HaptikSDK$e = tostring;
    }

    public int ag$a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
