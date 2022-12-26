package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* loaded from: classes4.dex */
public class loadFragmentClass extends Drawable {
    private final Paint HaptikSDK$c = new Paint(1);
    private final Path HaptikSDK$b = new Path();
    private final RectF getSignupData = new RectF();
    private int valueOf = Integer.MIN_VALUE;
    private int values = -2147450625;
    private int invoke = 10;
    private int toString = 20;
    private int ah$b = 0;
    private int HaptikSDK$a = 0;
    private boolean ag$a = false;
    private boolean ah$a = false;

    public void toString(int i) {
        if (this.values != i) {
            this.values = i;
            invalidateSelf();
        }
    }

    public void valueOf(int i) {
        if (this.invoke != i) {
            this.invoke = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i = this.invoke;
        rect.set(i, i, i, i);
        return this.invoke != 0;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        this.ah$b = i;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.HaptikSDK$c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.HaptikSDK$c.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return restoreSaveState.values(this.HaptikSDK$c.getColor());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.ag$a && this.ah$b == 0) {
            return;
        }
        if (this.ah$a) {
            valueOf(canvas, 10000, this.valueOf);
            valueOf(canvas, this.ah$b, this.values);
            return;
        }
        toString(canvas, 10000, this.valueOf);
        toString(canvas, this.ah$b, this.values);
    }

    private void toString(Canvas canvas, int i, int i2) {
        Rect bounds = getBounds();
        int i3 = bounds.left + this.invoke;
        int i4 = bounds.bottom;
        int i5 = this.invoke;
        int i6 = this.toString;
        int i7 = (i4 - i5) - i6;
        this.getSignupData.set(i3, i7, i3 + (((bounds.width() - (this.invoke * 2)) * i) / 10000), i7 + i6);
        toString(canvas, i2);
    }

    private void valueOf(Canvas canvas, int i, int i2) {
        Rect bounds = getBounds();
        int i3 = bounds.left + this.invoke;
        int i4 = bounds.top + this.invoke;
        this.getSignupData.set(i3, i4, i3 + this.toString, i4 + (((bounds.height() - (this.invoke * 2)) * i) / 10000));
        toString(canvas, i2);
    }

    private void toString(Canvas canvas, int i) {
        this.HaptikSDK$c.setColor(i);
        this.HaptikSDK$c.setStyle(Paint.Style.FILL_AND_STROKE);
        this.HaptikSDK$b.reset();
        this.HaptikSDK$b.setFillType(Path.FillType.EVEN_ODD);
        this.HaptikSDK$b.addRoundRect(this.getSignupData, Math.min(this.HaptikSDK$a, this.toString / 2), Math.min(this.HaptikSDK$a, this.toString / 2), Path.Direction.CW);
        canvas.drawPath(this.HaptikSDK$b, this.HaptikSDK$c);
    }
}
