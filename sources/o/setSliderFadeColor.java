package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
/* loaded from: classes5.dex */
public class setSliderFadeColor extends ColorDrawable {
    private final int ah$a;
    private final int toString;
    private Path valueOf;
    private final Paint values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setSliderFadeColor(int i, int i2) {
        Paint paint = new Paint(1);
        this.values = paint;
        this.toString = 0;
        paint.setColor(i);
        this.ah$a = i2;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        values(rect);
    }

    private void values(Rect rect) {
        synchronized (this) {
            Path path = new Path();
            this.valueOf = path;
            int i = this.ah$a;
            if (i == 0) {
                path.moveTo(rect.width(), rect.height());
                this.valueOf.lineTo(0.0f, rect.height() / 2);
                this.valueOf.lineTo(rect.width(), 0.0f);
                this.valueOf.lineTo(rect.width(), rect.height());
            } else if (i == 1) {
                path.moveTo(0.0f, rect.height());
                this.valueOf.lineTo(rect.width() / 2, 0.0f);
                this.valueOf.lineTo(rect.width(), rect.height());
                this.valueOf.lineTo(0.0f, rect.height());
            } else if (i == 2) {
                path.moveTo(0.0f, 0.0f);
                this.valueOf.lineTo(rect.width(), rect.height() / 2);
                this.valueOf.lineTo(0.0f, rect.height());
                this.valueOf.lineTo(0.0f, 0.0f);
            } else if (i == 3) {
                path.moveTo(0.0f, 0.0f);
                this.valueOf.lineTo(rect.width() / 2, rect.height());
                this.valueOf.lineTo(rect.width(), 0.0f);
                this.valueOf.lineTo(0.0f, 0.0f);
            }
            this.valueOf.close();
        }
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawColor(this.toString);
        if (this.valueOf == null) {
            values(getBounds());
        }
        canvas.drawPath(this.valueOf, this.values);
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.values.setAlpha(i);
    }

    @Override // android.graphics.drawable.ColorDrawable
    public void setColor(int i) {
        this.values.setColor(i);
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.values.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.values.getColorFilter() != null) {
            return -3;
        }
        int color = this.values.getColor() >>> 24;
        if (color != 0) {
            return color != 255 ? -3 : -1;
        }
        return -2;
    }
}
