package o;

import o.skipEntityForward;
/* loaded from: classes3.dex */
public final class setSpan implements markBefore {
    private final markBefore ah$a;
    private final long valueOf;

    public setSpan(long j, markBefore markbefore) {
        this.valueOf = j;
        this.ah$a = markbefore;
    }

    @Override // o.markBefore
    public dirTypeForward ah$a(int i, int i2) {
        return this.ah$a.ah$a(i, i2);
    }

    @Override // o.markBefore
    public void HaptikSDK$b() {
        this.ah$a.HaptikSDK$b();
    }

    @Override // o.markBefore
    public void ag$a(final skipEntityForward skipentityforward) {
        this.ah$a.ag$a(new skipEntityForward() { // from class: o.setSpan.4
            @Override // o.skipEntityForward
            public boolean ah$a() {
                return skipentityforward.ah$a();
            }

            @Override // o.skipEntityForward
            public long ag$a() {
                return skipentityforward.ag$a();
            }

            @Override // o.skipEntityForward
            public skipEntityForward.toString ah$a(long j) {
                skipEntityForward.toString ah$a = skipentityforward.ah$a(j);
                return new skipEntityForward.toString(new skipTagBackward(ah$a.valueOf.ag$a, ah$a.valueOf.valueOf + setSpan.this.valueOf), new skipTagBackward(ah$a.ag$a.ag$a, ah$a.ag$a.valueOf + setSpan.this.valueOf));
            }
        });
    }
}
