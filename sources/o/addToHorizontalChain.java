package o;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.Date;
/* loaded from: classes3.dex */
public final class addToHorizontalChain {
    private final String ag$a;
    private final String ah$a;
    private final String toString;
    private final Date valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof addToHorizontalChain) {
            addToHorizontalChain addtohorizontalchain = (addToHorizontalChain) obj;
            return runAnimators.values((Object) this.toString, (Object) addtohorizontalchain.toString) && runAnimators.values((Object) this.ah$a, (Object) addtohorizontalchain.ah$a) && runAnimators.values((Object) this.ag$a, (Object) addtohorizontalchain.ag$a) && runAnimators.values((Object) this.values, (Object) addtohorizontalchain.values) && runAnimators.values(this.valueOf, addtohorizontalchain.valueOf);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.toString.hashCode() * 31) + this.ah$a.hashCode()) * 31) + this.ag$a.hashCode()) * 31) + this.values.hashCode()) * 31) + this.valueOf.hashCode();
    }

    public String toString() {
        String str = this.toString;
        String str2 = this.ah$a;
        String str3 = this.ag$a;
        String str4 = this.values;
        Date date = this.valueOf;
        return "MatchDetailsData(teamName1=" + str + ", teamIconUrl1=" + str2 + ", teamName2=" + str3 + ", teamIconUrl2=" + str4 + ", startTime=" + date + ")";
    }

    public addToHorizontalChain(String str, String str2, String str3, String str4, Date date) {
        runAnimators.ag$a(str, "teamName1");
        runAnimators.ag$a(str2, "teamIconUrl1");
        runAnimators.ag$a(str3, "teamName2");
        runAnimators.ag$a(str4, "teamIconUrl2");
        runAnimators.ag$a(date, HeadToHeadMatchPickerFlowState.START_TIME);
        this.toString = str;
        this.ah$a = str2;
        this.ag$a = str3;
        this.values = str4;
        this.valueOf = date;
    }

    public final String ag$a() {
        return this.toString;
    }

    public final String valueOf() {
        return this.ah$a;
    }

    public final String ah$b() {
        return this.ag$a;
    }

    public final String ah$a() {
        return this.values;
    }

    public final Date values() {
        return this.valueOf;
    }
}
