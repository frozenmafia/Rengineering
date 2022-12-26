package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
/* loaded from: classes3.dex */
public final class getEmptyTempRect extends Drawable implements Drawable.Callback {
    public int HaptikSDK$a;
    public float HaptikSDK$c;
    public float ah$b;
    public float invoke;
    public int valueOf;
    public final Paint toString = new Paint(1);
    public final Paint values = new Paint(1);
    public final RectF ah$a = new RectF();
    public float ag$a = 0.9f;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        runAnimators.ag$a(canvas, "canvas");
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        float f = 2;
        this.ah$a.set(0.0f, (getBounds().height() / 2.0f) - (this.HaptikSDK$c / f), getBounds().width(), (getBounds().height() / 2.0f) + (this.HaptikSDK$c / f));
        RectF rectF = this.ah$a;
        float f2 = this.invoke;
        canvas.drawRoundRect(rectF, f2, f2, this.toString);
        this.ah$a.set(0.0f, (getBounds().height() / 2.0f) - (this.HaptikSDK$c / f), this.ag$a * getBounds().width(), (getBounds().height() / 2.0f) + (this.HaptikSDK$c / f));
        RectF rectF2 = this.ah$a;
        float f3 = this.invoke;
        canvas.drawRoundRect(rectF2, f3, f3, this.values);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.ah$b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        runAnimators.ag$a(drawable, "drawable");
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        runAnimators.ag$a(rect, "rect");
        values(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        runAnimators.ag$a(drawable, "drawable");
        runAnimators.ag$a(runnable, "runnable");
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.values.setAlpha(i);
        this.toString.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.values.setColorFilter(colorFilter);
        this.toString.setColorFilter(colorFilter);
    }

    public final void toString(int i) {
        if (this.valueOf == i) {
            return;
        }
        this.valueOf = i;
        Rect bounds = getBounds();
        runAnimators.ah$a(bounds, "bounds");
        values(bounds);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        runAnimators.ag$a(drawable, "drawable");
        runAnimators.ag$a(runnable, "runnable");
    }

    public final Paint valueOf() {
        return this.toString;
    }

    public final void ag$a(int i) {
        if (this.HaptikSDK$a == i) {
            return;
        }
        this.HaptikSDK$a = i;
        Rect bounds = getBounds();
        runAnimators.ah$a(bounds, "bounds");
        values(bounds);
    }

    public final void ah$a(float f) {
        this.invoke = f / 2;
        this.HaptikSDK$c = f;
        invalidateSelf();
    }

    public final void values(float f) {
        this.ah$b = f;
    }

    public final void values(Rect rect) {
        this.values.setShader(new LinearGradient(0.0f, rect.exactCenterY(), rect.width(), rect.exactCenterY(), this.valueOf, this.HaptikSDK$a, Shader.TileMode.CLAMP));
    }
}
