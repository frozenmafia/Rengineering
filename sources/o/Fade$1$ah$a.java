package o;
/* loaded from: classes7.dex */
public final class Fade$1$ah$a {
    public /* synthetic */ Fade$1$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    public final int valueOf(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
    }

    private Fade$1$ah$a() {
    }
}
