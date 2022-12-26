package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
/* loaded from: classes3.dex */
public final class dispatchStartTemporaryDetach extends Canvas {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dispatchStartTemporaryDetach(Bitmap bitmap) {
        super(bitmap);
        runAnimators.ag$a(bitmap, "bitmap");
    }
}
