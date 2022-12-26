package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextDirectionHeuristicCompat {
    public final toSpanned HaptikSDK$c;
    public final int ag$a;
    public final long[] ah$a;
    public final int[] ah$b;
    public final long[] invoke;
    public final int toString;
    public final int[] valueOf;
    public final long values;

    public TextDirectionHeuristicCompat(toSpanned tospanned, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        FingerprintManagerCompat.toString(iArr.length == jArr2.length);
        FingerprintManagerCompat.toString(jArr.length == jArr2.length);
        FingerprintManagerCompat.toString(iArr2.length == jArr2.length);
        this.HaptikSDK$c = tospanned;
        this.ah$a = jArr;
        this.ah$b = iArr;
        this.toString = i;
        this.invoke = jArr2;
        this.valueOf = iArr2;
        this.values = j;
        this.ag$a = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int ag$a(long j) {
        for (int valueOf = getElevationDegrees.valueOf(this.invoke, j, true, false); valueOf >= 0; valueOf--) {
            if ((this.valueOf[valueOf] & 1) != 0) {
                return valueOf;
            }
        }
        return -1;
    }

    public int ah$a(long j) {
        for (int getelevationdegrees = getElevationDegrees.toString(this.invoke, j, true, false); getelevationdegrees < this.invoke.length; getelevationdegrees++) {
            if ((this.valueOf[getelevationdegrees] & 1) != 0) {
                return getelevationdegrees;
            }
        }
        return -1;
    }
}
