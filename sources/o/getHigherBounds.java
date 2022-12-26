package o;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public class getHigherBounds implements plusAssign<ByteBuffer, Bitmap> {
    private final onFinished values;

    public getHigherBounds(onFinished onfinished) {
        this.values = onfinished;
    }

    @Override // o.plusAssign
    /* renamed from: valueOf */
    public boolean ag$a(ByteBuffer byteBuffer, setMargins setmargins) {
        return this.values.ag$a(byteBuffer);
    }

    @Override // o.plusAssign
    /* renamed from: valueOf */
    public ViewKt$postDelayed$runnable$1<Bitmap> ah$a(ByteBuffer byteBuffer, int i, int i2, setMargins setmargins) throws IOException {
        return this.values.ah$a(WindowInsetsControllerCompat.Impl20.ag$a(byteBuffer), i, i2, setmargins);
    }
}
