package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import o.PreferenceDialogFragmentCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class getPreferenceCount extends addItemFromInflater<CircularProgressIndicatorSpec> {
    private float HaptikSDK$c;
    private int ag$a;
    private float ah$a;
    private float toString;

    public getPreferenceCount(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.ag$a = 1;
    }

    @Override // o.addItemFromInflater
    public int ag$a() {
        return valueOf();
    }

    @Override // o.addItemFromInflater
    public int values() {
        return valueOf();
    }

    @Override // o.addItemFromInflater
    public void values(Canvas canvas, float f) {
        float f2 = (((CircularProgressIndicatorSpec) this.valueOf).ah$b / 2.0f) + ((CircularProgressIndicatorSpec) this.valueOf).HaptikSDK$a;
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        this.ag$a = ((CircularProgressIndicatorSpec) this.valueOf).HaptikSDK$b == 0 ? 1 : -1;
        this.HaptikSDK$c = ((CircularProgressIndicatorSpec) this.valueOf).invoke * f;
        this.toString = ((CircularProgressIndicatorSpec) this.valueOf).values * f;
        this.ah$a = (((CircularProgressIndicatorSpec) this.valueOf).ah$b - ((CircularProgressIndicatorSpec) this.valueOf).invoke) / 2.0f;
        if ((this.values.values() && ((CircularProgressIndicatorSpec) this.valueOf).ag$a == 2) || (this.values.valueOf() && ((CircularProgressIndicatorSpec) this.valueOf).toString == 1)) {
            this.ah$a += ((1.0f - f) * ((CircularProgressIndicatorSpec) this.valueOf).invoke) / 2.0f;
        } else if ((this.values.values() && ((CircularProgressIndicatorSpec) this.valueOf).ag$a == 1) || (this.values.valueOf() && ((CircularProgressIndicatorSpec) this.valueOf).toString == 2)) {
            this.ah$a -= ((1.0f - f) * ((CircularProgressIndicatorSpec) this.valueOf).invoke) / 2.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.addItemFromInflater
    public void valueOf(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.HaptikSDK$c);
        float f3 = this.ag$a;
        float f4 = f * 360.0f * f3;
        float f5 = (f2 >= f ? f2 - f : (1.0f + f2) - f) * 360.0f * f3;
        float f6 = this.ah$a;
        float f7 = -f6;
        canvas.drawArc(new RectF(f7, f7, f6, f6), f4, f5, false, paint);
        if (this.toString <= 0.0f || Math.abs(f5) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        ah$a(canvas, paint, this.HaptikSDK$c, this.toString, f4);
        ah$a(canvas, paint, this.HaptikSDK$c, this.toString, f4 + f5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.addItemFromInflater
    public void toString(Canvas canvas, Paint paint) {
        int values = PreferenceDialogFragmentCompat.Api30Impl.values(((CircularProgressIndicatorSpec) this.valueOf).ah$a, this.values.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(values);
        paint.setStrokeWidth(this.HaptikSDK$c);
        float f = this.ah$a;
        float f2 = -f;
        canvas.drawArc(new RectF(f2, f2, f, f), 0.0f, 360.0f, false, paint);
    }

    private int valueOf() {
        return ((CircularProgressIndicatorSpec) this.valueOf).ah$b + (((CircularProgressIndicatorSpec) this.valueOf).HaptikSDK$a * 2);
    }

    private void ah$a(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.ah$a;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }
}
