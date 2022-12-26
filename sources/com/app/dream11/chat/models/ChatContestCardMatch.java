package com.app.dream11.chat.models;

import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
import com.app.dream11.model.FlowState;
import java.util.List;
import o.getTargetTypes;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatContestCardMatch {
    @isFullSpan(valueOf = "contestMetaInfo")
    private final ChatContestCardMetaInfo contestCardMetaInfo;
    @isFullSpan(valueOf = CompareTeamFlowState.MATCH_ID)
    private final int matchId;
    @isFullSpan(valueOf = "roundStartTime")
    private String roundStartTime;
    @isFullSpan(valueOf = "slugDisplayName")
    private final String sportDisplayName;
    @isFullSpan(valueOf = "squads")
    private final List<ChatContestCardSquad> squadList;
    @isFullSpan(valueOf = "tour")
    private final ChatContestCardTour tour;
    @isFullSpan(valueOf = "slugId")
    private final String wlsId;
    @isFullSpan(valueOf = "slug")
    private final String wlsSlug;

    public ChatContestCardMatch(String str, ChatContestCardTour chatContestCardTour, String str2, String str3, String str4, int i, List<ChatContestCardSquad> list, ChatContestCardMetaInfo chatContestCardMetaInfo) {
        runAnimators.ag$a(str, "roundStartTime");
        runAnimators.ag$a(chatContestCardTour, "tour");
        runAnimators.ag$a(str2, FlowState.WLS_SLUG);
        runAnimators.ag$a(str3, "wlsId");
        runAnimators.ag$a(str4, "sportDisplayName");
        runAnimators.ag$a(list, "squadList");
        runAnimators.ag$a(chatContestCardMetaInfo, "contestCardMetaInfo");
        this.roundStartTime = str;
        this.tour = chatContestCardTour;
        this.wlsSlug = str2;
        this.wlsId = str3;
        this.sportDisplayName = str4;
        this.matchId = i;
        this.squadList = list;
        this.contestCardMetaInfo = chatContestCardMetaInfo;
    }

    public /* synthetic */ ChatContestCardMatch(String str, ChatContestCardTour chatContestCardTour, String str2, String str3, String str4, int i, List list, ChatContestCardMetaInfo chatContestCardMetaInfo, int i2, getTargetTypes gettargettypes) {
        this(str, chatContestCardTour, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, str4, i, list, chatContestCardMetaInfo);
    }

    public final String getRoundStartTime() {
        return this.roundStartTime;
    }

    public final void setRoundStartTime(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.roundStartTime = str;
    }

    public final ChatContestCardTour getTour() {
        return this.tour;
    }

    public final String getWlsId() {
        return this.wlsId;
    }

    public final String getWlsSlug() {
        return this.wlsSlug;
    }

    public final String getSportDisplayName() {
        return this.sportDisplayName;
    }

    public final int getMatchId() {
        return this.matchId;
    }

    public final List<ChatContestCardSquad> getSquadList() {
        return this.squadList;
    }

    public final ChatContestCardMetaInfo getContestCardMetaInfo() {
        return this.contestCardMetaInfo;
    }
}
