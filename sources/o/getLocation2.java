package o;

import com.app.dream11.core.service.graphql.api.fragment.ContestItem;
import java.util.List;
/* loaded from: classes3.dex */
public final class getLocation2 {
    private final Integer ag$a;
    private final Integer ah$a;
    private final List<ContestItem> valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getLocation2) {
            getLocation2 getlocation2 = (getLocation2) obj;
            return runAnimators.values(this.ag$a, getlocation2.ag$a) && runAnimators.values(this.valueOf, getlocation2.valueOf) && runAnimators.values(this.ah$a, getlocation2.ah$a);
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.ag$a;
        int hashCode = num == null ? 0 : num.hashCode();
        int hashCode2 = this.valueOf.hashCode();
        Integer num2 = this.ah$a;
        return (((hashCode * 31) + hashCode2) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.ag$a;
        List<ContestItem> list = this.valueOf;
        Integer num2 = this.ah$a;
        return "ContestInvitationsListData(nextPage=" + num + ", contestItemList=" + list + ", invitationCount=" + num2 + ")";
    }

    public getLocation2(Integer num, List<ContestItem> list, Integer num2) {
        runAnimators.ag$a(list, "contestItemList");
        this.ag$a = num;
        this.valueOf = list;
        this.ah$a = num2;
    }

    public final List<ContestItem> ag$a() {
        return this.valueOf;
    }

    public final Integer values() {
        return this.ag$a;
    }

    public final Integer ah$a() {
        return this.ah$a;
    }
}
