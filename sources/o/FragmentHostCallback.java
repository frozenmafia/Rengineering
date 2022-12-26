package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* loaded from: classes4.dex */
public class FragmentHostCallback extends loadClass {
    private Matrix ah$a;
    private int toString;
    private int valueOf;
    private Matrix values;

    @Override // o.loadClass
    public Drawable ah$a(Drawable drawable) {
        Drawable ah$a = super.ah$a(drawable);
        valueOf();
        return ah$a;
    }

    @Override // o.loadClass, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        values();
        if (this.ah$a != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.ah$a);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.loadClass, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        valueOf();
    }

    private void values() {
        if (this.toString == getCurrent().getIntrinsicWidth() && this.valueOf == getCurrent().getIntrinsicHeight()) {
            return;
        }
        valueOf();
    }

    private void valueOf() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.toString = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.valueOf = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.ah$a = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.ah$a = this.values;
    }

    @Override // o.loadClass, o.clearFragmentResultListener
    public void toString(Matrix matrix) {
        super.toString(matrix);
        Matrix matrix2 = this.ah$a;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }
}
