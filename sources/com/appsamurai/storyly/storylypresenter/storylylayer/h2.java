package com.appsamurai.storyly.storylypresenter.storylylayer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setIdentityTransforms;
/* loaded from: classes3.dex */
public final class h2 extends View {
    public final setIdentityTransforms ag$a;
    public int ah$a;
    public final Path toString;
    public final setIdentityTransforms valueOf;
    public float values;

    /* loaded from: classes3.dex */
    public static final class a extends Lambda implements Styleable.ArcMotion<Float> {
        public a() {
            super(0);
        }

        @Override // o.Styleable.ArcMotion
        public Float invoke() {
            return Float.valueOf(h2.this.values * 4.0f);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends Lambda implements Styleable.ArcMotion<Paint> {
        public b() {
            super(0);
        }

        @Override // o.Styleable.ArcMotion
        public Paint invoke() {
            Paint paint = new Paint();
            h2 h2Var = h2.this;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(h2Var.values);
            paint.setColor(h2Var.ah$a);
            paint.setPathEffect(new DashPathEffect(new float[]{((Number) h2Var.valueOf.getValue()).floatValue(), ((Number) h2Var.valueOf.getValue()).floatValue() * 0.8f}, 0.0f));
            return paint;
        }
    }

    public h2(Context context) {
        super(context);
        this.ah$a = ViewCompat.MEASURED_STATE_MASK;
        this.valueOf = runAnimators.ag$a(new a(), "initializer");
        this.toString = new Path();
        this.ag$a = runAnimators.ag$a(new b(), "initializer");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        runAnimators.ag$a(canvas, "canvas");
        super.onDraw(canvas);
        this.toString.moveTo(0.0f, 0.0f);
        this.toString.lineTo(0.0f, getMeasuredHeight());
        canvas.drawPath(this.toString, (Paint) this.ag$a.getValue());
    }
}
