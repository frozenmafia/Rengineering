package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public final class getTypes implements ViewKt$postDelayed$runnable$1<BitmapDrawable>, ViewKt$doOnPreDraw$1 {
    private final ViewKt$postDelayed$runnable$1<Bitmap> valueOf;
    private final Resources values;

    public static ViewKt$postDelayed$runnable$1<BitmapDrawable> ag$a(Resources resources, ViewKt$postDelayed$runnable$1<Bitmap> viewKt$postDelayed$runnable$1) {
        if (viewKt$postDelayed$runnable$1 == null) {
            return null;
        }
        return new getTypes(resources, viewKt$postDelayed$runnable$1);
    }

    private getTypes(Resources resources, ViewKt$postDelayed$runnable$1<Bitmap> viewKt$postDelayed$runnable$1) {
        this.values = (Resources) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(resources);
        this.valueOf = (ViewKt$postDelayed$runnable$1) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(viewKt$postDelayed$runnable$1);
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public Class<BitmapDrawable> valueOf() {
        return BitmapDrawable.class;
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    /* renamed from: values */
    public BitmapDrawable ag$a() {
        return new BitmapDrawable(this.values, this.valueOf.ag$a());
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public int ah$b() {
        return this.valueOf.ah$b();
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public void HaptikSDK$a() {
        this.valueOf.HaptikSDK$a();
    }

    @Override // o.ViewKt$doOnPreDraw$1
    public void ah$a() {
        ViewKt$postDelayed$runnable$1<Bitmap> viewKt$postDelayed$runnable$1 = this.valueOf;
        if (viewKt$postDelayed$runnable$1 instanceof ViewKt$doOnPreDraw$1) {
            ((ViewKt$doOnPreDraw$1) viewKt$postDelayed$runnable$1).ah$a();
        }
    }
}
