package com.dream11.design.button.loadingbutton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import java.util.LinkedHashMap;
import java.util.Map;
import o.resolveLeftShadow;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class DotView extends View {
    private float ag$a;
    private AnimationSet ah$a;
    private final int toString;
    public Map<Integer, View> valueOf;
    private final Paint values;

    public final void setRadius(float f) {
        this.ag$a = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotView(Context context, float f, int i) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.valueOf = new LinkedHashMap();
        this.values = new Paint();
        this.ag$a = 12.0f;
        this.toString = resolveLeftShadow.values(4);
        this.ag$a = f;
        ag$a(i);
    }

    private final void ag$a(int i) {
        this.values.setColor(i);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        runAnimators.ag$a(canvas, "canvas");
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        canvas.drawCircle(paddingLeft + ((width - (paddingRight + paddingLeft)) / 2), paddingTop + ((height - (getPaddingBottom() + paddingTop)) / 2), this.ag$a, this.values);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = (int) (this.ag$a * 2);
        setMeasuredDimension(this.toString + i3, i3);
    }

    public final void valueOf(long j) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f, 1.0f);
        alphaAnimation.setRepeatCount(-1);
        alphaAnimation.setRepeatMode(2);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(j);
        animationSet.setFillAfter(true);
        this.ah$a = animationSet;
    }

    public final void toString(long j) {
        AnimationSet animationSet = this.ah$a;
        AnimationSet animationSet2 = null;
        if (animationSet == null) {
            runAnimators.valueOf("scaleUpAnimationSet");
            animationSet = null;
        }
        animationSet.setStartTime(j);
        AnimationSet animationSet3 = this.ah$a;
        if (animationSet3 == null) {
            runAnimators.valueOf("scaleUpAnimationSet");
        } else {
            animationSet2 = animationSet3;
        }
        setAnimation(animationSet2);
    }

    public final void ag$a() {
        AnimationSet animationSet = this.ah$a;
        AnimationSet animationSet2 = null;
        if (animationSet == null) {
            runAnimators.valueOf("scaleUpAnimationSet");
            animationSet = null;
        }
        animationSet.cancel();
        AnimationSet animationSet3 = this.ah$a;
        if (animationSet3 == null) {
            runAnimators.valueOf("scaleUpAnimationSet");
        } else {
            animationSet2 = animationSet3;
        }
        animationSet2.reset();
    }

    public final boolean values() {
        AnimationSet animationSet = this.ah$a;
        if (animationSet == null) {
            runAnimators.valueOf("scaleUpAnimationSet");
            animationSet = null;
        }
        return animationSet.hasStarted();
    }
}
