package o;

import java.util.Collections;
import java.util.List;
import o.readText;
/* loaded from: classes3.dex */
final class getEndInclusive implements readText.Cdefault {
    private final List<isCompatTintEnabled> values;

    @Override // o.readText.Cdefault
    public int ag$a() {
        return 1;
    }

    @Override // o.readText.Cdefault
    public int valueOf(long j) {
        return j < 0 ? 0 : -1;
    }

    public getEndInclusive(List<isCompatTintEnabled> list) {
        this.values = Collections.unmodifiableList(list);
    }

    @Override // o.readText.Cdefault
    public long toString(int i) {
        FingerprintManagerCompat.toString(i == 0);
        return 0L;
    }

    @Override // o.readText.Cdefault
    public List<isCompatTintEnabled> toString(long j) {
        return j >= 0 ? this.values : Collections.emptyList();
    }
}
