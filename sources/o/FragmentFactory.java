package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* loaded from: classes4.dex */
public class FragmentFactory extends loadClass {
    final Matrix ah$a;
    private final RectF invoke;
    private final Matrix toString;
    private int valueOf;
    private int values;

    public FragmentFactory(Drawable drawable, int i, int i2) {
        super(drawable);
        this.toString = new Matrix();
        this.invoke = new RectF();
        this.ah$a = new Matrix();
        this.valueOf = i - (i % 90);
        this.values = (i2 < 0 || i2 > 8) ? 0 : 0;
    }

    @Override // o.loadClass, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        if (this.valueOf <= 0 && ((i = this.values) == 0 || i == 1)) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.concat(this.ah$a);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // o.loadClass, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = this.values;
        if (i == 5 || i == 7 || this.valueOf % 180 != 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }

    @Override // o.loadClass, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = this.values;
        if (i == 5 || i == 7 || this.valueOf % 180 != 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.loadClass, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i;
        Drawable current = getCurrent();
        int i2 = this.valueOf;
        if (i2 > 0 || ((i = this.values) != 0 && i != 1)) {
            int i3 = this.values;
            if (i3 == 2) {
                this.ah$a.setScale(-1.0f, 1.0f);
            } else if (i3 == 7) {
                this.ah$a.setRotate(270.0f, rect.centerX(), rect.centerY());
                this.ah$a.postScale(-1.0f, 1.0f);
            } else if (i3 == 4) {
                this.ah$a.setScale(1.0f, -1.0f);
            } else if (i3 == 5) {
                this.ah$a.setRotate(270.0f, rect.centerX(), rect.centerY());
                this.ah$a.postScale(1.0f, -1.0f);
            } else {
                this.ah$a.setRotate(i2, rect.centerX(), rect.centerY());
            }
            this.toString.reset();
            this.ah$a.invert(this.toString);
            this.invoke.set(rect);
            this.toString.mapRect(this.invoke);
            current.setBounds((int) this.invoke.left, (int) this.invoke.top, (int) this.invoke.right, (int) this.invoke.bottom);
            return;
        }
        current.setBounds(rect);
    }

    @Override // o.loadClass, o.clearFragmentResultListener
    public void toString(Matrix matrix) {
        values(matrix);
        if (this.ah$a.isIdentity()) {
            return;
        }
        matrix.preConcat(this.ah$a);
    }
}
