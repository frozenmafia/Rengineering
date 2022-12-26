package o;

import com.app.dream11.myprofile.profilerevamp.profilemapper.UserType;
import o.State;
/* renamed from: o.percent  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0384percent {
    private final State.AnonymousClass1 ag$a;
    private final C0370fixed ah$a;
    private final UserType toString;
    private final C0378helper valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0384percent) {
            C0384percent c0384percent = (C0384percent) obj;
            return runAnimators.values((Object) this.values, (Object) c0384percent.values) && this.toString == c0384percent.toString && runAnimators.values(this.ag$a, c0384percent.ag$a) && runAnimators.values(this.ah$a, c0384percent.ah$a) && runAnimators.values(this.valueOf, c0384percent.valueOf);
        }
        return false;
    }

    public int hashCode() {
        String str = this.values;
        int hashCode = str == null ? 0 : str.hashCode();
        UserType userType = this.toString;
        int hashCode2 = userType == null ? 0 : userType.hashCode();
        State.AnonymousClass1 anonymousClass1 = this.ag$a;
        int hashCode3 = anonymousClass1 == null ? 0 : anonymousClass1.hashCode();
        C0370fixed c0370fixed = this.ah$a;
        int hashCode4 = c0370fixed == null ? 0 : c0370fixed.hashCode();
        C0378helper c0378helper = this.valueOf;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (c0378helper != null ? c0378helper.hashCode() : 0);
    }

    public String toString() {
        String str = this.values;
        UserType userType = this.toString;
        State.AnonymousClass1 anonymousClass1 = this.ag$a;
        C0370fixed c0370fixed = this.ah$a;
        C0378helper c0378helper = this.valueOf;
        return "CareerStatsBreakUpQueryResponse(teamName=" + str + ", userType=" + userType + ", userTeamPrivacy=" + anonymousClass1 + ", careerStatsBreakup=" + c0370fixed + ", recentMatch=" + c0378helper + ")";
    }

    public C0384percent(String str, UserType userType, State.AnonymousClass1 anonymousClass1, C0370fixed c0370fixed, C0378helper c0378helper) {
        this.values = str;
        this.toString = userType;
        this.ag$a = anonymousClass1;
        this.ah$a = c0370fixed;
        this.valueOf = c0378helper;
    }

    public final String ag$a() {
        return this.values;
    }

    public final UserType ah$b() {
        return this.toString;
    }

    public final State.AnonymousClass1 values() {
        return this.ag$a;
    }

    public final C0370fixed ah$a() {
        return this.ah$a;
    }

    public final C0378helper valueOf() {
        return this.valueOf;
    }
}
