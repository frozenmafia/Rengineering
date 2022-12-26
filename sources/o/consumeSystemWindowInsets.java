package o;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public abstract class consumeSystemWindowInsets<T extends Drawable> implements ViewKt$postDelayed$runnable$1<T>, ViewKt$doOnPreDraw$1 {
    protected final T valueOf;

    public consumeSystemWindowInsets(T t) {
        this.valueOf = (T) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(t);
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    /* renamed from: values */
    public final T ag$a() {
        Drawable.ConstantState constantState = this.valueOf.getConstantState();
        if (constantState == null) {
            return this.valueOf;
        }
        return (T) constantState.newDrawable();
    }

    @Override // o.ViewKt$doOnPreDraw$1
    public void ah$a() {
        T t = this.valueOf;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof getStableInsetBottom) {
            ((getStableInsetBottom) t).ah$a().prepareToDraw();
        }
    }
}
