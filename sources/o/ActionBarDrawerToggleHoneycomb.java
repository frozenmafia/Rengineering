package o;
/* loaded from: classes.dex */
public final class ActionBarDrawerToggleHoneycomb {
    private final Integer ah$a;
    private final Integer toString;
    private final Integer valueOf;
    private final Integer values;

    public ActionBarDrawerToggleHoneycomb() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActionBarDrawerToggleHoneycomb) {
            ActionBarDrawerToggleHoneycomb actionBarDrawerToggleHoneycomb = (ActionBarDrawerToggleHoneycomb) obj;
            return runAnimators.values(this.toString, actionBarDrawerToggleHoneycomb.toString) && runAnimators.values(this.values, actionBarDrawerToggleHoneycomb.values) && runAnimators.values(this.ah$a, actionBarDrawerToggleHoneycomb.ah$a) && runAnimators.values(this.valueOf, actionBarDrawerToggleHoneycomb.valueOf);
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.toString;
        int hashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.values;
        int hashCode2 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.ah$a;
        int hashCode3 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.valueOf;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.toString;
        Integer num2 = this.values;
        Integer num3 = this.ah$a;
        Integer num4 = this.valueOf;
        return "ContestInvitationSectionCountInfo(invitationCount=" + num + ", joinedContestCount=" + num2 + ", pendingInvitationCount=" + num3 + ", contestFilledCount=" + num4 + ")";
    }

    public ActionBarDrawerToggleHoneycomb(Integer num, Integer num2, Integer num3, Integer num4) {
        this.toString = num;
        this.values = num2;
        this.ah$a = num3;
        this.valueOf = num4;
    }

    public /* synthetic */ ActionBarDrawerToggleHoneycomb(Integer num, Integer num2, Integer num3, Integer num4, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2, (i & 4) != 0 ? 0 : num3, (i & 8) != 0 ? 0 : num4);
    }

    public final Integer values() {
        return this.toString;
    }

    public final Integer ah$a() {
        return this.ah$a;
    }
}
