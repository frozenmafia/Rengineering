package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public class getSystemWindowInsets implements replaceSystemWindowInsets<Bitmap, BitmapDrawable> {
    private final Resources ah$a;

    public getSystemWindowInsets(Resources resources) {
        this.ah$a = (Resources) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(resources);
    }

    @Override // o.replaceSystemWindowInsets
    public ViewKt$postDelayed$runnable$1<BitmapDrawable> toString(ViewKt$postDelayed$runnable$1<Bitmap> viewKt$postDelayed$runnable$1, setMargins setmargins) {
        return getTypes.ag$a(this.ah$a, viewKt$postDelayed$runnable$1);
    }
}
