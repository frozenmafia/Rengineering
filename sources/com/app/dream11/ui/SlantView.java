package com.app.dream11.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
/* loaded from: classes3.dex */
public class SlantView extends FrameLayout {
    protected Paint ag$a;
    private Path ah$a;
    private String toString;
    private int valueOf;
    private int values;

    public SlantView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.toString = "SlantView";
        this.ag$a = new Paint(1);
        this.valueOf = 0;
        setBackgroundColor(0);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.ah$a = new Path();
        int measuredHeight = (int) (getMeasuredHeight() / Math.tan(Math.toRadians(this.values)));
        this.valueOf = measuredHeight;
        this.ah$a.moveTo(measuredHeight, 0.0f);
        this.ah$a.lineTo(0.0f, getMeasuredHeight());
        this.ah$a.lineTo(getMeasuredWidth() - this.valueOf, getMeasuredHeight());
        this.ah$a.lineTo(getMeasuredWidth(), 0.0f);
        this.ah$a.close();
        canvas.drawPath(this.ah$a, this.ag$a);
    }

    public void setPaint(Paint paint) {
        this.ag$a = paint;
    }

    public void setAngle(int i) {
        this.values = i;
    }
}
