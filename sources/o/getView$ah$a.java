package o;

import com.app.dream11.contest.ContestItemVM;
import com.app.dream11.contest.FilterData;
import com.app.dream11.core.service.graphql.api.ContestSectionDetailsQuery;
import java.util.List;
import o.AlertController;
/* loaded from: classes.dex */
public interface getView$ah$a {
    int HaptikSDK$a();

    int HaptikSDK$b();

    Integer HaptikSDK$c();

    ContestSectionDetailsQuery.Match ag$a();

    List<ContestItemVM> ah$a();

    void ah$a(FilterData filterData);

    void ah$b();

    void getInitSettings();

    AlertController.RecycleListView invoke();

    void toString(List<? extends ContestItemVM> list);

    orderBy valueOf();

    void valueOf(boolean z);

    int values();
}
