package o;

import com.app.dream11.core.service.graphql.api.type.UserVerificationStatus;
/* loaded from: classes3.dex */
public final class XYZToColor {
    private final String HaptikSDK$a;
    private final UserVerificationStatus HaptikSDK$c;
    private final String ag$a;
    private final String ah$a;
    private final String toString;
    private final String valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof XYZToColor) {
            XYZToColor xYZToColor = (XYZToColor) obj;
            return runAnimators.values((Object) this.HaptikSDK$a, (Object) xYZToColor.HaptikSDK$a) && runAnimators.values((Object) this.ag$a, (Object) xYZToColor.ag$a) && runAnimators.values((Object) this.valueOf, (Object) xYZToColor.valueOf) && runAnimators.values((Object) this.ah$a, (Object) xYZToColor.ah$a) && this.HaptikSDK$c == xYZToColor.HaptikSDK$c && runAnimators.values((Object) this.toString, (Object) xYZToColor.toString) && runAnimators.values((Object) this.values, (Object) xYZToColor.values);
        }
        return false;
    }

    public int hashCode() {
        String str = this.HaptikSDK$a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ag$a;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.valueOf;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.ah$a;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        int hashCode5 = this.HaptikSDK$c.hashCode();
        String str5 = this.toString;
        int hashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.values;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.HaptikSDK$a;
        String str2 = this.ag$a;
        String str3 = this.valueOf;
        String str4 = this.ah$a;
        UserVerificationStatus userVerificationStatus = this.HaptikSDK$c;
        String str5 = this.toString;
        String str6 = this.values;
        return "PanDetail(pan=" + str + ", maskedPan=" + str2 + ", name=" + str3 + ", dateOfBirth=" + str4 + ", status=" + userVerificationStatus + ", comments=" + str5 + ", inReviewMessage=" + str6 + ")";
    }

    public XYZToColor(String str, String str2, String str3, String str4, UserVerificationStatus userVerificationStatus, String str5, String str6) {
        runAnimators.ag$a(userVerificationStatus, "status");
        this.HaptikSDK$a = str;
        this.ag$a = str2;
        this.valueOf = str3;
        this.ah$a = str4;
        this.HaptikSDK$c = userVerificationStatus;
        this.toString = str5;
        this.values = str6;
    }

    public final String values() {
        return this.ag$a;
    }

    public final String HaptikSDK$b() {
        return this.valueOf;
    }

    public final String ag$a() {
        return this.ah$a;
    }

    public final UserVerificationStatus ah$b() {
        return this.HaptikSDK$c;
    }

    public final String ah$a() {
        return this.toString;
    }

    public final String valueOf() {
        return this.values;
    }
}
