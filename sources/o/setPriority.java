package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public final class setPriority extends setContent {
    private final ArrayList<getUser> ag$a;
    private final int ah$a;
    private setGroupAlertBehavior valueOf;
    private final List<Integer> values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setPriority) {
            setPriority setpriority = (setPriority) obj;
            return runAnimators.values(this.ag$a, setpriority.ag$a) && runAnimators.values(this.values, setpriority.values) && this.ah$a == setpriority.ah$a && runAnimators.values(this.valueOf, setpriority.valueOf);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.ag$a.hashCode();
        int hashCode2 = this.values.hashCode();
        int i = this.ah$a;
        setGroupAlertBehavior setgroupalertbehavior = this.valueOf;
        return (((((hashCode * 31) + hashCode2) * 31) + i) * 31) + (setgroupalertbehavior == null ? 0 : setgroupalertbehavior.hashCode());
    }

    public String toString() {
        ArrayList<getUser> arrayList = this.ag$a;
        List<Integer> list = this.values;
        int i = this.ah$a;
        setGroupAlertBehavior setgroupalertbehavior = this.valueOf;
        return "RecommendedProfileFeedData(recommendedProfileList=" + arrayList + ", indexList=" + list + ", totalCount=" + i + ", callback=" + setgroupalertbehavior + ")";
    }

    public /* synthetic */ setPriority(ArrayList arrayList, List list, int i, setGroupAlertBehavior setgroupalertbehavior, int i2, getTargetTypes gettargettypes) {
        this(arrayList, list, i, (i2 & 8) != 0 ? null : setgroupalertbehavior);
    }

    public final ArrayList<getUser> valueOf() {
        return this.ag$a;
    }

    public final int ah$a() {
        return this.ah$a;
    }

    public setPriority(ArrayList<getUser> arrayList, List<Integer> list, int i, setGroupAlertBehavior setgroupalertbehavior) {
        runAnimators.ag$a(arrayList, "recommendedProfileList");
        runAnimators.ag$a(list, "indexList");
        this.ag$a = arrayList;
        this.values = list;
        this.ah$a = i;
        this.valueOf = setgroupalertbehavior;
    }

    public final setGroupAlertBehavior ag$a() {
        return this.valueOf;
    }
}
