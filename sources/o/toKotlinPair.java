package o;

import java.util.Collections;
import java.util.List;
import o.readText;
/* loaded from: classes3.dex */
final class toKotlinPair implements readText.Cdefault {
    private final long[] ag$a;
    private final isCompatTintEnabled[] ah$a;

    public toKotlinPair(isCompatTintEnabled[] iscompattintenabledArr, long[] jArr) {
        this.ah$a = iscompattintenabledArr;
        this.ag$a = jArr;
    }

    @Override // o.readText.Cdefault
    public int valueOf(long j) {
        int getelevationdegrees = getElevationDegrees.toString(this.ag$a, j, false, false);
        if (getelevationdegrees < this.ag$a.length) {
            return getelevationdegrees;
        }
        return -1;
    }

    @Override // o.readText.Cdefault
    public int ag$a() {
        return this.ag$a.length;
    }

    @Override // o.readText.Cdefault
    public long toString(int i) {
        FingerprintManagerCompat.toString(i >= 0);
        FingerprintManagerCompat.toString(i < this.ag$a.length);
        return this.ag$a[i];
    }

    @Override // o.readText.Cdefault
    public List<isCompatTintEnabled> toString(long j) {
        int valueOf = getElevationDegrees.valueOf(this.ag$a, j, true, false);
        if (valueOf == -1 || this.ah$a[valueOf] == isCompatTintEnabled.values) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.ah$a[valueOf]);
    }
}
