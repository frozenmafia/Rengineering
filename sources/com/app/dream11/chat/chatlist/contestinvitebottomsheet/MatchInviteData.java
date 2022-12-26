package com.app.dream11.chat.chatlist.contestinvitebottomsheet;

import com.app.dream11.contest.ContestItemVM;
import java.util.List;
import o.runAnimators;
/* loaded from: classes.dex */
public final class MatchInviteData {
    private final Integer contestCount;
    private final List<ContestItemVM> edges;
    private final RoundDetails roundDetails;
    private final ChatContestInviteViewAllVM viewAllVM;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatchInviteData copy$default(MatchInviteData matchInviteData, Integer num, List list, RoundDetails roundDetails, ChatContestInviteViewAllVM chatContestInviteViewAllVM, int i, Object obj) {
        if ((i & 1) != 0) {
            num = matchInviteData.contestCount;
        }
        if ((i & 2) != 0) {
            list = matchInviteData.edges;
        }
        if ((i & 4) != 0) {
            roundDetails = matchInviteData.roundDetails;
        }
        if ((i & 8) != 0) {
            chatContestInviteViewAllVM = matchInviteData.viewAllVM;
        }
        return matchInviteData.copy(num, list, roundDetails, chatContestInviteViewAllVM);
    }

    public final Integer component1() {
        return this.contestCount;
    }

    public final List<ContestItemVM> component2() {
        return this.edges;
    }

    public final RoundDetails component3() {
        return this.roundDetails;
    }

    public final ChatContestInviteViewAllVM component4() {
        return this.viewAllVM;
    }

    public final MatchInviteData copy(Integer num, List<? extends ContestItemVM> list, RoundDetails roundDetails, ChatContestInviteViewAllVM chatContestInviteViewAllVM) {
        runAnimators.ag$a(list, "edges");
        runAnimators.ag$a(roundDetails, "roundDetails");
        runAnimators.ag$a(chatContestInviteViewAllVM, "viewAllVM");
        return new MatchInviteData(num, list, roundDetails, chatContestInviteViewAllVM);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MatchInviteData) {
            MatchInviteData matchInviteData = (MatchInviteData) obj;
            return runAnimators.values(this.contestCount, matchInviteData.contestCount) && runAnimators.values(this.edges, matchInviteData.edges) && runAnimators.values(this.roundDetails, matchInviteData.roundDetails) && runAnimators.values(this.viewAllVM, matchInviteData.viewAllVM);
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.contestCount;
        return ((((((num == null ? 0 : num.hashCode()) * 31) + this.edges.hashCode()) * 31) + this.roundDetails.hashCode()) * 31) + this.viewAllVM.hashCode();
    }

    public String toString() {
        Integer num = this.contestCount;
        List<ContestItemVM> list = this.edges;
        RoundDetails roundDetails = this.roundDetails;
        ChatContestInviteViewAllVM chatContestInviteViewAllVM = this.viewAllVM;
        return "MatchInviteData(contestCount=" + num + ", edges=" + list + ", roundDetails=" + roundDetails + ", viewAllVM=" + chatContestInviteViewAllVM + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MatchInviteData(Integer num, List<? extends ContestItemVM> list, RoundDetails roundDetails, ChatContestInviteViewAllVM chatContestInviteViewAllVM) {
        runAnimators.ag$a(list, "edges");
        runAnimators.ag$a(roundDetails, "roundDetails");
        runAnimators.ag$a(chatContestInviteViewAllVM, "viewAllVM");
        this.contestCount = num;
        this.edges = list;
        this.roundDetails = roundDetails;
        this.viewAllVM = chatContestInviteViewAllVM;
    }

    public final Integer getContestCount() {
        return this.contestCount;
    }

    public final List<ContestItemVM> getEdges() {
        return this.edges;
    }

    public final RoundDetails getRoundDetails() {
        return this.roundDetails;
    }

    public final ChatContestInviteViewAllVM getViewAllVM() {
        return this.viewAllVM;
    }
}
