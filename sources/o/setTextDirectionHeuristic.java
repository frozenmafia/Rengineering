package o;

import o.skipEntityForward;
/* loaded from: classes3.dex */
public final class setTextDirectionHeuristic implements skipEntityForward {
    private final long ah$a;
    private final skipEntityBackward values;

    @Override // o.skipEntityForward
    public boolean ah$a() {
        return true;
    }

    public setTextDirectionHeuristic(skipEntityBackward skipentitybackward, long j) {
        this.values = skipentitybackward;
        this.ah$a = j;
    }

    @Override // o.skipEntityForward
    public long ag$a() {
        return this.values.ah$a();
    }

    @Override // o.skipEntityForward
    public skipEntityForward.toString ah$a(long j) {
        FingerprintManagerCompat.ag$a(this.values.invoke);
        long[] jArr = this.values.invoke.toString;
        long[] jArr2 = this.values.invoke.valueOf;
        int valueOf = getElevationDegrees.valueOf(jArr, this.values.valueOf(j), true, false);
        skipTagBackward ag$a = ag$a(valueOf == -1 ? 0L : jArr[valueOf], valueOf != -1 ? jArr2[valueOf] : 0L);
        if (ag$a.ag$a == j || valueOf == jArr.length - 1) {
            return new skipEntityForward.toString(ag$a);
        }
        int i = valueOf + 1;
        return new skipEntityForward.toString(ag$a, ag$a(jArr[i], jArr2[i]));
    }

    private skipTagBackward ag$a(long j, long j2) {
        return new skipTagBackward((j * 1000000) / this.values.HaptikSDK$c, this.ah$a + j2);
    }
}
