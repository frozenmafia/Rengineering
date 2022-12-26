package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import o.Fragment;
/* loaded from: classes4.dex */
public class retainNonConfig extends Drawable implements Drawable.Callback, clearFragmentResultListener, FragmentKt$sam$androidx_fragment_app_FragmentResultListener$0 {
    private final Drawable[] HaptikSDK$a;
    private clearFragmentResultListener HaptikSDK$b;
    private final retainLoaderNonConfig[] ag$a;
    private final saveAllState ah$a = new saveAllState();
    private final Rect HaptikSDK$c = new Rect();
    private boolean valueOf = false;
    private boolean toString = false;
    private boolean values = false;

    public retainNonConfig(Drawable[] drawableArr) {
        int i = 0;
        drawableArr.getClass();
        this.HaptikSDK$a = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.HaptikSDK$a;
            if (i < drawableArr2.length) {
                restoreSaveState.values(drawableArr2[i], this, this);
                i++;
            } else {
                this.ag$a = new retainLoaderNonConfig[drawableArr2.length];
                return;
            }
        }
    }

    public int ah$a() {
        return this.HaptikSDK$a.length;
    }

    public Drawable ag$a(int i) {
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i >= 0));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i < this.HaptikSDK$a.length));
        return this.HaptikSDK$a[i];
    }

    public Drawable ah$a(int i, Drawable drawable) {
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i >= 0));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i < this.HaptikSDK$a.length));
        Drawable drawable2 = this.HaptikSDK$a[i];
        if (drawable != drawable2) {
            if (drawable != null && this.values) {
                drawable.mutate();
            }
            restoreSaveState.values(this.HaptikSDK$a[i], null, null);
            restoreSaveState.values(drawable, null, null);
            restoreSaveState.values(drawable, this.ah$a);
            restoreSaveState.toString(drawable, this);
            restoreSaveState.values(drawable, this, this);
            this.toString = false;
            this.HaptikSDK$a[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.HaptikSDK$a;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.HaptikSDK$a;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.HaptikSDK$a;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.toString) {
            this.valueOf = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.HaptikSDK$a;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.valueOf;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.valueOf = z2 | z;
                i++;
            }
            this.toString = true;
        }
        return this.valueOf;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.HaptikSDK$a;
            if (i >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.HaptikSDK$a;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.HaptikSDK$a;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.HaptikSDK$c;
        while (true) {
            Drawable[] drawableArr = this.HaptikSDK$a;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.HaptikSDK$a;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.mutate();
                }
                i++;
            } else {
                this.values = true;
                return this;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.HaptikSDK$a.length == 0) {
            return -2;
        }
        int i = -1;
        int i2 = 1;
        while (true) {
            Drawable[] drawableArr = this.HaptikSDK$a;
            if (i2 >= drawableArr.length) {
                return i;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                i = Drawable.resolveOpacity(i, drawable.getOpacity());
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.ah$a.toString(i);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.HaptikSDK$a;
            if (i2 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                drawable.setAlpha(i);
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.ah$a.ah$a(colorFilter);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.HaptikSDK$a;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.ah$a.ag$a(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.HaptikSDK$a;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setDither(z);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.ah$a.valueOf(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.HaptikSDK$a;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setFilterBitmap(z);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.HaptikSDK$a;
            if (i >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i++;
        }
    }

    public retainLoaderNonConfig valueOf(int i) {
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i >= 0));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i < this.ag$a.length));
        retainLoaderNonConfig[] retainloadernonconfigArr = this.ag$a;
        if (retainloadernonconfigArr[i] == null) {
            retainloadernonconfigArr[i] = ah$a(i);
        }
        return this.ag$a[i];
    }

    private retainLoaderNonConfig ah$a(final int i) {
        return new retainLoaderNonConfig() { // from class: o.retainNonConfig.3
            @Override // o.retainLoaderNonConfig
            public Drawable ag$a(Drawable drawable) {
                return retainNonConfig.this.ah$a(i, drawable);
            }

            @Override // o.retainLoaderNonConfig
            public Drawable ah$a() {
                return retainNonConfig.this.ag$a(i);
            }
        };
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
        this.HaptikSDK$b = clearfragmentresultlistener;
    }

    @Override // o.clearFragmentResultListener
    public void toString(Matrix matrix) {
        clearFragmentResultListener clearfragmentresultlistener = this.HaptikSDK$b;
        if (clearfragmentresultlistener != null) {
            clearfragmentresultlistener.toString(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // o.clearFragmentResultListener
    public void ah$a(RectF rectF) {
        clearFragmentResultListener clearfragmentresultlistener = this.HaptikSDK$b;
        if (clearfragmentresultlistener != null) {
            clearfragmentresultlistener.ah$a(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.HaptikSDK$a;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setHotspot(f, f2);
            }
            i++;
        }
    }
}
