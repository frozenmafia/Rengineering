package o;
/* loaded from: classes5.dex */
public final class getMoveDuration {
    public final boolean ag$a;
    public final boolean ah$a;
    public final addViewInt toString;
    public final long valueOf;
    public final long values;

    public getMoveDuration(long j, addViewInt addviewint, long j2, boolean z, boolean z2) {
        this.values = j;
        if (addviewint.HaptikSDK$c() && !addviewint.ah$a()) {
            throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
        }
        this.toString = addviewint;
        this.valueOf = j2;
        this.ah$a = z;
        this.ag$a = z2;
    }

    public getMoveDuration valueOf(long j) {
        return new getMoveDuration(this.values, this.toString, j, this.ah$a, this.ag$a);
    }

    public getMoveDuration values() {
        return new getMoveDuration(this.values, this.toString, this.valueOf, true, this.ag$a);
    }

    public getMoveDuration ah$a(boolean z) {
        return new getMoveDuration(this.values, this.toString, this.valueOf, this.ah$a, z);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        getMoveDuration getmoveduration = (getMoveDuration) obj;
        return this.values == getmoveduration.values && this.toString.equals(getmoveduration.toString) && this.valueOf == getmoveduration.valueOf && this.ah$a == getmoveduration.ah$a && this.ag$a == getmoveduration.ag$a;
    }

    public int hashCode() {
        int hashCode = Long.valueOf(this.values).hashCode();
        int hashCode2 = this.toString.hashCode();
        return (((((((hashCode * 31) + hashCode2) * 31) + Long.valueOf(this.valueOf).hashCode()) * 31) + Boolean.valueOf(this.ah$a).hashCode()) * 31) + Boolean.valueOf(this.ag$a).hashCode();
    }

    public String toString() {
        return "TrackedQuery{id=" + this.values + ", querySpec=" + this.toString + ", lastUse=" + this.valueOf + ", complete=" + this.ah$a + ", active=" + this.ag$a + "}";
    }
}
