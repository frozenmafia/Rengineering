package com.app.dream11.ui.createteamprogressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.app.dream11Pro.R;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AnyRes;
import o.getM;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class CreateTeamStepper extends View {
    private Paint HaptikSDK$a;
    private float HaptikSDK$b;
    private boolean HaptikSDK$c;
    private TextPaint HaptikSDK$d;
    private float HaptikSDK$e;
    private float HaptikWebView;
    private int ag$a;
    private int ah$a;
    private int ah$b;
    private float ak;
    private Path getInitSettings;
    private int getSignupData;
    private boolean invoke;
    private float toString;
    public Map<Integer, View> valueOf;
    private int values;

    public final void setActive(boolean z) {
        this.invoke = z;
        valueOf();
        values();
        invalidate();
    }

    private final void ag$a(float f) {
        this.HaptikSDK$e = f;
        this.HaptikSDK$b = 0 - f;
    }

    public final void setValue(int i) {
        this.getSignupData = i;
        invalidate();
    }

    private final void valueOf(float f) {
        this.HaptikWebView = f;
        valueOf();
        values();
        invalidate();
    }

    public final void setActiveColor(int i) {
        this.values = i;
    }

    public final void setInactiveColor(int i) {
        this.ag$a = i;
    }

    public final void setInactiveTextColor(int i) {
        this.ah$b = i;
    }

    public final void setActiveTextColor(int i) {
        this.ah$a = i;
    }

    public final void setNumberToBeShown(boolean z) {
        this.HaptikSDK$c = z;
        values();
        invalidate();
    }

    public CreateTeamStepper(Context context, boolean z, int i, int i2, int i3, int i4, int i5, boolean z2, float f, float f2) {
        super(context);
        this.valueOf = new LinkedHashMap();
        this.getInitSettings = new Path();
        this.toString = -1.0f;
        this.ak = -1.0f;
        this.HaptikSDK$e = -1.0f;
        this.HaptikSDK$b = -1.0f;
        this.getSignupData = 1;
        this.values = -1;
        this.ag$a = -1;
        this.ah$b = -1;
        this.ah$a = -1;
        valueOf();
        values();
        setActive(z);
        this.values = i;
        this.ag$a = i2;
        setValue(i3);
        setNumberToBeShown(z2);
        this.ah$b = i4;
        this.ah$a = i5;
        ag$a(f);
        valueOf(f2);
    }

    public CreateTeamStepper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.valueOf = new LinkedHashMap();
        this.getInitSettings = new Path();
        this.toString = -1.0f;
        this.ak = -1.0f;
        this.HaptikSDK$e = -1.0f;
        this.HaptikSDK$b = -1.0f;
        this.getSignupData = 1;
        this.values = -1;
        this.ag$a = -1;
        this.ah$b = -1;
        this.ah$a = -1;
        valueOf();
        values();
        runAnimators.toString(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CreateTeamStepper);
        runAnimators.ah$a(obtainStyledAttributes, "context!!.obtainStyledAt…leable.CreateTeamStepper)");
        try {
            this.values = obtainStyledAttributes.getColor(0, ContextCompat.getColor(context, R.color.res_0x7f0600b6));
            this.ag$a = obtainStyledAttributes.getColor(3, ContextCompat.getColor(context, 17170451));
            setNumberToBeShown(obtainStyledAttributes.getBoolean(5, false));
            setActive(obtainStyledAttributes.getBoolean(4, false));
            setValue(obtainStyledAttributes.getInt(1, 0));
            valueOf(obtainStyledAttributes.getDimension(2, 30.0f));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public CreateTeamStepper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.valueOf = new LinkedHashMap();
        this.getInitSettings = new Path();
        this.toString = -1.0f;
        this.ak = -1.0f;
        this.HaptikSDK$e = -1.0f;
        this.HaptikSDK$b = -1.0f;
        this.getSignupData = 1;
        this.values = -1;
        this.ag$a = -1;
        this.ah$b = -1;
        this.ah$a = -1;
        valueOf();
        values();
    }

    private final void valueOf() {
        Paint paint = new Paint();
        this.HaptikSDK$a = paint;
        paint.setStrokeWidth(40.0f);
        Paint paint2 = null;
        if (this.invoke) {
            Paint paint3 = this.HaptikSDK$a;
            if (paint3 == null) {
                runAnimators.valueOf("parallelogramPaint");
                paint3 = null;
            }
            paint3.setColor(this.values);
        } else {
            Paint paint4 = this.HaptikSDK$a;
            if (paint4 == null) {
                runAnimators.valueOf("parallelogramPaint");
                paint4 = null;
            }
            paint4.setColor(this.ag$a);
        }
        Paint paint5 = this.HaptikSDK$a;
        if (paint5 == null) {
            runAnimators.valueOf("parallelogramPaint");
            paint5 = null;
        }
        paint5.setStyle(Paint.Style.FILL);
        Paint paint6 = this.HaptikSDK$a;
        if (paint6 == null) {
            runAnimators.valueOf("parallelogramPaint");
            paint6 = null;
        }
        paint6.setDither(true);
        Paint paint7 = this.HaptikSDK$a;
        if (paint7 == null) {
            runAnimators.valueOf("parallelogramPaint");
        } else {
            paint2 = paint7;
        }
        paint2.setAntiAlias(true);
    }

    private final void values() {
        this.HaptikSDK$d = new TextPaint();
        if (this.HaptikWebView == 0.0f) {
            float f = this.toString;
            valueOf(f > 0.0f ? f - getResources().getDimension(R.dimen.margin_10dp) : getResources().getDimension(R.dimen.res_0x7f0705c8));
        }
        TextPaint textPaint = this.HaptikSDK$d;
        TextPaint textPaint2 = null;
        if (textPaint == null) {
            runAnimators.valueOf("textPaint");
            textPaint = null;
        }
        textPaint.setTextSize(this.HaptikWebView);
        TextPaint textPaint3 = this.HaptikSDK$d;
        if (textPaint3 == null) {
            runAnimators.valueOf("textPaint");
            textPaint3 = null;
        }
        textPaint3.setTextAlign(Paint.Align.CENTER);
        try {
            TextPaint textPaint4 = this.HaptikSDK$d;
            if (textPaint4 == null) {
                runAnimators.valueOf("textPaint");
                textPaint4 = null;
            }
            textPaint4.setTypeface(getM.toString(getContext(), getContext().getString(R.string.res_0x7f12000d)));
        } catch (Exception unused) {
            TextPaint textPaint5 = this.HaptikSDK$d;
            if (textPaint5 == null) {
                runAnimators.valueOf("textPaint");
                textPaint5 = null;
            }
            textPaint5.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
        if (this.HaptikSDK$c) {
            if (this.invoke) {
                TextPaint textPaint6 = this.HaptikSDK$d;
                if (textPaint6 == null) {
                    runAnimators.valueOf("textPaint");
                } else {
                    textPaint2 = textPaint6;
                }
                textPaint2.setColor(this.ah$a);
                return;
            }
            TextPaint textPaint7 = this.HaptikSDK$d;
            if (textPaint7 == null) {
                runAnimators.valueOf("textPaint");
            } else {
                textPaint2 = textPaint7;
            }
            textPaint2.setColor(this.ah$b);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.toString = getHeight();
        this.ak = getWidth();
        values();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.getInitSettings.reset();
        this.getInitSettings.rMoveTo(this.HaptikSDK$e, 0.0f);
        this.getInitSettings.rLineTo(this.HaptikSDK$b, this.toString);
        this.getInitSettings.rLineTo(this.ak - this.HaptikSDK$e, 0.0f);
        this.getInitSettings.rLineTo(this.HaptikSDK$e, 0 - this.toString);
        this.getInitSettings.close();
        runAnimators.toString(canvas);
        Path path = this.getInitSettings;
        Paint paint = this.HaptikSDK$a;
        TextPaint textPaint = null;
        if (paint == null) {
            runAnimators.valueOf("parallelogramPaint");
            paint = null;
        }
        canvas.drawPath(path, paint);
        if (this.HaptikSDK$c) {
            float f = this.ak / 2;
            float f2 = this.HaptikWebView;
            int i = this.getSignupData;
            TextPaint textPaint2 = this.HaptikSDK$d;
            if (textPaint2 == null) {
                runAnimators.valueOf("textPaint");
            } else {
                textPaint = textPaint2;
            }
            canvas.drawText(String.valueOf(i), f, f2, textPaint);
        }
    }
}
