package com.appsamurai.storyly.storylypresenter.storylylayer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setIdentityTransforms;
/* loaded from: classes3.dex */
public final class a extends FrameLayout {
    public final Path HaptikSDK$a;
    public final setIdentityTransforms HaptikSDK$b;
    public final Path HaptikSDK$c;
    public float ag$a;
    public float ah$a;
    public final setIdentityTransforms invoke;
    public int toString;
    public final float valueOf;
    public int values;

    /* renamed from: com.appsamurai.storyly.storylypresenter.storylylayer.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0244a extends Lambda implements Styleable.ArcMotion<Paint> {
        public C0244a() {
            super(0);
        }

        @Override // o.Styleable.ArcMotion
        public Paint invoke() {
            Paint paint = new Paint(1);
            a aVar = a.this;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(aVar.toString);
            paint.setDither(true);
            paint.setAntiAlias(true);
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
            a aVar = a.this;
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(aVar.values);
            paint.setStrokeWidth(aVar.ah$a);
            paint.setStrokeMiter(aVar.ah$a);
            paint.setDither(true);
            paint.setAntiAlias(true);
            return paint;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.toString = ViewCompat.MEASURED_STATE_MASK;
        this.values = ViewCompat.MEASURED_STATE_MASK;
        this.valueOf = (float) Math.sin(1.5707963267948966d);
        this.HaptikSDK$c = new Path();
        this.HaptikSDK$a = new Path();
        this.HaptikSDK$b = runAnimators.ag$a(new C0244a(), "initializer");
        this.invoke = runAnimators.ag$a(new b(), "initializer");
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth();
        float measuredWidth2 = getMeasuredWidth();
        toString(this.HaptikSDK$c, measuredWidth, measuredWidth2, this.ag$a, 0.0f, 0.0f);
        if (canvas != null) {
            canvas.drawPath(this.HaptikSDK$c, (Paint) this.HaptikSDK$b.getValue());
        }
        Path path = this.HaptikSDK$a;
        float f = this.ah$a;
        float f2 = 0.5f * f;
        toString(path, measuredWidth + f2, measuredWidth2 + f2, this.ag$a, this.valueOf * (-f), 2 * f);
        if (canvas == null) {
            return;
        }
        canvas.drawPath(this.HaptikSDK$a, (Paint) this.invoke.getValue());
    }

    public final void toString(Path path, float f, float f2, float f3, float f4, float f5) {
        path.moveTo(f4, 0.0f);
        float f6 = 2.0f * f3;
        float f7 = (f4 + f) - f6;
        path.arcTo(new RectF(f7, f2 - f3, f - f3, f2), 180.0f, -90.0f);
        path.arcTo(new RectF(f7, f2 - f6, f, f2), 90.0f, -90.0f);
        path.lineTo(f, f4 + f5);
    }
}
