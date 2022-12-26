package com.app.dream11.model;

import com.app.dream11Pro.R;
import java.io.Serializable;
import java.util.List;
import o.getAlwaysExpand;
import o.getTargetTypes;
import o.isFullSpan;
import o.m;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class PlayerScoreCard implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    @isFullSpan(valueOf = "inDreamTeam")
    private final boolean isInDreamTeam;
    @isFullSpan(valueOf = "SquadPlayerName")
    private final String name;
    @isFullSpan(valueOf = "SquadPlayerImage")
    private final String playerImg;
    @isFullSpan(valueOf = "PlayerPrice")
    private final double playerPrice;
    private final List<PlayerPointsDetailItem> points;
    @isFullSpan(valueOf = "SelPercent")
    private final double selectedByPercent;
    @isFullSpan(valueOf = "inUserTeams")
    private final List<Integer> selectedInTeams;
    @isFullSpan(valueOf = "TotalPoint")
    private final double totalPoint;
    @isFullSpan(valueOf = "SquadPlayerType")
    private final String type;
    @isFullSpan(valueOf = "isPlaying")
    private final boolean isPlaying = true;
    @isFullSpan(valueOf = "SquadPlayerId")
    private final int playerId = -1;
    private boolean isDreamTeamEnabled = true;
    private final transient getAlwaysExpand<Integer> itemBinding = PlayerScoreCard$$ExternalSyntheticLambda1.INSTANCE;
    private final transient getAlwaysExpand<PlayerPointsDetailItem> itemBinding2 = PlayerScoreCard$$ExternalSyntheticLambda0.INSTANCE;

    public final String getName() {
        return this.name;
    }

    public final double getTotalPoint() {
        return this.totalPoint;
    }

    public final String getType() {
        return this.type;
    }

    public final String getPlayerImg() {
        return this.playerImg;
    }

    public final double getSelectedByPercent() {
        return this.selectedByPercent;
    }

    public final List<Integer> getSelectedInTeams() {
        return this.selectedInTeams;
    }

    public final boolean isInDreamTeam() {
        return this.isInDreamTeam && this.isDreamTeamEnabled;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final double getPlayerPrice() {
        return this.playerPrice;
    }

    public final int getPlayerId() {
        return this.playerId;
    }

    public final List<PlayerPointsDetailItem> getPoints() {
        return this.points;
    }

    public final boolean isDreamTeamEnabled() {
        return this.isDreamTeamEnabled;
    }

    public final void setDreamTeamEnabled(boolean z) {
        this.isDreamTeamEnabled = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: itemBinding$lambda-0  reason: not valid java name */
    public static final void m993itemBinding$lambda0(m mVar, int i, Integer num) {
        runAnimators.ag$a(mVar, "itemBinding");
        mVar.ah$a(263, R.layout.res_0x7f0d041e);
    }

    public final getAlwaysExpand<Integer> getItemBinding() {
        return this.itemBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: itemBinding2$lambda-1  reason: not valid java name */
    public static final void m994itemBinding2$lambda1(m mVar, int i, PlayerPointsDetailItem playerPointsDetailItem) {
        runAnimators.ag$a(mVar, "itemBinding");
        mVar.ah$a(263, R.layout.res_0x7f0d0419);
    }

    public final getAlwaysExpand<PlayerPointsDetailItem> getItemBinding2() {
        return this.itemBinding2;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }
    }
}
