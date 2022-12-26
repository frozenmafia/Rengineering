package o;

import java.util.Collections;
import java.util.List;
import o.readText;
/* loaded from: classes3.dex */
final class checkState implements readText.Cdefault {
    public static final checkState toString = new checkState();
    private final List<isCompatTintEnabled> valueOf;

    @Override // o.readText.Cdefault
    public int ag$a() {
        return 1;
    }

    @Override // o.readText.Cdefault
    public int valueOf(long j) {
        return j < 0 ? 0 : -1;
    }

    public checkState(isCompatTintEnabled iscompattintenabled) {
        this.valueOf = Collections.singletonList(iscompattintenabled);
    }

    private checkState() {
        this.valueOf = Collections.emptyList();
    }

    @Override // o.readText.Cdefault
    public long toString(int i) {
        FingerprintManagerCompat.toString(i == 0);
        return 0L;
    }

    @Override // o.readText.Cdefault
    public List<isCompatTintEnabled> toString(long j) {
        return j >= 0 ? this.valueOf : Collections.emptyList();
    }
}
