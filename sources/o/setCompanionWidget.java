package o;

import com.app.dream11.core.service.graphql.api.fragment.MatchData;
import com.app.dream11.model.FlowState;
import com.app.dream11.newmycontests.model.MatchesListVm;
import com.dream11.feature.react.ReactRoute;
import java.io.Serializable;
import java.util.Map;
/* loaded from: classes3.dex */
public interface setCompanionWidget {
    void ag$a();

    void ag$a(MatchesListVm matchesListVm);

    void ag$a(String str, Boolean bool);

    void ah$a();

    void ah$a(ReactRoute reactRoute, Map<String, Serializable> map);

    void ah$b();

    void toString(FlowState flowState);

    void valueOf(MatchData matchData);

    void values();

    void values(MatchData matchData, int i, int i2, String str);

    void values(String str);

    void values(Throwable th);

    void values(getValueForDensity getvaluefordensity);
}
