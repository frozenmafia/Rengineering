package o;
/* loaded from: classes7.dex */
public final class getTransitionCount extends setupStartEndListeners implements getPropagationProperties<Long> {
    public static final getTransitionCount$ag$a valueOf = new getTransitionCount$ag$a(null);
    private static final getTransitionCount ag$a = new getTransitionCount(1, 0);

    public getTransitionCount(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // o.getPropagationProperties
    /* renamed from: invoke */
    public Long getStart() {
        return Long.valueOf(values());
    }

    @Override // o.getPropagationProperties
    /* renamed from: HaptikSDK$c */
    public Long getEndInclusive() {
        return Long.valueOf(ag$a());
    }

    public boolean valueOf(long j) {
        return values() <= j && j <= ag$a();
    }

    @Override // o.setupStartEndListeners
    public boolean valueOf() {
        return values() > ag$a();
    }

    @Override // o.setupStartEndListeners
    public boolean equals(Object obj) {
        if (obj instanceof getTransitionCount) {
            if (!valueOf() || !((getTransitionCount) obj).valueOf()) {
                getTransitionCount gettransitioncount = (getTransitionCount) obj;
                if (values() != gettransitioncount.values() || ag$a() != gettransitioncount.ag$a()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.setupStartEndListeners
    public int hashCode() {
        if (valueOf()) {
            return -1;
        }
        return (int) ((31 * (values() ^ (values() >>> 32))) + (ag$a() ^ (ag$a() >>> 32)));
    }

    @Override // o.setupStartEndListeners
    public String toString() {
        return values() + ".." + ag$a();
    }
}
