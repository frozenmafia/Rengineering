package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.readText;
/* loaded from: classes3.dex */
final class SparseBooleanArrayKt$valueIterator$1 implements readText.Cdefault {
    private final long[] ag$a;
    private final List<toClosedRange> ah$a;
    private final long[] valueOf;

    public SparseBooleanArrayKt$valueIterator$1(List<toClosedRange> list) {
        this.ah$a = Collections.unmodifiableList(new ArrayList(list));
        this.ag$a = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            toClosedRange toclosedrange = list.get(i);
            int i2 = i * 2;
            this.ag$a[i2] = toclosedrange.ag$a;
            this.ag$a[i2 + 1] = toclosedrange.toString;
        }
        long[] jArr = this.ag$a;
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        this.valueOf = copyOf;
        Arrays.sort(copyOf);
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
        FingerprintManagerCompat.toString(i >= 0);
        FingerprintManagerCompat.toString(i < this.valueOf.length);
        return this.valueOf[i];
    }

    @Override // o.readText.Cdefault
    public List<isCompatTintEnabled> toString(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.ah$a.size(); i++) {
            long[] jArr = this.ag$a;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                toClosedRange toclosedrange = this.ah$a.get(i);
                if (toclosedrange.valueOf.valueOf == -3.4028235E38f) {
                    arrayList2.add(toclosedrange);
                } else {
                    arrayList.add(toclosedrange.valueOf);
                }
            }
        }
        Collections.sort(arrayList2, SparseLongArrayKt.values);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((toClosedRange) arrayList2.get(i3)).valueOf.ag$a().toString((-1) - i3, 1).values());
        }
        return arrayList;
    }
}
