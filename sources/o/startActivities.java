package o;

import com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery;
/* loaded from: classes3.dex */
public final class startActivities {
    private String ag$a;
    private String ah$a;
    private int toString;
    private String valueOf;
    private String values;

    public String toString() {
        String str = this.values;
        String str2 = this.ah$a;
        int i = this.toString;
        String str3 = this.ag$a;
        String str4 = this.valueOf;
        return "NewCreateTeamSquadVM(squadName=" + str + ", squadShortName=" + str2 + ", squadId=" + i + ", squadFlagUrl=" + str3 + ", flagImageWithName=" + str4 + ")";
    }

    public startActivities(String str, String str2, int i, String str3, String str4) {
        runAnimators.ag$a(str, "squadName");
        runAnimators.ag$a(str2, "squadShortName");
        runAnimators.ag$a(str3, "squadFlagUrl");
        runAnimators.ag$a(str4, "flagImageWithName");
        this.values = str;
        this.ah$a = str2;
        this.toString = i;
        this.ag$a = str3;
        this.valueOf = str4;
    }

    public final String ah$a() {
        return this.ah$a;
    }

    public final int valueOf() {
        return this.toString;
    }

    public final String ag$a() {
        return this.ag$a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public startActivities(ShmeCreateTeamQuery.Squad squad) {
        this(squad.getName(), squad.getShortName(), squad.getId(), squad.getFlag().size() > 0 ? squad.getFlag().get(0).getSrc() : "", squad.getFlagWithName().size() > 0 ? squad.getFlagWithName().get(0).getSrc() : "");
        runAnimators.ag$a(squad, "squad");
    }

    public boolean equals(Object obj) {
        return (obj instanceof startActivities) && ((startActivities) obj).toString == this.toString;
    }

    public int hashCode() {
        return this.toString;
    }
}
