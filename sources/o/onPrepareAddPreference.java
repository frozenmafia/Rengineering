package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import o.PreferenceDialogFragmentCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class onPrepareAddPreference extends addItemFromInflater<LinearProgressIndicatorSpec> {
    private float ag$a;
    private float ah$a;
    private float toString;

    @Override // o.addItemFromInflater
    public int ag$a() {
        return -1;
    }

    public onPrepareAddPreference(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.ag$a = 300.0f;
    }

    @Override // o.addItemFromInflater
    public int values() {
        return ((LinearProgressIndicatorSpec) this.valueOf).invoke;
    }

    @Override // o.addItemFromInflater
    public void values(Canvas canvas, float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.ag$a = clipBounds.width();
        float f2 = ((LinearProgressIndicatorSpec) this.valueOf).invoke;
        canvas.translate(clipBounds.left + (clipBounds.width() / 2.0f), clipBounds.top + (clipBounds.height() / 2.0f) + Math.max(0.0f, (clipBounds.height() - ((LinearProgressIndicatorSpec) this.valueOf).invoke) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.valueOf).HaptikSDK$b) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.values.values() && ((LinearProgressIndicatorSpec) this.valueOf).ag$a == 1) || (this.values.valueOf() && ((LinearProgressIndicatorSpec) this.valueOf).toString == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.values.values() || this.values.valueOf()) {
            canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.valueOf).invoke * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.ag$a;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        this.ah$a = ((LinearProgressIndicatorSpec) this.valueOf).invoke * f;
        this.toString = ((LinearProgressIndicatorSpec) this.valueOf).values * f;
    }

    @Override // o.addItemFromInflater
    public void valueOf(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.ag$a;
        float f4 = (-f3) / 2.0f;
        float f5 = this.toString;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f6 = this.ah$a;
        float f7 = f5 * 2.0f;
        float f8 = f3 - f7;
        RectF rectF = new RectF((f * f8) + f4, (-f6) / 2.0f, f4 + (f2 * f8) + f7, f6 / 2.0f);
        float f9 = this.toString;
        canvas.drawRoundRect(rectF, f9, f9, paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.addItemFromInflater
    public void toString(Canvas canvas, Paint paint) {
        int values = PreferenceDialogFragmentCompat.Api30Impl.values(((LinearProgressIndicatorSpec) this.valueOf).ah$a, this.values.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(values);
        float f = this.ag$a;
        float f2 = this.ah$a;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.toString;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }
}
