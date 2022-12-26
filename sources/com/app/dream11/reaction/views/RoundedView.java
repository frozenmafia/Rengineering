package com.app.dream11.reaction.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.app.dream11Pro.R;
import easypay.manager.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AppComponentFactory;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class RoundedView extends View {
    private float HaptikSDK$a;
    private final Path HaptikSDK$b;
    private float HaptikSDK$c;
    private float ag$a;
    public Map<Integer, View> ah$a;
    private final String ah$b;
    private final RectF invoke;
    private final Paint toString;
    private final AppComponentFactory valueOf;
    private final Paint values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedView(Context context, AppComponentFactory appComponentFactory) {
        super(context);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(appComponentFactory, Constants.EASY_PAY_CONFIG_PREF_KEY);
        this.ah$a = new LinkedHashMap();
        this.valueOf = appComponentFactory;
        this.ah$b = "RoundedView";
        Paint paint = new Paint(1);
        paint.setColor(appComponentFactory.values());
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(255);
        paint.setShadowLayer(4.0f, 10.0f, 10.0f, ContextCompat.getColor(context, R.color.res_0x7f06005a));
        setLayerType(1, paint);
        this.values = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(ContextCompat.getColor(context, R.color.gray_3));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(2.0f);
        this.toString = paint2;
        this.HaptikSDK$b = new Path();
        this.invoke = new RectF();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        Log.d(this.ah$b, "onSizeChanged: w = " + i + "; h = " + i2 + "; oldW = " + i3 + "; oldH = " + i4);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        float valueOf = paddingLeft <= 0 ? this.valueOf.valueOf() * 2.0f : paddingLeft / 2.0f;
        float f = 2;
        int size = this.valueOf.ah$b().size();
        float f2 = (float) (valueOf + (((i - ((f * valueOf) + ((size - 1) * (valueOf / f)))) / size) / 1.2d));
        this.ag$a = f2;
        this.HaptikSDK$a = f2;
        this.HaptikSDK$c = 0.0f;
        Log.d(this.ah$b, "onSizeChanged: padding left = " + getPaddingLeft() + "; padding right = " + getPaddingRight() + "; padding top = " + getPaddingTop() + "; padding bottom = " + getPaddingBottom());
        String str = this.ah$b;
        float x = getX();
        float f3 = this.HaptikSDK$a;
        Log.d(str, "onSizeChanged: xStart = " + (x + f3) + "; cornerSize = " + this.ag$a + "; x = " + getX());
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        runAnimators.ag$a(canvas, "canvas");
        int height = getHeight();
        int width = getWidth();
        float f = 10;
        float f2 = this.HaptikSDK$a + f;
        float f3 = this.HaptikSDK$c + f;
        this.HaptikSDK$b.moveTo(f2, f3);
        float f4 = 2;
        this.HaptikSDK$b.lineTo((width - (this.ag$a * f4)) + f2, f3);
        this.invoke.left = (getWidth() + f2) - (f4 * this.ag$a);
        RectF rectF = this.invoke;
        float f5 = 20;
        rectF.right = (rectF.left + this.ag$a) - f5;
        this.invoke.top = f3;
        this.invoke.bottom = (getHeight() + f3) - f5;
        this.HaptikSDK$b.arcTo(this.invoke, 270.0f, 180.0f);
        this.HaptikSDK$b.lineTo(f2, (getHeight() + f3) - f5);
        this.invoke.left = f2 - this.ag$a;
        this.invoke.right = f2;
        this.invoke.top = f3;
        this.invoke.bottom = (f3 + height) - f5;
        this.HaptikSDK$b.arcTo(this.invoke, 90.0f, 180.0f);
        this.HaptikSDK$b.close();
        canvas.drawPath(this.HaptikSDK$b, this.values);
        canvas.drawPath(this.HaptikSDK$b, this.toString);
        this.HaptikSDK$b.reset();
    }
}
