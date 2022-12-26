package o;

import android.graphics.drawable.Drawable;
@Deprecated
/* loaded from: classes.dex */
public abstract class navigationBars<Z> implements controlWindowInsetsAnimation<Z> {
    private ime ag$a;

    @Override // o.WindowInsetsCompat.BuilderImpl
    public void HaptikSDK$e() {
    }

    @Override // o.WindowInsetsCompat.BuilderImpl
    public void HaptikWebView() {
    }

    @Override // o.controlWindowInsetsAnimation
    public void ag$a(Drawable drawable) {
    }

    @Override // o.controlWindowInsetsAnimation
    public void ah$a(Drawable drawable) {
    }

    @Override // o.WindowInsetsCompat.BuilderImpl
    public void getInitSettings() {
    }

    @Override // o.controlWindowInsetsAnimation
    public void values(Drawable drawable) {
    }

    @Override // o.controlWindowInsetsAnimation
    public void ah$a(ime imeVar) {
        this.ag$a = imeVar;
    }

    @Override // o.controlWindowInsetsAnimation
    public ime valueOf() {
        return this.ag$a;
    }
}
