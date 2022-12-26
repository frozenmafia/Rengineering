package com.app.dream11.newmycontests.model;

import com.app.dream11.core.service.graphql.api.fragment.MatchData;
import com.app.dream11.dream11.AppConstants;
/* loaded from: classes3.dex */
public interface CardVm$ah$a {
    void ag$a(MatchData matchData, int i, int i2, String str, String str2, String str3);

    void ag$a(MatchData matchData, AppConstants.LEAGUE_START_VALUE league_start_value, int i);

    boolean extraCallbackWithResult();

    String invoke();

    void toString(MatchData matchData, int i);

    void toString(MatchData matchData, AppConstants.LEAGUE_START_VALUE league_start_value, int i);

    void values(MatchData matchData, int i, int i2, String str, String str2, String str3);
}
