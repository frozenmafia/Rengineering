package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import o.WindowInsetsAnimationCompat;
/* loaded from: classes3.dex */
public final class hasStableInsets implements replaceSystemWindowInsets<Drawable, byte[]> {
    private final replaceSystemWindowInsets<Bitmap, byte[]> ag$a;
    private final scaleXBy valueOf;
    private final replaceSystemWindowInsets<getStableInsetBottom, byte[]> values;

    /* JADX WARN: Multi-variable type inference failed */
    private static ViewKt$postDelayed$runnable$1<getStableInsetBottom> ag$a(ViewKt$postDelayed$runnable$1<Drawable> viewKt$postDelayed$runnable$1) {
        return viewKt$postDelayed$runnable$1;
    }

    public hasStableInsets(scaleXBy scalexby, replaceSystemWindowInsets<Bitmap, byte[]> replacesystemwindowinsets, replaceSystemWindowInsets<getStableInsetBottom, byte[]> replacesystemwindowinsets2) {
        this.valueOf = scalexby;
        this.ag$a = replacesystemwindowinsets;
        this.values = replacesystemwindowinsets2;
    }

    @Override // o.replaceSystemWindowInsets
    public ViewKt$postDelayed$runnable$1<byte[]> toString(ViewKt$postDelayed$runnable$1<Drawable> viewKt$postDelayed$runnable$1, setMargins setmargins) {
        Drawable ag$a = viewKt$postDelayed$runnable$1.ag$a();
        if (ag$a instanceof BitmapDrawable) {
            return this.ag$a.toString(WindowInsetsAnimationCompat.Impl30.ProxyCallback.valueOf(((BitmapDrawable) ag$a).getBitmap(), this.valueOf), setmargins);
        }
        if (ag$a instanceof getStableInsetBottom) {
            return this.values.toString(ag$a(viewKt$postDelayed$runnable$1), setmargins);
        }
        return null;
    }
}
