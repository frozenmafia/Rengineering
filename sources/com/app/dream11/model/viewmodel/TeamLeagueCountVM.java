package com.app.dream11.model.viewmodel;

import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TeamLeagueCountVM extends BasePageVM {
    private int leagueCount;
    private int teamCount;
    private TeamLeagueCountHandler teamLeagueCountHandler;

    public TeamLeagueCountVM(TeamLeagueCountHandler teamLeagueCountHandler) {
        runAnimators.ag$a(teamLeagueCountHandler, "teamLeagueCountHandler");
        this.teamLeagueCountHandler = teamLeagueCountHandler;
        this.teamCount = -1;
        this.leagueCount = -1;
    }

    public final TeamLeagueCountHandler getTeamLeagueCountHandler() {
        return this.teamLeagueCountHandler;
    }

    public final void setTeamLeagueCountHandler(TeamLeagueCountHandler teamLeagueCountHandler) {
        runAnimators.ag$a(teamLeagueCountHandler, "<set-?>");
        this.teamLeagueCountHandler = teamLeagueCountHandler;
    }

    @Bindable
    public final int getTeamCount() {
        return this.teamCount;
    }

    public final void setTeamCount(int i) {
        this.teamCount = i;
        notifyPropertyChanged(BR.teamCount);
    }

    @Bindable
    public final int getLeagueCount() {
        return this.leagueCount;
    }

    public final void setLeagueCount(int i) {
        this.leagueCount = i;
        notifyPropertyChanged(203);
    }
}
