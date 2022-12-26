package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;
import o.WindowInsetsAnimationCompat;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public final class getHiddenStateInsets implements plusAssign<InputStream, Bitmap> {
    private final WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.AnonymousClass2 values = new WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.AnonymousClass2();

    @Override // o.plusAssign
    /* renamed from: ah$a */
    public boolean ag$a(InputStream inputStream, setMargins setmargins) throws IOException {
        return true;
    }

    @Override // o.plusAssign
    /* renamed from: valueOf */
    public ViewKt$postDelayed$runnable$1<Bitmap> ah$a(InputStream inputStream, int i, int i2, setMargins setmargins) throws IOException {
        return this.values.ah$a(ImageDecoder.createSource(WindowInsetsControllerCompat.Impl20.toString(inputStream)), i, i2, setmargins);
    }
}
