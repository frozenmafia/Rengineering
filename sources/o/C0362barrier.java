package o;

import com.app.dream11.myprofile.profilerevamp.profilemapper.StatType;
/* renamed from: o.barrier  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0362barrier {
    private final String ag$a;
    private final StatType ah$a;
    private final String invoke;
    private final String toString;
    private final String valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0362barrier) {
            C0362barrier c0362barrier = (C0362barrier) obj;
            return runAnimators.values((Object) this.toString, (Object) c0362barrier.toString) && runAnimators.values((Object) this.ag$a, (Object) c0362barrier.ag$a) && this.ah$a == c0362barrier.ah$a && runAnimators.values((Object) this.values, (Object) c0362barrier.values) && runAnimators.values((Object) this.invoke, (Object) c0362barrier.invoke) && runAnimators.values((Object) this.valueOf, (Object) c0362barrier.valueOf);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.toString.hashCode();
        int hashCode2 = this.ag$a.hashCode();
        int hashCode3 = this.ah$a.hashCode();
        int hashCode4 = this.values.hashCode();
        String str = this.invoke;
        int hashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.valueOf;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.toString;
        String str2 = this.ag$a;
        StatType statType = this.ah$a;
        String str3 = this.values;
        String str4 = this.invoke;
        String str5 = this.valueOf;
        return "CareerStatEdge(opp=" + str + ", statName=" + str2 + ", statType=" + statType + ", you=" + str3 + ", youDisplayName=" + str4 + ", oppDisplayName=" + str5 + ")";
    }

    public final String ah$a() {
        return this.toString;
    }

    public final String values() {
        return this.ag$a;
    }

    public final String valueOf() {
        return this.values;
    }

    public final String HaptikSDK$a() {
        return this.invoke;
    }

    public final String ag$a() {
        return this.valueOf;
    }
}
