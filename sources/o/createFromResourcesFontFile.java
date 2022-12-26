package o;
/* loaded from: classes3.dex */
public final class createFromResourcesFontFile {
    public final String HaptikSDK$c;
    public final String ag$a;
    public final String ah$a;
    public final String ah$b;
    public final String toString;
    public final String valueOf;
    public final String values;

    public createFromResourcesFontFile(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        runAnimators.ag$a(str, "storylyListEndpoint");
        runAnimators.ag$a(str2, "storylyAnalyticsEndpoint");
        runAnimators.ag$a(str3, "shareUrl");
        runAnimators.ag$a(str4, "momentsReportEndpoint");
        runAnimators.ag$a(str5, "momentsAnalyticsEndpoint");
        runAnimators.ag$a(str6, "momentsStoryGroupIdsEndpoint");
        runAnimators.ag$a(str7, "momentsStoryGroupPagedListEndpoint");
        this.valueOf = str;
        this.ah$a = str2;
        this.values = str3;
        this.ag$a = str4;
        this.toString = str5;
        this.ah$b = str6;
        this.HaptikSDK$c = str7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof createFromResourcesFontFile) {
            createFromResourcesFontFile createfromresourcesfontfile = (createFromResourcesFontFile) obj;
            return runAnimators.values((Object) this.valueOf, (Object) createfromresourcesfontfile.valueOf) && runAnimators.values((Object) this.ah$a, (Object) createfromresourcesfontfile.ah$a) && runAnimators.values((Object) this.values, (Object) createfromresourcesfontfile.values) && runAnimators.values((Object) this.ag$a, (Object) createfromresourcesfontfile.ag$a) && runAnimators.values((Object) this.toString, (Object) createfromresourcesfontfile.toString) && runAnimators.values((Object) this.ah$b, (Object) createfromresourcesfontfile.ah$b) && runAnimators.values((Object) this.HaptikSDK$c, (Object) createfromresourcesfontfile.HaptikSDK$c);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((this.valueOf.hashCode() * 31) + this.ah$a.hashCode()) * 31) + this.values.hashCode()) * 31) + this.ag$a.hashCode()) * 31) + this.toString.hashCode()) * 31) + this.ah$b.hashCode()) * 31) + this.HaptikSDK$c.hashCode();
    }

    public String toString() {
        return "EndpointConstants(storylyListEndpoint=" + this.valueOf + ", storylyAnalyticsEndpoint=" + this.ah$a + ", shareUrl=" + this.values + ", momentsReportEndpoint=" + this.ag$a + ", momentsAnalyticsEndpoint=" + this.toString + ", momentsStoryGroupIdsEndpoint=" + this.ah$b + ", momentsStoryGroupPagedListEndpoint=" + this.HaptikSDK$c + ')';
    }

    public final String valueOf() {
        return this.values;
    }
}
