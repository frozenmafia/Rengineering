package o;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
/* loaded from: classes4.dex */
public class retainNestedNonConfig extends loadClass implements Runnable {
    float ah$a;
    private int toString;
    private boolean valueOf;
    private boolean values;

    public retainNestedNonConfig(Drawable drawable, int i) {
        this(drawable, i, true);
    }

    public retainNestedNonConfig(Drawable drawable, int i, boolean z) {
        super((Drawable) drawable.getClass());
        this.ah$a = 0.0f;
        this.values = false;
        this.toString = i;
        this.valueOf = z;
    }

    @Override // o.loadClass, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right;
        int i2 = bounds.left;
        int i3 = bounds.bottom;
        int i4 = bounds.top;
        float f = this.ah$a;
        if (!this.valueOf) {
            f = 360.0f - f;
        }
        canvas.rotate(f, bounds.left + ((i - i2) / 2), bounds.top + ((i3 - i4) / 2));
        super.draw(canvas);
        canvas.restoreToCount(save);
        values();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.values = false;
        this.ah$a += valueOf();
        invalidateSelf();
    }

    private void values() {
        if (this.values) {
            return;
        }
        this.values = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    private int valueOf() {
        return (int) ((20.0f / this.toString) * 360.0f);
    }
}
