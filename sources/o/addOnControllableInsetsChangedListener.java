package o;

import o.WindowInsetsControllerCompat;
@Deprecated
/* loaded from: classes3.dex */
public abstract class addOnControllableInsetsChangedListener<Z> extends navigationBars<Z> {
    private final int ah$a;
    private final int valueOf;

    @Override // o.controlWindowInsetsAnimation
    public void values(isAppearanceLightNavigationBars isappearancelightnavigationbars) {
    }

    public addOnControllableInsetsChangedListener() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public addOnControllableInsetsChangedListener(int i, int i2) {
        this.valueOf = i;
        this.ah$a = i2;
    }

    @Override // o.controlWindowInsetsAnimation
    public final void ag$a(isAppearanceLightNavigationBars isappearancelightnavigationbars) {
        if (!WindowInsetsControllerCompat.Impl30.AnonymousClass1.ah$a(this.valueOf, this.ah$a)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.valueOf + " and height: " + this.ah$a + ", either provide dimensions in the constructor or call override()");
        }
        isappearancelightnavigationbars.values(this.valueOf, this.ah$a);
    }
}
