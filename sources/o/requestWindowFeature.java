package o;

import com.app.dream11.contest.ContestItemVM;
import com.app.dream11.core.service.graphql.api.ContestHomeQuery;
import java.util.List;
/* loaded from: classes.dex */
public class requestWindowFeature {
    requestWindowFeature$ag$a ag$a;
    public ContestHomeQuery.ContestSection ah$a;
    private int toString;
    List<ContestItemVM> valueOf;
    private boolean values;

    public requestWindowFeature(ContestHomeQuery.ContestSection contestSection, List<ContestItemVM> list, requestWindowFeature$ag$a requestwindowfeature_ag_a, int i) {
        androidx.databinding.ObservableArrayList observableArrayList = new androidx.databinding.ObservableArrayList();
        this.valueOf = observableArrayList;
        this.values = false;
        this.ah$a = contestSection;
        observableArrayList.addAll(list);
        this.ag$a = requestwindowfeature_ag_a;
        this.toString = i;
    }

    public int invoke() {
        return this.toString;
    }

    public requestWindowFeature$ag$a values() {
        return this.ag$a;
    }

    public ContestHomeQuery.ContestSection valueOf() {
        return this.ah$a;
    }

    public List<ContestItemVM> ag$a() {
        return this.valueOf;
    }

    public int ah$a() {
        return Math.max(0, Long.valueOf(this.ah$a.getTotalContestCount() - this.ah$a.getDisplayContestCount()).intValue());
    }

    public boolean HaptikSDK$c() {
        return !this.values && ah$a() > 0;
    }
}
