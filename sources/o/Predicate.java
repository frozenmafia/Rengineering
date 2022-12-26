package o;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.readText;
/* loaded from: classes3.dex */
final class Predicate implements readText.Cdefault {
    private final Map<String, checkArgument> ag$a;
    private final Map<String, String> ah$a;
    private final checkArgumentInRange toString;
    private final long[] valueOf;
    private final Map<String, checkStringNotEmpty> values;

    public Predicate(checkArgumentInRange checkargumentinrange, Map<String, checkStringNotEmpty> map, Map<String, checkArgument> map2, Map<String, String> map3) {
        this.toString = checkargumentinrange;
        this.ag$a = map2;
        this.ah$a = map3;
        this.values = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.valueOf = checkargumentinrange.values();
    }

    @Override // o.readText.Cdefault
    public int valueOf(long j) {
        int getelevationdegrees = getElevationDegrees.toString(this.valueOf, j, false, false);
        if (getelevationdegrees < this.valueOf.length) {
            return getelevationdegrees;
        }
        return -1;
    }

    @Override // o.readText.Cdefault
    public int ag$a() {
        return this.valueOf.length;
    }

    @Override // o.readText.Cdefault
    public long toString(int i) {
        return this.valueOf[i];
    }

    @Override // o.readText.Cdefault
    public List<isCompatTintEnabled> toString(long j) {
        return this.toString.valueOf(j, this.values, this.ag$a, this.ah$a);
    }
}
