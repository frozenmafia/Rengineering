package com.app.dream11.ui.stepview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.app.dream11Pro.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class HorizontalStepsViewIndicator extends View {
    private float HaptikSDK$a;
    private int HaptikSDK$b;
    private List<Float> HaptikSDK$c;
    private float HaptikSDK$d;
    private Paint HaptikSDK$e;
    private int HaptikWebView;
    private float ICustomTabsCallback;
    private int a;
    boolean ag$a;
    private Drawable ah$a;
    private Drawable ah$b;
    private toString aj$a;
    private Path ak;
    private int ak$a;
    private int extraCallback;
    private Paint extraCallbackWithResult;
    private float getInitSettings;
    private Drawable getSignupData;
    private float invoke;
    private float isLogoutPending;
    private float onXdkEvent;
    private final String toString;
    private Paint valueOf;
    private int values;

    /* loaded from: classes3.dex */
    public interface toString {
        void ah$a();
    }

    public void setOnDrawListener(toString tostring) {
        this.aj$a = tostring;
    }

    public float ah$a() {
        return this.HaptikSDK$a;
    }

    public HorizontalStepsViewIndicator(Context context) {
        this(context, null);
    }

    public HorizontalStepsViewIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalStepsViewIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.toString = getClass().getSimpleName();
        this.values = (int) TypedValue.applyDimension(1, 36.0f, getResources().getDisplayMetrics());
        this.a = 0;
        this.ak$a = ContextCompat.getColor(getContext(), R.color.res_0x7f060530);
        this.HaptikWebView = -1;
        this.ag$a = true;
        this.ICustomTabsCallback = 1.0f;
        values();
    }

    private void values() {
        this.ak = new Path();
        this.HaptikSDK$c = new ArrayList();
        Paint paint = new Paint();
        this.extraCallbackWithResult = paint;
        paint.setAntiAlias(true);
        this.extraCallbackWithResult.setColor(this.ak$a);
        this.extraCallbackWithResult.setStyle(Paint.Style.STROKE);
        this.extraCallbackWithResult.setStrokeWidth(this.ICustomTabsCallback);
        this.extraCallbackWithResult.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.valueOf = paint2;
        paint2.setAntiAlias(true);
        this.valueOf.setColor(0);
        this.valueOf.setStyle(Paint.Style.STROKE);
        this.valueOf.setStrokeWidth(this.ICustomTabsCallback);
        this.valueOf.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.HaptikSDK$e = paint3;
        paint3.setAntiAlias(true);
        this.HaptikSDK$e.setColor(this.HaptikWebView);
        this.HaptikSDK$e.setStyle(Paint.Style.STROKE);
        this.HaptikSDK$e.setStrokeWidth(this.ICustomTabsCallback);
        this.HaptikSDK$e.setStyle(Paint.Style.FILL);
        float f = this.values;
        this.HaptikSDK$d = 0.04f * f;
        this.HaptikSDK$a = 0.19f * f;
        this.isLogoutPending = f * 0.85f;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        synchronized (this) {
            Log.i(this.toString, "onMeasure");
            if (View.MeasureSpec.getMode(i) != 0) {
                this.extraCallback = View.MeasureSpec.getSize(i);
            }
            int i3 = this.values;
            if (View.MeasureSpec.getMode(i2) != 0) {
                i3 = Math.min(i3, View.MeasureSpec.getSize(i2));
            }
            int i4 = this.a;
            setMeasuredDimension((int) (((i4 * this.HaptikSDK$a) * 2.0f) - ((i4 - 1) * this.isLogoutPending)), i3);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Log.i(this.toString, "onSizeChanged");
        this.invoke = getHeight() * 0.5f;
        getWidth();
        float f = this.invoke;
        float f2 = this.HaptikSDK$d;
        this.getInitSettings = f - f2;
        this.onXdkEvent = f + f2;
        int i5 = 0;
        while (true) {
            int i6 = this.a;
            if (i5 >= i6) {
                break;
            }
            float f3 = this.HaptikSDK$a;
            float f4 = f3 + 5.0f;
            int i7 = this.extraCallback;
            int i8 = i6 - 1;
            float f5 = i7 / i8;
            if (i5 == 0) {
                this.HaptikSDK$c.add(Float.valueOf(f4 + 0.0f));
            } else if (i5 < i8) {
                this.HaptikSDK$c.add(Float.valueOf((i7 - (f5 - f3)) - 5.0f));
            } else {
                this.HaptikSDK$c.add(Float.valueOf(i7 - f4));
            }
            this.HaptikSDK$c.get(i5).floatValue();
            i5++;
        }
        toString tostring = this.aj$a;
        if (tostring != null) {
            tostring.ah$a();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            Log.i(this.toString, "onDraw");
            toString tostring = this.aj$a;
            if (tostring != null) {
                tostring.ah$a();
            }
            this.extraCallbackWithResult.setColor(this.ak$a);
            this.HaptikSDK$e.setColor(this.HaptikWebView);
            if (!this.ag$a) {
                this.HaptikSDK$b--;
            }
            int i = 0;
            while (i < this.HaptikSDK$c.size() - 1) {
                float floatValue = this.HaptikSDK$c.get(i).floatValue();
                int i2 = i + 1;
                float floatValue2 = this.HaptikSDK$c.get(i2).floatValue();
                if (i < this.HaptikSDK$b) {
                    float f = this.HaptikSDK$a;
                    canvas.drawRect((floatValue + f) - 10.0f, this.getInitSettings, (floatValue2 - f) + 10.0f, this.onXdkEvent, this.HaptikSDK$e);
                } else {
                    this.extraCallbackWithResult.setColor(this.ak$a);
                    float f2 = this.HaptikSDK$a;
                    canvas.drawRect((floatValue + f2) - 10.0f, this.getInitSettings, (floatValue2 - f2) + 10.0f, this.onXdkEvent, this.extraCallbackWithResult);
                }
                i = i2;
            }
            if (!this.ag$a) {
                this.HaptikSDK$b++;
            }
            for (int i3 = 0; i3 < this.HaptikSDK$c.size(); i3++) {
                float floatValue3 = this.HaptikSDK$c.get(i3).floatValue();
                float f3 = this.HaptikSDK$a;
                float f4 = this.invoke;
                Rect rect = new Rect((int) (floatValue3 - f3), (int) (f4 - f3), (int) (floatValue3 + f3), (int) (f4 + f3));
                int i4 = this.HaptikSDK$b;
                if (i3 < i4) {
                    this.ah$b.setBounds(rect);
                    this.ah$b.draw(canvas);
                } else if (i3 == i4 && this.HaptikSDK$c.size() != 1) {
                    if (this.ag$a) {
                        canvas.drawCircle(floatValue3, this.invoke, this.HaptikSDK$a * 1.1f, this.valueOf);
                        this.ah$a.setBounds(rect);
                        this.ah$a.draw(canvas);
                    } else {
                        this.getSignupData.setBounds(rect);
                        this.getSignupData.draw(canvas);
                    }
                } else {
                    this.getSignupData.setBounds(rect);
                    this.getSignupData.draw(canvas);
                }
            }
        }
    }

    public List<Float> valueOf() {
        return this.HaptikSDK$c;
    }

    public void setStepNum(int i) {
        this.a = i;
        requestLayout();
    }

    public void setComplectingPosition(int i) {
        this.HaptikSDK$b = i;
    }

    public void setComplectingPosition(int i, boolean z) {
        this.HaptikSDK$b = i;
        this.ag$a = z;
    }

    public void setUnCompletedLineColor(int i) {
        this.ak$a = i;
    }

    public void setCompletedLineColor(int i) {
        this.HaptikWebView = i;
    }

    public void setDefaultIcon(Drawable drawable) {
        this.getSignupData = drawable;
    }

    public void setCompleteIcon(Drawable drawable) {
        this.ah$b = drawable;
    }

    public void setAttentionIcon(Drawable drawable) {
        this.ah$a = drawable;
    }
}
