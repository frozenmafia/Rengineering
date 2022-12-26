package o;

import com.google.android.exoplayer2.C;
/* loaded from: classes3.dex */
public abstract class get_splashScreenView {
    private int valueOf;

    public void values() {
        this.valueOf = 0;
    }

    public final boolean HaptikSDK$b() {
        return values(Integer.MIN_VALUE);
    }

    public final boolean HaptikSDK$c() {
        return values(C.BUFFER_FLAG_FIRST_SAMPLE);
    }

    public final boolean invoke() {
        return values(4);
    }

    public final boolean HaptikSDK$e() {
        return values(1);
    }

    public final boolean ah$b() {
        return values(268435456);
    }

    public final void HaptikSDK$b(int i) {
        this.valueOf = i;
    }

    public final void ah$a(int i) {
        this.valueOf = i | this.valueOf;
    }

    public final void ag$a(int i) {
        this.valueOf = (~i) & this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean values(int i) {
        return (this.valueOf & i) == i;
    }
}
