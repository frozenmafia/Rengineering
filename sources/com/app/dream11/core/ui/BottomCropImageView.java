package com.app.dream11.core.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.LinkedHashMap;
import java.util.Map;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class BottomCropImageView extends AppCompatImageView {
    public Map<Integer, View> valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomCropImageView(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.valueOf = new LinkedHashMap();
        ah$a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        this.valueOf = new LinkedHashMap();
        ah$a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        this.valueOf = new LinkedHashMap();
        ah$a();
    }

    private final void ah$a() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        toString(i, i2);
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i, int i2, int i3, int i4) {
        toString(getWidth(), getHeight());
        return super.setFrame(i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        toString(getWidth(), getHeight());
    }

    public final void toString(int i, int i2) {
        try {
            if (getDrawable() == null) {
                return;
            }
            Matrix imageMatrix = getImageMatrix();
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            int paddingTop = (i2 - getPaddingTop()) - getPaddingBottom();
            int intrinsicWidth = getDrawable().getIntrinsicWidth();
            int intrinsicHeight = getDrawable().getIntrinsicHeight();
            float f = intrinsicWidth * paddingTop > intrinsicHeight * paddingLeft ? paddingTop / intrinsicHeight : paddingLeft / intrinsicWidth;
            float f2 = paddingTop;
            imageMatrix.setRectToRect(new RectF(0.0f, 0.0f, intrinsicWidth, f2 / f), new RectF(0.0f, 0.0f, paddingLeft, f2), Matrix.ScaleToFit.FILL);
            setImageMatrix(imageMatrix);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
