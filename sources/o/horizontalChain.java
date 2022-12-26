package o;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.Date;
import java.util.List;
/* loaded from: classes3.dex */
public final class horizontalChain {
    private final Date HaptikSDK$a;
    private final Integer HaptikSDK$b;
    private final List<verticalGuideline> HaptikSDK$c;
    private final directMapping ag$a;
    private final Double ah$a;
    private final String ah$b;
    private final Integer getSignupData;
    private final String invoke;
    private final String toString;
    private final int valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof horizontalChain) {
            horizontalChain horizontalchain = (horizontalChain) obj;
            return this.valueOf == horizontalchain.valueOf && runAnimators.values(this.HaptikSDK$b, horizontalchain.HaptikSDK$b) && runAnimators.values((Object) this.values, (Object) horizontalchain.values) && runAnimators.values(this.HaptikSDK$a, horizontalchain.HaptikSDK$a) && runAnimators.values(this.getSignupData, horizontalchain.getSignupData) && runAnimators.values(this.ah$a, horizontalchain.ah$a) && runAnimators.values((Object) this.invoke, (Object) horizontalchain.invoke) && runAnimators.values((Object) this.toString, (Object) horizontalchain.toString) && runAnimators.values((Object) this.ah$b, (Object) horizontalchain.ah$b) && runAnimators.values(this.HaptikSDK$c, horizontalchain.HaptikSDK$c) && runAnimators.values(this.ag$a, horizontalchain.ag$a);
        }
        return false;
    }

    public int hashCode() {
        int i = this.valueOf;
        Integer num = this.HaptikSDK$b;
        int hashCode = num == null ? 0 : num.hashCode();
        int hashCode2 = this.values.hashCode();
        int hashCode3 = this.HaptikSDK$a.hashCode();
        Integer num2 = this.getSignupData;
        int hashCode4 = num2 == null ? 0 : num2.hashCode();
        Double d = this.ah$a;
        return (((((((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (d != null ? d.hashCode() : 0)) * 31) + this.invoke.hashCode()) * 31) + this.toString.hashCode()) * 31) + this.ah$b.hashCode()) * 31) + this.HaptikSDK$c.hashCode()) * 31) + this.ag$a.hashCode();
    }

    public String toString() {
        int i = this.valueOf;
        Integer num = this.HaptikSDK$b;
        String str = this.values;
        Date date = this.HaptikSDK$a;
        Integer num2 = this.getSignupData;
        Double d = this.ah$a;
        String str2 = this.invoke;
        String str3 = this.toString;
        String str4 = this.ah$b;
        List<verticalGuideline> list = this.HaptikSDK$c;
        directMapping directmapping = this.ag$a;
        return "RecentMatchEdge(id=" + i + ", tourId=" + num + ", name=" + str + ", startTime=" + date + ", userTeamsCount=" + num2 + ", dreamTeamPoint=" + d + ", slug=" + str2 + ", gameDisplayName=" + str3 + ", roundResult=" + str4 + ", squads=" + list + ", bestUserTeam=" + directmapping + ")";
    }

    public horizontalChain(int i, Integer num, String str, Date date, Integer num2, Double d, String str2, String str3, String str4, List<verticalGuideline> list, directMapping directmapping) {
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(date, HeadToHeadMatchPickerFlowState.START_TIME);
        runAnimators.ag$a(str2, "slug");
        runAnimators.ag$a(str3, "gameDisplayName");
        runAnimators.ag$a(str4, "roundResult");
        runAnimators.ag$a(list, "squads");
        runAnimators.ag$a(directmapping, "bestUserTeam");
        this.valueOf = i;
        this.HaptikSDK$b = num;
        this.values = str;
        this.HaptikSDK$a = date;
        this.getSignupData = num2;
        this.ah$a = d;
        this.invoke = str2;
        this.toString = str3;
        this.ah$b = str4;
        this.HaptikSDK$c = list;
        this.ag$a = directmapping;
    }

    public final int values() {
        return this.valueOf;
    }

    public final Integer ah$b() {
        return this.HaptikSDK$b;
    }

    public final Date HaptikSDK$a() {
        return this.HaptikSDK$a;
    }

    public final Integer HaptikSDK$d() {
        return this.getSignupData;
    }

    public final Double valueOf() {
        return this.ah$a;
    }

    public final String HaptikSDK$b() {
        return this.invoke;
    }

    public final String ag$a() {
        return this.toString;
    }

    public final String HaptikSDK$c() {
        return this.ah$b;
    }

    public final List<verticalGuideline> invoke() {
        return this.HaptikSDK$c;
    }

    public final directMapping ah$a() {
        return this.ag$a;
    }
}
