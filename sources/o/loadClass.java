package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* loaded from: classes4.dex */
public class loadClass extends Drawable implements Drawable.Callback, clearFragmentResultListener, FragmentKt$sam$androidx_fragment_app_FragmentResultListener$0, retainLoaderNonConfig {
    private static final Matrix valueOf = new Matrix();
    protected clearFragmentResultListener ag$a;
    private final saveAllState toString = new saveAllState();
    private Drawable values;

    public loadClass(Drawable drawable) {
        this.values = drawable;
        restoreSaveState.values(drawable, this, this);
    }

    public Drawable ah$a(Drawable drawable) {
        Drawable values = values(drawable);
        invalidateSelf();
        return values;
    }

    protected Drawable values(Drawable drawable) {
        Drawable drawable2 = this.values;
        restoreSaveState.values(drawable2, null, null);
        restoreSaveState.values(drawable, null, null);
        restoreSaveState.values(drawable, this.toString);
        restoreSaveState.toString(drawable, this);
        restoreSaveState.values(drawable, this, this);
        this.values = drawable;
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.values;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.toString.toString(i);
        Drawable drawable = this.values;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.toString.ah$a(colorFilter);
        Drawable drawable = this.values;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.toString.ag$a(z);
        Drawable drawable = this.values;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.toString.valueOf(z);
        Drawable drawable = this.values;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.values;
        return drawable == null ? visible : drawable.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.values;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.values;
        if (drawable == null) {
            return super.getConstantState();
        }
        return drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.values;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.values;
        if (drawable == null) {
            return super.onStateChange(iArr);
        }
        return drawable.setState(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.values;
        if (drawable == null) {
            return super.onLevelChange(i);
        }
        return drawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.values;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.values;
        if (drawable == null) {
            return super.getIntrinsicWidth();
        }
        return drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.values;
        if (drawable == null) {
            return super.getIntrinsicHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.values;
        if (drawable == null) {
            return super.getPadding(rect);
        }
        return drawable.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.values;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.values;
    }

    @Override // o.retainLoaderNonConfig
    public Drawable ag$a(Drawable drawable) {
        return ah$a(drawable);
    }

    @Override // o.retainLoaderNonConfig
    public Drawable ah$a() {
        return getCurrent();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // o.FragmentKt$sam$androidx_fragment_app_FragmentResultListener$0
    public void values(clearFragmentResultListener clearfragmentresultlistener) {
        this.ag$a = clearfragmentresultlistener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void values(Matrix matrix) {
        clearFragmentResultListener clearfragmentresultlistener = this.ag$a;
        if (clearfragmentresultlistener != null) {
            clearfragmentresultlistener.toString(matrix);
        } else {
            matrix.reset();
        }
    }

    public void toString(Matrix matrix) {
        values(matrix);
    }

    @Override // o.clearFragmentResultListener
    public void ah$a(RectF rectF) {
        clearFragmentResultListener clearfragmentresultlistener = this.ag$a;
        if (clearfragmentresultlistener != null) {
            clearfragmentresultlistener.ah$a(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.values;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }
}
