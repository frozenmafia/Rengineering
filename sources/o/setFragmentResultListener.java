package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import o.Fragment;
import o.setFragmentResult;
/* loaded from: classes4.dex */
public class setFragmentResultListener extends loadClass {
    int HaptikSDK$a;
    private Matrix HaptikSDK$c;
    Object ah$a;
    int ah$b;
    Matrix toString;
    setFragmentResult.valueOf valueOf;
    PointF values;

    public setFragmentResultListener(Drawable drawable, setFragmentResult.valueOf valueof) {
        super(drawable);
        this.values = null;
        this.HaptikSDK$a = 0;
        this.ah$b = 0;
        this.HaptikSDK$c = new Matrix();
        this.valueOf = valueof;
    }

    @Override // o.loadClass
    public Drawable ah$a(Drawable drawable) {
        Drawable ah$a = super.ah$a(drawable);
        values();
        return ah$a;
    }

    public setFragmentResult.valueOf ag$a() {
        return this.valueOf;
    }

    public void values(setFragmentResult.valueOf valueof) {
        if (Fragment.AnonymousClass7.toString(this.valueOf, valueof)) {
            return;
        }
        this.valueOf = valueof;
        this.ah$a = null;
        values();
        invalidateSelf();
    }

    public PointF valueOf() {
        return this.values;
    }

    public void ag$a(PointF pointF) {
        if (Fragment.AnonymousClass7.toString(this.values, pointF)) {
            return;
        }
        if (pointF == null) {
            this.values = null;
        } else {
            if (this.values == null) {
                this.values = new PointF();
            }
            this.values.set(pointF);
        }
        values();
        invalidateSelf();
    }

    @Override // o.loadClass, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ah$b();
        if (this.toString != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.toString);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.loadClass, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        values();
    }

    private void ah$b() {
        boolean z;
        setFragmentResult.valueOf valueof = this.valueOf;
        boolean z2 = true;
        if (valueof instanceof setFragmentResult.HaptikWebView) {
            Object values = ((setFragmentResult.HaptikWebView) valueof).values();
            z = values == null || !values.equals(this.ah$a);
            this.ah$a = values;
        } else {
            z = false;
        }
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.HaptikSDK$a == current.getIntrinsicWidth() && this.ah$b == current.getIntrinsicHeight()) {
            z2 = false;
        }
        if (z2 || z) {
            values();
        }
    }

    void values() {
        Drawable current = getCurrent();
        if (current == null) {
            this.ah$b = 0;
            this.HaptikSDK$a = 0;
            this.toString = null;
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.HaptikSDK$a = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.ah$b = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.toString = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.toString = null;
        } else if (this.valueOf == setFragmentResult.valueOf.HaptikSDK$a) {
            current.setBounds(bounds);
            this.toString = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            setFragmentResult.valueOf valueof = this.valueOf;
            Matrix matrix = this.HaptikSDK$c;
            PointF pointF = this.values;
            float f = pointF != null ? pointF.x : 0.5f;
            PointF pointF2 = this.values;
            valueof.valueOf(matrix, bounds, intrinsicWidth, intrinsicHeight, f, pointF2 != null ? pointF2.y : 0.5f);
            this.toString = this.HaptikSDK$c;
        }
    }

    @Override // o.loadClass, o.clearFragmentResultListener
    public void toString(Matrix matrix) {
        values(matrix);
        ah$b();
        Matrix matrix2 = this.toString;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }
}
