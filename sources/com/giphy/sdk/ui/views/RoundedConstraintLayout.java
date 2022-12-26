package com.giphy.sdk.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import o.getStartAlpha;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes7.dex */
public class RoundedConstraintLayout extends ConstraintLayout {
    private float bottomLeftCornerRadius;
    private float bottomRightCornerRadius;
    private float cornerRadius;
    private final float[] mRadii;
    private final Path path;
    private RectF rectF;
    private float topLeftCornerRadius;
    private float topRightCornerRadius;

    public RoundedConstraintLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public RoundedConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ RoundedConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2, getTargetTypes gettargettypes) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        float[] fArr = new float[8];
        this.mRadii = fArr;
        this.path = new Path();
        getStartAlpha.values(fArr, 0.0f, 0, 8);
        updateCornersRadius();
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final void setCornerRadius(float f) {
        this.cornerRadius = f;
        float[] fArr = this.mRadii;
        getStartAlpha.values(fArr, f, 0, fArr.length);
    }

    public final float getTopLeftCornerRadius() {
        return this.topLeftCornerRadius;
    }

    public final void setTopLeftCornerRadius(float f) {
        this.topLeftCornerRadius = f;
        updateCornersRadius();
    }

    public final float getTopRightCornerRadius() {
        return this.topRightCornerRadius;
    }

    public final void setTopRightCornerRadius(float f) {
        this.topRightCornerRadius = f;
        updateCornersRadius();
    }

    public final float getBottomRightCornerRadius() {
        return this.bottomRightCornerRadius;
    }

    public final void setBottomRightCornerRadius(float f) {
        this.bottomRightCornerRadius = f;
        updateCornersRadius();
    }

    public final float getBottomLeftCornerRadius() {
        return this.bottomLeftCornerRadius;
    }

    public final void setBottomLeftCornerRadius(float f) {
        this.bottomLeftCornerRadius = f;
        updateCornersRadius();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.rectF = new RectF(0.0f, 0.0f, i, i2);
        resetPath();
    }

    private final void updateCornersRadius() {
        float[] fArr = this.mRadii;
        float f = this.topLeftCornerRadius;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = this.topRightCornerRadius;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = this.bottomRightCornerRadius;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = this.bottomLeftCornerRadius;
        fArr[6] = f4;
        fArr[7] = f4;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        runAnimators.ag$a(canvas, "canvas");
        int save = canvas.save();
        canvas.clipPath(this.path);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        runAnimators.ag$a(canvas, "canvas");
        int save = canvas.save();
        canvas.clipPath(this.path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    private final void resetPath() {
        this.path.reset();
        Path path = this.path;
        RectF rectF = this.rectF;
        if (rectF == null) {
            runAnimators.valueOf("rectF");
        }
        path.addRoundRect(rectF, this.mRadii, Path.Direction.CW);
        this.path.close();
    }
}
