package o;

import com.app.dream11.contest.ContestItemVM;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SetBias {
    private final Integer ah$a;
    private final List<ContestItemVM> valueOf;
    private final Integer values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetBias) {
            SetBias setBias = (SetBias) obj;
            return runAnimators.values(this.values, setBias.values) && runAnimators.values(this.valueOf, setBias.valueOf) && runAnimators.values(this.ah$a, setBias.ah$a);
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.values;
        int hashCode = num == null ? 0 : num.hashCode();
        int hashCode2 = this.valueOf.hashCode();
        Integer num2 = this.ah$a;
        return (((hashCode * 31) + hashCode2) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.values;
        List<ContestItemVM> list = this.valueOf;
        Integer num2 = this.ah$a;
        return "ContestInvitationData(nextPage=" + num + ", contestListVM=" + list + ", inviteCount=" + num2 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SetBias(Integer num, List<? extends ContestItemVM> list, Integer num2) {
        runAnimators.ag$a(list, "contestListVM");
        this.values = num;
        this.valueOf = list;
        this.ah$a = num2;
    }

    public final Integer ag$a() {
        return this.values;
    }

    public final List<ContestItemVM> values() {
        return this.valueOf;
    }

    public final Integer valueOf() {
        return this.ah$a;
    }
}
