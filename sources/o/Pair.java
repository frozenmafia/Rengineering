package o;

import java.util.List;
import o.readText;
/* loaded from: classes3.dex */
final class Pair implements readText.Cdefault {
    private final List<isCompatTintEnabled> values;

    @Override // o.readText.Cdefault
    public int ag$a() {
        return 1;
    }

    @Override // o.readText.Cdefault
    public long toString(int i) {
        return 0L;
    }

    @Override // o.readText.Cdefault
    public int valueOf(long j) {
        return -1;
    }

    public Pair(List<isCompatTintEnabled> list) {
        this.values = list;
    }

    @Override // o.readText.Cdefault
    public List<isCompatTintEnabled> toString(long j) {
        return this.values;
    }
}
