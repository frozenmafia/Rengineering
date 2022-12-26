package o;

import com.app.dream11.core.service.graphql.api.fragment.MatchData;
import com.app.dream11.model.FlowState;
import com.app.dream11.newmycontests.model.MatchesListVm;
import com.dream11.feature.react.ReactRoute;
import java.io.Serializable;
import java.util.Map;
/* loaded from: classes3.dex */
public interface createRowCentering {
    void ag$a(MatchData matchData);

    void ag$a(MatchData matchData, int i, int i2, String str);

    void ag$a(ReactRoute reactRoute, Map<String, Serializable> map);

    void ag$a(Throwable th);

    void ah$a(FlowState flowState);

    void setView();

    void valueOf();

    void valueOf(MatchData matchData, int i, int i2, String str);

    void valueOf(MatchesListVm matchesListVm);

    void values(String str, Boolean bool);
}
