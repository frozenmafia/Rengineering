package o;

import android.graphics.drawable.Drawable;
/* loaded from: classes3.dex */
final class getInsets extends consumeSystemWindowInsets<Drawable> {
    @Override // o.ViewKt$postDelayed$runnable$1
    public void HaptikSDK$a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ViewKt$postDelayed$runnable$1<Drawable> values(Drawable drawable) {
        if (drawable != null) {
            return new getInsets(drawable);
        }
        return null;
    }

    private getInsets(Drawable drawable) {
        super(drawable);
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public Class<Drawable> valueOf() {
        return this.valueOf.getClass();
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public int ah$b() {
        return Math.max(1, this.valueOf.getIntrinsicWidth() * this.valueOf.getIntrinsicHeight() * 4);
    }
}
