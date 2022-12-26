package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import o.WindowInsetsAnimationCompat;
/* loaded from: classes3.dex */
public final class getLowerBounds implements plusAssign<ByteBuffer, Bitmap> {
    private final WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.AnonymousClass2 valueOf = new WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.AnonymousClass2();

    @Override // o.plusAssign
    /* renamed from: toString */
    public boolean ag$a(ByteBuffer byteBuffer, setMargins setmargins) throws IOException {
        return true;
    }

    @Override // o.plusAssign
    /* renamed from: values */
    public ViewKt$postDelayed$runnable$1<Bitmap> ah$a(ByteBuffer byteBuffer, int i, int i2, setMargins setmargins) throws IOException {
        return this.valueOf.ah$a(ImageDecoder.createSource(byteBuffer), i, i2, setmargins);
    }
}
