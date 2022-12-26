package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.app.dream11Pro.R;
import o.AnyRes;
import o.getM;
/* loaded from: classes3.dex */
public class CustomStrikeTextView extends AppCompatTextView {
    String toString;
    int valueOf;

    public CustomStrikeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CustomTextView);
        String string = obtainStyledAttributes.getString(6);
        this.toString = string;
        if (string == null || string.equalsIgnoreCase("null")) {
            this.toString = context.getString(R.string.res_0x7f12000e);
        }
        try {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CustomStrikeTextView);
            this.valueOf = obtainStyledAttributes2.getResourceId(0, R.color.res_0x7f06053d);
            obtainStyledAttributes2.recycle();
        } catch (Exception e) {
            e.printStackTrace();
        }
        obtainStyledAttributes.recycle();
        values();
    }

    public CustomStrikeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CustomTextView);
        String string = obtainStyledAttributes.getString(6);
        this.toString = string;
        if (string == null || string.equalsIgnoreCase("null")) {
            this.toString = context.getString(R.string.res_0x7f12000e);
        }
        try {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.CustomStrikeTextView);
            this.valueOf = obtainStyledAttributes2.getResourceId(0, R.color.res_0x7f06053d);
            obtainStyledAttributes2.recycle();
        } catch (Exception e) {
            e.printStackTrace();
        }
        obtainStyledAttributes.recycle();
        values();
    }

    public CustomStrikeTextView(Context context) {
        super(context);
        values();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(this.valueOf));
        paint.setStyle(Paint.Style.FILL);
        paint.setStrikeThruText(true);
        paint.setStrokeWidth(5.0f);
        paint.setFlags(1);
        super.onDraw(canvas);
        getWidth();
        getHeight();
        canvas.drawLine(20.0f, getMeasuredHeight() / 2, getMeasuredWidth(), getMeasuredHeight() / 2, paint);
    }

    private void values() {
        if (isInEditMode()) {
            return;
        }
        try {
            setTypeface(getM.toString(getContext(), this.toString));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
