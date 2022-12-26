package o;

import java.util.Arrays;
import o.skipEntityForward;
/* loaded from: classes3.dex */
public final class getImei implements skipEntityForward {
    private final long HaptikSDK$b;
    public final int ag$a;
    public final long[] ah$a;
    public final long[] toString;
    public final int[] valueOf;
    public final long[] values;

    @Override // o.skipEntityForward
    public boolean ah$a() {
        return true;
    }

    public getImei(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.valueOf = iArr;
        this.toString = jArr;
        this.ah$a = jArr2;
        this.values = jArr3;
        int length = iArr.length;
        this.ag$a = length;
        if (length > 0) {
            int i = length - 1;
            this.HaptikSDK$b = jArr2[i] + jArr3[i];
            return;
        }
        this.HaptikSDK$b = 0L;
    }

    public int values(long j) {
        return getElevationDegrees.valueOf(this.values, j, true, true);
    }

    @Override // o.skipEntityForward
    public long ag$a() {
        return this.HaptikSDK$b;
    }

    @Override // o.skipEntityForward
    public skipEntityForward.toString ah$a(long j) {
        int values = values(j);
        skipTagBackward skiptagbackward = new skipTagBackward(this.values[values], this.toString[values]);
        if (skiptagbackward.ag$a >= j || values == this.ag$a - 1) {
            return new skipEntityForward.toString(skiptagbackward);
        }
        int i = values + 1;
        return new skipEntityForward.toString(skiptagbackward, new skipTagBackward(this.values[i], this.toString[i]));
    }

    public String toString() {
        return "ChunkIndex(length=" + this.ag$a + ", sizes=" + Arrays.toString(this.valueOf) + ", offsets=" + Arrays.toString(this.toString) + ", timeUs=" + Arrays.toString(this.values) + ", durationsUs=" + Arrays.toString(this.ah$a) + ")";
    }
}
