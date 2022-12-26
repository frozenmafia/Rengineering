package o;
/* loaded from: classes4.dex */
public final class onMetadataLoadFailed {
    private final String HaptikSDK$a;
    private final Integer HaptikSDK$b;
    private final String HaptikSDK$c;
    private final String HaptikSDK$d;
    private final Integer HaptikSDK$e;
    private final Boolean ag$a;
    private final String ah$a;
    private final Boolean ah$b;
    private final String invoke;
    private final String toString;
    private final String valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof onMetadataLoadFailed) {
            onMetadataLoadFailed onmetadataloadfailed = (onMetadataLoadFailed) obj;
            return runAnimators.values((Object) this.values, (Object) onmetadataloadfailed.values) && runAnimators.values((Object) this.HaptikSDK$d, (Object) onmetadataloadfailed.HaptikSDK$d) && runAnimators.values((Object) this.toString, (Object) onmetadataloadfailed.toString) && runAnimators.values((Object) this.HaptikSDK$c, (Object) onmetadataloadfailed.HaptikSDK$c) && runAnimators.values((Object) this.HaptikSDK$a, (Object) onmetadataloadfailed.HaptikSDK$a) && runAnimators.values((Object) this.invoke, (Object) onmetadataloadfailed.invoke) && runAnimators.values((Object) this.ah$a, (Object) onmetadataloadfailed.ah$a) && runAnimators.values((Object) this.valueOf, (Object) onmetadataloadfailed.valueOf) && runAnimators.values(this.ah$b, onmetadataloadfailed.ah$b) && runAnimators.values(this.HaptikSDK$e, onmetadataloadfailed.HaptikSDK$e) && runAnimators.values(this.ag$a, onmetadataloadfailed.ag$a) && runAnimators.values(this.HaptikSDK$b, onmetadataloadfailed.HaptikSDK$b);
        }
        return false;
    }

    public int hashCode() {
        String str = this.values;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.HaptikSDK$d;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.toString;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.HaptikSDK$c;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.HaptikSDK$a;
        int hashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.invoke;
        int hashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.ah$a;
        int hashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.valueOf;
        int hashCode8 = str8 == null ? 0 : str8.hashCode();
        Boolean bool = this.ah$b;
        int hashCode9 = bool == null ? 0 : bool.hashCode();
        Integer num = this.HaptikSDK$e;
        int hashCode10 = num == null ? 0 : num.hashCode();
        Boolean bool2 = this.ag$a;
        int hashCode11 = bool2 == null ? 0 : bool2.hashCode();
        Integer num2 = this.HaptikSDK$b;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "WebPageOtpConfiguration(issuer=" + ((Object) this.values) + ", urlRegex=" + ((Object) this.HaptikSDK$d) + ", otpInput=" + ((Object) this.toString) + ", submitButton=" + ((Object) this.HaptikSDK$c) + ", resendLink=" + ((Object) this.HaptikSDK$a) + ", senderRegex=" + ((Object) this.invoke) + ", messageBodyRegex=" + ((Object) this.ah$a) + ", otpRegex=" + ((Object) this.valueOf) + ", showResendButton=" + this.ah$b + ", timer=" + this.HaptikSDK$e + ", disableURLScan=" + this.ag$a + ", resendLimit=" + this.HaptikSDK$b + ')';
    }

    public onMetadataLoadFailed(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Integer num, Boolean bool2, Integer num2) {
        this.values = str;
        this.HaptikSDK$d = str2;
        this.toString = str3;
        this.HaptikSDK$c = str4;
        this.HaptikSDK$a = str5;
        this.invoke = str6;
        this.ah$a = str7;
        this.valueOf = str8;
        this.ah$b = bool;
        this.HaptikSDK$e = num;
        this.ag$a = bool2;
        this.HaptikSDK$b = num2;
    }

    public final String ah$a() {
        return this.toString;
    }

    public final String ah$b() {
        return this.HaptikSDK$c;
    }

    public final String values() {
        return this.HaptikSDK$a;
    }

    public final Boolean valueOf() {
        return this.ah$b;
    }

    public final Integer HaptikSDK$b() {
        return this.HaptikSDK$e;
    }

    public final Integer ag$a() {
        return this.HaptikSDK$b;
    }
}
