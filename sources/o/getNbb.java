package o;

import com.app.dream11.core.service.graphql.api.type.UserVerificationStatus;
/* loaded from: classes3.dex */
public final class getNbb {
    private final UserVerificationStatus HaptikSDK$a;
    private final String HaptikSDK$b;
    private final String HaptikSDK$c;
    private final String ag$a;
    private final String ah$a;
    private final String ah$b;
    private final Integer invoke;
    private final String toString;
    private final String valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getNbb) {
            getNbb getnbb = (getNbb) obj;
            return runAnimators.values((Object) this.ah$a, (Object) getnbb.ah$a) && runAnimators.values((Object) this.HaptikSDK$c, (Object) getnbb.HaptikSDK$c) && runAnimators.values((Object) this.toString, (Object) getnbb.toString) && runAnimators.values((Object) this.HaptikSDK$b, (Object) getnbb.HaptikSDK$b) && runAnimators.values((Object) this.ag$a, (Object) getnbb.ag$a) && runAnimators.values(this.invoke, getnbb.invoke) && runAnimators.values((Object) this.ah$b, (Object) getnbb.ah$b) && this.HaptikSDK$a == getnbb.HaptikSDK$a && runAnimators.values((Object) this.values, (Object) getnbb.values) && runAnimators.values((Object) this.valueOf, (Object) getnbb.valueOf);
        }
        return false;
    }

    public int hashCode() {
        String str = this.ah$a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.HaptikSDK$c;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.toString;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.HaptikSDK$b;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.ag$a;
        int hashCode5 = str5 == null ? 0 : str5.hashCode();
        Integer num = this.invoke;
        int hashCode6 = num == null ? 0 : num.hashCode();
        String str6 = this.ah$b;
        int hashCode7 = str6 == null ? 0 : str6.hashCode();
        int hashCode8 = this.HaptikSDK$a.hashCode();
        String str7 = this.values;
        int hashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.valueOf;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        String str = this.ah$a;
        String str2 = this.HaptikSDK$c;
        String str3 = this.toString;
        String str4 = this.HaptikSDK$b;
        String str5 = this.ag$a;
        Integer num = this.invoke;
        String str6 = this.ah$b;
        UserVerificationStatus userVerificationStatus = this.HaptikSDK$a;
        String str7 = this.values;
        String str8 = this.valueOf;
        return "BankDetail(accountNo=" + str + ", maskedAccountNo=" + str2 + ", ifsc=" + str3 + ", nameOfBank=" + str4 + ", branchName=" + str5 + ", stateId=" + num + ", stateName=" + str6 + ", status=" + userVerificationStatus + ", comments=" + str7 + ", inReviewMessage=" + str8 + ")";
    }

    public getNbb(String str, String str2, String str3, String str4, String str5, Integer num, String str6, UserVerificationStatus userVerificationStatus, String str7, String str8) {
        runAnimators.ag$a(userVerificationStatus, "status");
        this.ah$a = str;
        this.HaptikSDK$c = str2;
        this.toString = str3;
        this.HaptikSDK$b = str4;
        this.ag$a = str5;
        this.invoke = num;
        this.ah$b = str6;
        this.HaptikSDK$a = userVerificationStatus;
        this.values = str7;
        this.valueOf = str8;
    }

    public final String ah$b() {
        return this.HaptikSDK$c;
    }

    public final String values() {
        return this.toString;
    }

    public final String HaptikSDK$b() {
        return this.HaptikSDK$b;
    }

    public final String valueOf() {
        return this.ag$a;
    }

    public final String HaptikSDK$c() {
        return this.ah$b;
    }

    public final UserVerificationStatus invoke() {
        return this.HaptikSDK$a;
    }

    public final String ah$a() {
        return this.values;
    }

    public final String ag$a() {
        return this.valueOf;
    }
}
