package o;

import com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.C;
import o.PrecomputedTextCompat;
import o.skipEntityForward;
/* loaded from: classes3.dex */
public final class getTextPaint implements PrecomputedTextCompat.PrecomputedTextFutureTask.PrecomputedTextCallback {
    private final long ah$a;
    private final long[] toString;
    private final long[] values;

    @Override // o.skipEntityForward
    public boolean ah$a() {
        return true;
    }

    @Override // o.PrecomputedTextCompat.PrecomputedTextFutureTask.PrecomputedTextCallback
    public long valueOf() {
        return -1L;
    }

    public static getTextPaint ag$a(long j, MlltFrame mlltFrame, long j2) {
        int length = mlltFrame.ah$a.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += mlltFrame.values + mlltFrame.ah$a[i3];
            j3 += mlltFrame.valueOf + mlltFrame.toString[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new getTextPaint(jArr, jArr2, j2);
    }

    private getTextPaint(long[] jArr, long[] jArr2, long j) {
        this.values = jArr;
        this.toString = jArr2;
        this.ah$a = j == C.TIME_UNSET ? getElevationDegrees.ah$a(jArr2[jArr2.length - 1]) : j;
    }

    @Override // o.skipEntityForward
    public skipEntityForward.toString ah$a(long j) {
        android.util.Pair<Long, Long> ag$a = ag$a(getElevationDegrees.ag$a(getElevationDegrees.ah$a(j, 0L, this.ah$a)), this.toString, this.values);
        return new skipEntityForward.toString(new skipTagBackward(getElevationDegrees.ah$a(((Long) ag$a.first).longValue()), ((Long) ag$a.second).longValue()));
    }

    @Override // o.PrecomputedTextCompat.PrecomputedTextFutureTask.PrecomputedTextCallback
    public long toString(long j) {
        return getElevationDegrees.ah$a(((Long) ag$a(j, this.values, this.toString).second).longValue());
    }

    @Override // o.skipEntityForward
    public long ag$a() {
        return this.ah$a;
    }

    private static android.util.Pair<Long, Long> ag$a(long j, long[] jArr, long[] jArr2) {
        int valueOf = getElevationDegrees.valueOf(jArr, j, true, true);
        long j2 = jArr[valueOf];
        long j3 = jArr2[valueOf];
        int i = valueOf + 1;
        if (i == jArr.length) {
            return android.util.Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return android.util.Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }
}
