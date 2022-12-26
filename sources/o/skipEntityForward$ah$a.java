package o;

import o.skipEntityForward;
/* loaded from: classes3.dex */
public class skipEntityForward$ah$a implements skipEntityForward {
    private final long toString;
    private final skipEntityForward.toString values;

    @Override // o.skipEntityForward
    public boolean ah$a() {
        return false;
    }

    public skipEntityForward$ah$a(long j) {
        this(j, 0L);
    }

    public skipEntityForward$ah$a(long j, long j2) {
        this.toString = j;
        this.values = new skipEntityForward.toString(j2 == 0 ? skipTagBackward.ah$a : new skipTagBackward(0L, j2));
    }

    @Override // o.skipEntityForward
    public long ag$a() {
        return this.toString;
    }

    @Override // o.skipEntityForward
    public skipEntityForward.toString ah$a(long j) {
        return this.values;
    }
}
