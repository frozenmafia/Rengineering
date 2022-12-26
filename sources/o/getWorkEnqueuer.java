package o;

import java.util.List;
/* loaded from: classes3.dex */
public final class getWorkEnqueuer {
    private final enqueueWork ag$a;
    private final Integer ah$a;
    private final Integer valueOf;
    private final List<Integer> values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getWorkEnqueuer) {
            getWorkEnqueuer getworkenqueuer = (getWorkEnqueuer) obj;
            return runAnimators.values(this.ag$a, getworkenqueuer.ag$a) && runAnimators.values(this.valueOf, getworkenqueuer.valueOf) && runAnimators.values(this.ah$a, getworkenqueuer.ah$a) && runAnimators.values(this.values, getworkenqueuer.values);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.ag$a.hashCode();
        Integer num = this.valueOf;
        int hashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.ah$a;
        int hashCode3 = num2 == null ? 0 : num2.hashCode();
        List<Integer> list = this.values;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        enqueueWork enqueuework = this.ag$a;
        Integer num = this.valueOf;
        Integer num2 = this.ah$a;
        List<Integer> list = this.values;
        return "ResponsiblePlayDepositBucket(criticality=" + enqueuework + ", min=" + num + ", max=" + num2 + ", boundaries=" + list + ")";
    }

    public getWorkEnqueuer(enqueueWork enqueuework, Integer num, Integer num2, List<Integer> list) {
        runAnimators.ag$a(enqueuework, "criticality");
        this.ag$a = enqueuework;
        this.valueOf = num;
        this.ah$a = num2;
        this.values = list;
    }

    public final enqueueWork values() {
        return this.ag$a;
    }

    public final Integer ag$a() {
        return this.valueOf;
    }

    public final Integer ah$a() {
        return this.ah$a;
    }

    public final List<Integer> valueOf() {
        return this.values;
    }
}
