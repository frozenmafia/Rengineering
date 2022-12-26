package o;

import o.skipEntityForward;
/* loaded from: classes3.dex */
public final class dirTypeBackward implements skipEntityForward {
    private final long[] ag$a;
    private final boolean ah$a;
    private final long[] toString;
    private final long values;

    public dirTypeBackward(long[] jArr, long[] jArr2, long j) {
        FingerprintManagerCompat.toString(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.ah$a = z;
        if (z && jArr2[0] > 0) {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.toString = jArr3;
            long[] jArr4 = new long[i];
            this.ag$a = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.toString = jArr;
            this.ag$a = jArr2;
        }
        this.values = j;
    }

    @Override // o.skipEntityForward
    public boolean ah$a() {
        return this.ah$a;
    }

    @Override // o.skipEntityForward
    public long ag$a() {
        return this.values;
    }

    @Override // o.skipEntityForward
    public skipEntityForward.toString ah$a(long j) {
        if (!this.ah$a) {
            return new skipEntityForward.toString(skipTagBackward.ah$a);
        }
        int valueOf = getElevationDegrees.valueOf(this.ag$a, j, true, true);
        skipTagBackward skiptagbackward = new skipTagBackward(this.ag$a[valueOf], this.toString[valueOf]);
        if (skiptagbackward.ag$a != j) {
            long[] jArr = this.ag$a;
            if (valueOf != jArr.length - 1) {
                int i = valueOf + 1;
                return new skipEntityForward.toString(skiptagbackward, new skipTagBackward(jArr[i], this.toString[i]));
            }
        }
        return new skipEntityForward.toString(skiptagbackward);
    }
}
