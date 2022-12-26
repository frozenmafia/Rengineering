package o;

import android.graphics.Bitmap;
import o.WindowInsetsAnimationCompat;
/* loaded from: classes3.dex */
public final class getSystemWindowInsetLeft implements plusAssign<getScaledPagingTouchSlop, Bitmap> {
    private final scaleXBy ag$a;

    @Override // o.plusAssign
    public boolean ag$a(getScaledPagingTouchSlop getscaledpagingtouchslop, setMargins setmargins) {
        return true;
    }

    public getSystemWindowInsetLeft(scaleXBy scalexby) {
        this.ag$a = scalexby;
    }

    @Override // o.plusAssign
    /* renamed from: valueOf */
    public ViewKt$postDelayed$runnable$1<Bitmap> ah$a(getScaledPagingTouchSlop getscaledpagingtouchslop, int i, int i2, setMargins setmargins) {
        return WindowInsetsAnimationCompat.Impl30.ProxyCallback.valueOf(getscaledpagingtouchslop.invoke(), this.ag$a);
    }
}
