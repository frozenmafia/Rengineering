package o;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import o.WindowInsetsAnimationCompat;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public abstract class WindowInsetsAnimationControlListenerCompat implements ViewGroupKt$iterator$1<Bitmap> {
    protected abstract Bitmap values(scaleXBy scalexby, Bitmap bitmap, int i, int i2);

    @Override // o.ViewGroupKt$iterator$1
    public final ViewKt$postDelayed$runnable$1<Bitmap> valueOf(Context context, ViewKt$postDelayed$runnable$1<Bitmap> viewKt$postDelayed$runnable$1, int i, int i2) {
        if (!WindowInsetsControllerCompat.Impl30.AnonymousClass1.ah$a(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        scaleXBy ag$a = Glide.ag$a(context).ag$a();
        Bitmap ag$a2 = viewKt$postDelayed$runnable$1.ag$a();
        if (i == Integer.MIN_VALUE) {
            i = ag$a2.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = ag$a2.getHeight();
        }
        Bitmap values = values(ag$a, ag$a2, i, i2);
        return ag$a2.equals(values) ? viewKt$postDelayed$runnable$1 : WindowInsetsAnimationCompat.Impl30.ProxyCallback.valueOf(values, ag$a);
    }
}
