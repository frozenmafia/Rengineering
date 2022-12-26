package o;
/* loaded from: classes5.dex */
public final class TransitionPropagation extends removeListeners implements getPropagationProperties<Integer> {
    public static final TransitionPropagation$ag$a valueOf = new TransitionPropagation$ag$a(null);
    private static final TransitionPropagation ag$a = new TransitionPropagation(1, 0);

    public TransitionPropagation(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // o.getPropagationProperties
    /* renamed from: HaptikSDK$c */
    public Integer getStart() {
        return Integer.valueOf(ag$a());
    }

    @Override // o.getPropagationProperties
    /* renamed from: ah$b */
    public Integer getEndInclusive() {
        return Integer.valueOf(ah$a());
    }

    public boolean toString(int i) {
        return ag$a() <= i && i <= ah$a();
    }

    @Override // o.removeListeners
    public boolean valueOf() {
        return ag$a() > ah$a();
    }

    @Override // o.removeListeners
    public boolean equals(Object obj) {
        if (obj instanceof TransitionPropagation) {
            if (!valueOf() || !((TransitionPropagation) obj).valueOf()) {
                TransitionPropagation transitionPropagation = (TransitionPropagation) obj;
                if (ag$a() != transitionPropagation.ag$a() || ah$a() != transitionPropagation.ah$a()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.removeListeners
    public int hashCode() {
        if (valueOf()) {
            return -1;
        }
        return (ag$a() * 31) + ah$a();
    }

    @Override // o.removeListeners
    public String toString() {
        return ag$a() + ".." + ah$a();
    }
}
