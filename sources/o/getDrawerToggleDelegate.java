package o;

import com.app.dream11.contest.ContestUpdateType;
import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
/* loaded from: classes.dex */
public final class getDrawerToggleDelegate {
    private final String ah$a;
    private final ContestUpdateType valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getDrawerToggleDelegate) {
            getDrawerToggleDelegate getdrawertoggledelegate = (getDrawerToggleDelegate) obj;
            return runAnimators.values((Object) this.ah$a, (Object) getdrawertoggledelegate.ah$a) && this.valueOf == getdrawertoggledelegate.valueOf;
        }
        return false;
    }

    public int hashCode() {
        return (this.ah$a.hashCode() * 31) + this.valueOf.hashCode();
    }

    public String toString() {
        String str = this.ah$a;
        ContestUpdateType contestUpdateType = this.valueOf;
        return "ContestItemUpdate(contestId=" + str + ", update=" + contestUpdateType + ")";
    }

    public getDrawerToggleDelegate(String str, ContestUpdateType contestUpdateType) {
        runAnimators.ag$a(str, CompareTeamFlowState.CONTEST_ID);
        runAnimators.ag$a(contestUpdateType, "update");
        this.ah$a = str;
        this.valueOf = contestUpdateType;
    }

    public final String ah$a() {
        return this.ah$a;
    }

    public final ContestUpdateType valueOf() {
        return this.valueOf;
    }
}
