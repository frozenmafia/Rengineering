package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
/* loaded from: classes3.dex */
public class setInsetsAndAlpha implements plusAssign<Uri, Bitmap> {
    private final getDisplayCutout toString;
    private final scaleXBy valueOf;

    public setInsetsAndAlpha(getDisplayCutout getdisplaycutout, scaleXBy scalexby) {
        this.toString = getdisplaycutout;
        this.valueOf = scalexby;
    }

    @Override // o.plusAssign
    public boolean ag$a(Uri uri, setMargins setmargins) {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // o.plusAssign
    /* renamed from: valueOf */
    public ViewKt$postDelayed$runnable$1<Bitmap> ah$a(Uri uri, int i, int i2, setMargins setmargins) {
        ViewKt$postDelayed$runnable$1<Drawable> ah$a = this.toString.ah$a(uri, i, i2, setmargins);
        if (ah$a == null) {
            return null;
        }
        return getCurrentFraction.ag$a(this.valueOf, ah$a.ag$a(), i, i2);
    }
}
