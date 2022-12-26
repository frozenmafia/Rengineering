package o;
/* loaded from: classes4.dex */
public class setAllowReturnTransitionOverlap implements setHideReplaced {
    @Override // o.setHideReplaced
    public setArguments values() {
        return new setArguments() { // from class: o.setAllowReturnTransitionOverlap.2
            @Override // java.util.Comparator
            /* renamed from: valueOf */
            public int compare(setAnimatingAway$ah$a setanimatingaway_ah_a, setAnimatingAway$ah$a setanimatingaway_ah_a2) {
                long ag$a = setanimatingaway_ah_a.ag$a();
                long ag$a2 = setanimatingaway_ah_a2.ag$a();
                if (ag$a < ag$a2) {
                    return -1;
                }
                return ag$a2 == ag$a ? 0 : 1;
            }
        };
    }
}
