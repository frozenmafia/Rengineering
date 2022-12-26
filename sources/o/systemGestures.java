package o;

import android.graphics.drawable.Drawable;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public abstract class systemGestures<T> implements controlWindowInsetsAnimation<T> {
    private final int ah$a;
    private ime valueOf;
    private final int values;

    @Override // o.WindowInsetsCompat.BuilderImpl
    public void HaptikSDK$e() {
    }

    @Override // o.WindowInsetsCompat.BuilderImpl
    public void HaptikWebView() {
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
    public final void values(isAppearanceLightNavigationBars isappearancelightnavigationbars) {
    }

    public systemGestures() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public systemGestures(int i, int i2) {
        if (!WindowInsetsControllerCompat.Impl30.AnonymousClass1.ah$a(i, i2)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
        }
        this.values = i;
        this.ah$a = i2;
    }

    @Override // o.controlWindowInsetsAnimation
    public final void ag$a(isAppearanceLightNavigationBars isappearancelightnavigationbars) {
        isappearancelightnavigationbars.values(this.values, this.ah$a);
    }

    @Override // o.controlWindowInsetsAnimation
    public final void ah$a(ime imeVar) {
        this.valueOf = imeVar;
    }

    @Override // o.controlWindowInsetsAnimation
    public final ime valueOf() {
        return this.valueOf;
    }
}
