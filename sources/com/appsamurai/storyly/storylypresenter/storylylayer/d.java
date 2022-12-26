package com.appsamurai.storyly.storylypresenter.storylylayer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setIdentityTransforms;
/* loaded from: classes3.dex */
public final class d extends RelativeLayout {
    public final Path HaptikSDK$a;
    public final setIdentityTransforms HaptikSDK$b;
    public int ag$a;
    public float ah$a;
    public final setIdentityTransforms ah$b;
    public float toString;
    public int valueOf;
    public float values;

    /* loaded from: classes3.dex */
    public static final class a extends Lambda implements Styleable.ArcMotion<Paint> {
        public a() {
            super(0);
        }

        @Override // o.Styleable.ArcMotion
        public Paint invoke() {
            Paint paint = new Paint(1);
            d dVar = d.this;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(dVar.valueOf);
            return paint;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends Lambda implements Styleable.ArcMotion<Paint> {
        public b() {
            super(0);
        }

        @Override // o.Styleable.ArcMotion
        public Paint invoke() {
            Paint paint = new Paint(1);
            d dVar = d.this;
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(dVar.ag$a);
            paint.setStrokeWidth(dVar.toString);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setDither(true);
            paint.setAntiAlias(true);
            return paint;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.valueOf = ViewCompat.MEASURED_STATE_MASK;
        this.ag$a = ViewCompat.MEASURED_STATE_MASK;
        this.HaptikSDK$a = new Path();
        this.HaptikSDK$b = runAnimators.ag$a(new a(), "initializer");
        this.ah$b = runAnimators.ag$a(new b(), "initializer");
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f = this.toString / 2.0f;
        Path path = this.HaptikSDK$a;
        float f2 = f + 0.0f;
        path.moveTo(this.values + 0.0f + f, f2);
        path.lineTo((measuredWidth - this.values) - f, f2);
        float f3 = this.values * 2.0f;
        float f4 = measuredWidth - f;
        path.arcTo(new RectF((measuredWidth - f3) - f, f2, f4, f3 + 0.0f), 270.0f, 90.0f);
        float f5 = measuredHeight / 2.0f;
        path.lineTo(f4, f5 - this.ah$a);
        float f6 = this.ah$a;
        path.arcTo(new RectF((measuredWidth - f6) - f, f5 - f6, (measuredWidth + f6) - f, f6 + f5), 270.0f, -180.0f);
        path.lineTo(f4, (measuredHeight - this.values) - f);
        float f7 = this.values;
        float f8 = 2;
        float f9 = measuredHeight - f;
        path.arcTo(new RectF((measuredWidth - (f7 * 2.0f)) - f, (measuredHeight - (f7 * f8)) - f, f4, f9), 0.0f, 90.0f);
        path.lineTo(this.values + 0.0f + f, f9);
        float f10 = this.values;
        path.arcTo(new RectF(f2, measuredHeight - (2.0f * f10), (f10 * f8) + 0.0f + f, f9), 90.0f, 90.0f);
        path.lineTo(f2, this.ah$a + f5);
        float f11 = this.ah$a;
        path.arcTo(new RectF(((-1) * f11) + f, f5 - f11, f11 + f, f5 + f11), 90.0f, -180.0f);
        path.lineTo(f2, this.values + 0.0f + f);
        float f12 = (f8 * this.values) + 0.0f + f;
        path.arcTo(new RectF(f2, f2, f12, f12), 180.0f, 90.0f);
        if (canvas != null) {
            canvas.drawPath(this.HaptikSDK$a, (Paint) this.ah$b.getValue());
        }
        if (canvas == null) {
            return;
        }
        canvas.drawPath(this.HaptikSDK$a, (Paint) this.HaptikSDK$b.getValue());
    }
}
