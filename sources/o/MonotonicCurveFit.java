package o;
/* loaded from: classes3.dex */
public final class MonotonicCurveFit {
    private final String ah$a;
    private final String toString;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MonotonicCurveFit) {
            MonotonicCurveFit monotonicCurveFit = (MonotonicCurveFit) obj;
            return runAnimators.values((Object) this.toString, (Object) monotonicCurveFit.toString) && runAnimators.values((Object) this.values, (Object) monotonicCurveFit.values) && runAnimators.values((Object) this.ah$a, (Object) monotonicCurveFit.ah$a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.toString.hashCode() * 31) + this.values.hashCode()) * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        String str = this.toString;
        String str2 = this.values;
        String str3 = this.ah$a;
        return "BowlerModel(name=" + str + ", oversBowled=" + str2 + ", runsGivenWicketsTaken=" + str3 + ")";
    }

    public MonotonicCurveFit(String str, String str2, String str3) {
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(str2, "oversBowled");
        runAnimators.ag$a(str3, "runsGivenWicketsTaken");
        this.toString = str;
        this.values = str2;
        this.ah$a = str3;
    }

    public final String ah$a() {
        return this.ah$a;
    }

    public final String valueOf() {
        return this.values;
    }

    public final String values() {
        return this.toString;
    }
}
