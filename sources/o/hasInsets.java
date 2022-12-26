package o;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
/* loaded from: classes3.dex */
public class hasInsets implements replaceSystemWindowInsets<Bitmap, byte[]> {
    private final Bitmap.CompressFormat toString;
    private final int valueOf;

    public hasInsets() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public hasInsets(Bitmap.CompressFormat compressFormat, int i) {
        this.toString = compressFormat;
        this.valueOf = i;
    }

    @Override // o.replaceSystemWindowInsets
    public ViewKt$postDelayed$runnable$1<byte[]> toString(ViewKt$postDelayed$runnable$1<Bitmap> viewKt$postDelayed$runnable$1, setMargins setmargins) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        viewKt$postDelayed$runnable$1.ag$a().compress(this.toString, this.valueOf, byteArrayOutputStream);
        viewKt$postDelayed$runnable$1.HaptikSDK$a();
        return new consumeDisplayCutout(byteArrayOutputStream.toByteArray());
    }
}
