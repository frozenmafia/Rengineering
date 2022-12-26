package com.app.dream11.ui;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.app.dream11.ui.DreamSlantProgressbar;
import com.app.dream11Pro.R;
import o.AnyRes;
/* loaded from: classes3.dex */
public class DreamSlantProgressbar extends SlantView {
    private static int toString = 200;
    private int HaptikSDK$a;
    private int HaptikSDK$b;
    private Paint HaptikSDK$c;
    private int ah$a;
    private int ah$b;
    private SlantView getInitSettings;
    private Paint invoke;
    private int valueOf;
    private ValueAnimator values;

    public DreamSlantProgressbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.HaptikSDK$c = new Paint(1);
        this.invoke = new Paint(1);
        valueOf(context, attributeSet);
        valueOf(context);
    }

    private void valueOf(Context context) {
        SlantView slantView = (SlantView) LayoutInflater.from(context).inflate(R.layout.res_0x7f0d0191, (ViewGroup) this, false);
        this.getInitSettings = slantView;
        addView(slantView);
        this.invoke.setColor(this.valueOf);
        setAngle(this.HaptikSDK$b);
        setPaint(this.invoke);
    }

    private void valueOf(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.DreamSlantProgressbar);
        try {
            try {
                this.ah$b = obtainStyledAttributes.getColor(2, ContextCompat.getColor(context, R.color.res_0x7f060325));
                this.ah$a = obtainStyledAttributes.getColor(1, ContextCompat.getColor(context, R.color.res_0x7f060314));
                this.valueOf = obtainStyledAttributes.getColor(0, ContextCompat.getColor(context, R.color.res_0x7f060513));
                this.HaptikSDK$b = obtainStyledAttributes.getInteger(3, 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(final int i) {
        post(new Runnable() { // from class: o.pushDynamicShortcut
            @Override // java.lang.Runnable
            public final void run() {
                DreamSlantProgressbar.this.values(i);
            }
        });
    }

    public /* synthetic */ void values(int i) {
        int valueOf = valueOf(i);
        values(valueOf, i);
        valueOf();
        toString(valueOf);
    }

    private void values(int i, int i2) {
        Shader ah$a = ah$a(i, i2);
        this.HaptikSDK$c.setStrokeWidth(getResources().getDimension(R.dimen.res_0x7f070530));
        this.HaptikSDK$c.setShader(ah$a);
        this.getInitSettings.setPaint(this.HaptikSDK$c);
    }

    private void valueOf() {
        this.getInitSettings.setAngle(this.HaptikSDK$b);
    }

    private int valueOf(int i) {
        int measuredWidth = getMeasuredWidth();
        this.HaptikSDK$a = measuredWidth;
        return (measuredWidth * i) / 100;
    }

    private Shader ah$a(int i, int i2) {
        float f = i / 2;
        return new LinearGradient(getMeasuredHeight() / 2, getMeasuredHeight() / 2, f, f, this.ah$b, valueOf(i2), Shader.TileMode.CLAMP);
    }

    public int valueOf(float f) {
        return ((Integer) new ArgbEvaluator().evaluate(f / 100.0f, Integer.valueOf(this.ah$b), Integer.valueOf(this.ah$a))).intValue();
    }

    private void toString(int i) {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i);
        this.values = ofInt;
        ofInt.setDuration(toString);
        this.values.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.app.dream11.ui.DreamSlantProgressbar.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                DreamSlantProgressbar.this.ag$a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.values.start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag$a(int i) {
        ViewGroup.LayoutParams layoutParams = this.getInitSettings.getLayoutParams();
        layoutParams.width = i;
        this.getInitSettings.setLayoutParams(layoutParams);
    }

    public static void setProgress(DreamSlantProgressbar dreamSlantProgressbar, int i) {
        if (dreamSlantProgressbar != null) {
            dreamSlantProgressbar.setProgress(i);
        }
    }
}
