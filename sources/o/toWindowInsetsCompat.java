package o;

import android.graphics.Bitmap;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public final class toWindowInsetsCompat implements plusAssign<Bitmap, Bitmap> {
    @Override // o.plusAssign
    /* renamed from: values */
    public boolean ag$a(Bitmap bitmap, setMargins setmargins) {
        return true;
    }

    @Override // o.plusAssign
    /* renamed from: valueOf */
    public ViewKt$postDelayed$runnable$1<Bitmap> ah$a(final Bitmap bitmap, int i, int i2, setMargins setmargins) {
        return new ViewKt$postDelayed$runnable$1<Bitmap>(bitmap) { // from class: o.toWindowInsetsCompat$ah$a
            private final Bitmap valueOf;

            @Override // o.ViewKt$postDelayed$runnable$1
            public void HaptikSDK$a() {
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.valueOf = bitmap;
            }

            @Override // o.ViewKt$postDelayed$runnable$1
            public Class<Bitmap> valueOf() {
                return Bitmap.class;
            }

            @Override // o.ViewKt$postDelayed$runnable$1
            /* renamed from: values */
            public Bitmap ag$a() {
                return this.valueOf;
            }

            @Override // o.ViewKt$postDelayed$runnable$1
            public int ah$b() {
                return WindowInsetsControllerCompat.Impl30.AnonymousClass1.valueOf(this.valueOf);
            }
        };
    }
}
