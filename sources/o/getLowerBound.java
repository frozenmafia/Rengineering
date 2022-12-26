package o;

import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public class getLowerBound<A, B> {
    private final WindowInsetsControllerCompat.Impl23<getLowerBound$ah$a<A>, B> valueOf;

    public getLowerBound() {
        this(250L);
    }

    public getLowerBound(long j) {
        this.valueOf = new WindowInsetsControllerCompat.Impl23<getLowerBound$ah$a<A>, B>(j) { // from class: o.getLowerBound.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // o.WindowInsetsControllerCompat.Impl23
            /* renamed from: toString */
            public void values(getLowerBound$ah$a<A> getlowerbound_ah_a, B b2) {
                getlowerbound_ah_a.ag$a();
            }
        };
    }

    public B ah$a(A a, int i, int i2) {
        getLowerBound$ah$a<A> valueOf = getLowerBound$ah$a.valueOf(a, i, i2);
        B valueOf2 = this.valueOf.valueOf((WindowInsetsControllerCompat.Impl23<getLowerBound$ah$a<A>, B>) valueOf);
        valueOf.ag$a();
        return valueOf2;
    }

    public void valueOf(A a, int i, int i2, B b2) {
        this.valueOf.ag$a(getLowerBound$ah$a.valueOf(a, i, i2), b2);
    }
}
