package o;
/* loaded from: classes3.dex */
public final class StateSet {
    private final int ag$a;
    private final int ah$a;
    private final String toString;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StateSet) {
            StateSet stateSet = (StateSet) obj;
            return this.ag$a == stateSet.ag$a && runAnimators.values((Object) this.toString, (Object) stateSet.toString) && this.ah$a == stateSet.ah$a && runAnimators.values((Object) this.values, (Object) stateSet.values);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.ag$a * 31) + this.toString.hashCode()) * 31) + this.ah$a) * 31) + this.values.hashCode();
    }

    public String toString() {
        int i = this.ag$a;
        String str = this.toString;
        int i2 = this.ah$a;
        String str2 = this.values;
        return "ContestConfig(roundId=" + i + ", leagueId=" + str + ", tourId=" + i2 + ", slug=" + str2 + ")";
    }

    public StateSet(int i, String str, int i2, String str2) {
        runAnimators.ag$a(str, "leagueId");
        runAnimators.ag$a(str2, "slug");
        this.ag$a = i;
        this.toString = str;
        this.ah$a = i2;
        this.values = str2;
    }

    public final String ag$a() {
        return this.toString;
    }

    public final int ah$a() {
        return this.ag$a;
    }

    public final int valueOf() {
        return this.ah$a;
    }

    public final String values() {
        return this.values;
    }
}
