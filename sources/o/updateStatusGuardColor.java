package o;

import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
/* loaded from: classes.dex */
public final class updateStatusGuardColor {
    private final int HaptikSDK$a;
    private final String HaptikSDK$b;
    private final String HaptikSDK$c;
    private final double ag$a;
    private final double ah$a;
    private final int ah$b;
    private final int getInitSettings;
    private final double invoke;
    private final updateResourcesConfigurationForNightMode$ag$a toString;
    private final String valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof updateStatusGuardColor) {
            updateStatusGuardColor updatestatusguardcolor = (updateStatusGuardColor) obj;
            return this.HaptikSDK$a == updatestatusguardcolor.HaptikSDK$a && runAnimators.values((Object) this.HaptikSDK$c, (Object) updatestatusguardcolor.HaptikSDK$c) && runAnimators.values(Double.valueOf(this.ag$a), Double.valueOf(updatestatusguardcolor.ag$a)) && this.ah$b == updatestatusguardcolor.ah$b && runAnimators.values((Object) this.HaptikSDK$b, (Object) updatestatusguardcolor.HaptikSDK$b) && runAnimators.values(Double.valueOf(this.invoke), Double.valueOf(updatestatusguardcolor.invoke)) && runAnimators.values(Double.valueOf(this.ah$a), Double.valueOf(updatestatusguardcolor.ah$a)) && runAnimators.values((Object) this.values, (Object) updatestatusguardcolor.values) && runAnimators.values(this.toString, updatestatusguardcolor.toString) && runAnimators.values((Object) this.valueOf, (Object) updatestatusguardcolor.valueOf) && this.getInitSettings == updatestatusguardcolor.getInitSettings;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((this.HaptikSDK$a * 31) + this.HaptikSDK$c.hashCode()) * 31) + Double.doubleToLongBits(this.ag$a)) * 31) + this.ah$b) * 31) + this.HaptikSDK$b.hashCode()) * 31) + Double.doubleToLongBits(this.invoke)) * 31) + Double.doubleToLongBits(this.ah$a)) * 31) + this.values.hashCode()) * 31) + this.toString.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.getInitSettings;
    }

    public String toString() {
        int i = this.HaptikSDK$a;
        String str = this.HaptikSDK$c;
        double d = this.ag$a;
        int i2 = this.ah$b;
        String str2 = this.HaptikSDK$b;
        double d2 = this.invoke;
        double d3 = this.ah$a;
        String str3 = this.values;
        updateResourcesConfigurationForNightMode$ag$a updateresourcesconfigurationfornightmode_ag_a = this.toString;
        String str4 = this.valueOf;
        int i3 = this.getInitSettings;
        return "HeadToHeadRematchData(myUserId=" + i + ", myTeamName=" + str + ", myScore=" + d + ", oppUserId=" + i2 + ", oppTeamName=" + str2 + ", oppScore=" + d2 + ", entryFee=" + d3 + ", firstMessage=" + str3 + ", callback=" + updateresourcesconfigurationfornightmode_ag_a + ", contestId=" + str4 + ", roundId=" + i3 + ")";
    }

    public updateStatusGuardColor(int i, String str, double d, int i2, String str2, double d2, double d3, String str3, updateResourcesConfigurationForNightMode$ag$a updateresourcesconfigurationfornightmode_ag_a, String str4, int i3) {
        runAnimators.ag$a(str, "myTeamName");
        runAnimators.ag$a(str2, "oppTeamName");
        runAnimators.ag$a(str3, "firstMessage");
        runAnimators.ag$a(updateresourcesconfigurationfornightmode_ag_a, "callback");
        runAnimators.ag$a(str4, CompareTeamFlowState.CONTEST_ID);
        this.HaptikSDK$a = i;
        this.HaptikSDK$c = str;
        this.ag$a = d;
        this.ah$b = i2;
        this.HaptikSDK$b = str2;
        this.invoke = d2;
        this.ah$a = d3;
        this.values = str3;
        this.toString = updateresourcesconfigurationfornightmode_ag_a;
        this.valueOf = str4;
        this.getInitSettings = i3;
    }

    public final double HaptikSDK$a() {
        return this.ag$a;
    }

    public final String HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    public final int ah$b() {
        return this.HaptikSDK$a;
    }

    public final double HaptikSDK$c() {
        return this.invoke;
    }

    public final int HaptikSDK$d() {
        return this.ah$b;
    }

    public final String invoke() {
        return this.HaptikSDK$b;
    }

    public final String ag$a() {
        return this.values;
    }

    public final double ah$a() {
        return this.ah$a;
    }

    public final updateResourcesConfigurationForNightMode$ag$a values() {
        return this.toString;
    }

    public final int getInitSettings() {
        return this.getInitSettings;
    }

    public final String valueOf() {
        return this.valueOf;
    }
}
