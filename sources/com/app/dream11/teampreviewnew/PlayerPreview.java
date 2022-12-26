package com.app.dream11.teampreviewnew;

import java.io.Serializable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class PlayerPreview implements Serializable {
    private final boolean inDreamTeam;
    private final boolean isFromFirstSquad;
    private final String lineUpStatus;
    private final double playerCreds;
    private final int playerId;
    private final String playerImg;
    private final String playerName;
    private final double playerPts;
    private final String playerType;
    private final String playerTypeFullName;
    private final int playerTypeId;
    private final String shortRoleName;
    private final boolean shouldShowNotInLineup;
    private final int squadId;

    public final String component1() {
        return this.playerName;
    }

    public final boolean component10() {
        return this.inDreamTeam;
    }

    public final String component11() {
        return this.shortRoleName;
    }

    public final boolean component12() {
        return this.shouldShowNotInLineup;
    }

    public final String component13() {
        return this.lineUpStatus;
    }

    public final String component14() {
        return this.playerTypeFullName;
    }

    public final int component2() {
        return this.playerId;
    }

    public final double component3() {
        return this.playerPts;
    }

    public final int component4() {
        return this.playerTypeId;
    }

    public final String component5() {
        return this.playerType;
    }

    public final int component6() {
        return this.squadId;
    }

    public final double component7() {
        return this.playerCreds;
    }

    public final String component8() {
        return this.playerImg;
    }

    public final boolean component9() {
        return this.isFromFirstSquad;
    }

    public final PlayerPreview copy(String str, int i, double d, int i2, String str2, int i3, double d2, String str3, boolean z, boolean z2, String str4, boolean z3, String str5, String str6) {
        runAnimators.ag$a(str, "playerName");
        runAnimators.ag$a(str3, "playerImg");
        return new PlayerPreview(str, i, d, i2, str2, i3, d2, str3, z, z2, str4, z3, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayerPreview) {
            PlayerPreview playerPreview = (PlayerPreview) obj;
            return runAnimators.values((Object) this.playerName, (Object) playerPreview.playerName) && this.playerId == playerPreview.playerId && runAnimators.values(Double.valueOf(this.playerPts), Double.valueOf(playerPreview.playerPts)) && this.playerTypeId == playerPreview.playerTypeId && runAnimators.values((Object) this.playerType, (Object) playerPreview.playerType) && this.squadId == playerPreview.squadId && runAnimators.values(Double.valueOf(this.playerCreds), Double.valueOf(playerPreview.playerCreds)) && runAnimators.values((Object) this.playerImg, (Object) playerPreview.playerImg) && this.isFromFirstSquad == playerPreview.isFromFirstSquad && this.inDreamTeam == playerPreview.inDreamTeam && runAnimators.values((Object) this.shortRoleName, (Object) playerPreview.shortRoleName) && this.shouldShowNotInLineup == playerPreview.shouldShowNotInLineup && runAnimators.values((Object) this.lineUpStatus, (Object) playerPreview.lineUpStatus) && runAnimators.values((Object) this.playerTypeFullName, (Object) playerPreview.playerTypeFullName);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.playerName.hashCode();
        int i = this.playerId;
        int doubleToLongBits = Double.doubleToLongBits(this.playerPts);
        int i2 = this.playerTypeId;
        String str = this.playerType;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int i3 = this.squadId;
        int doubleToLongBits2 = Double.doubleToLongBits(this.playerCreds);
        int hashCode3 = this.playerImg.hashCode();
        boolean z = this.isFromFirstSquad;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        boolean z2 = this.inDreamTeam;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        String str2 = this.shortRoleName;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        boolean z3 = this.shouldShowNotInLineup;
        int i6 = z3 ? 1 : z3 ? 1 : 0;
        String str3 = this.lineUpStatus;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.playerTypeFullName;
        return (((((((((((((((((((((((((hashCode * 31) + i) * 31) + doubleToLongBits) * 31) + i2) * 31) + hashCode2) * 31) + i3) * 31) + doubleToLongBits2) * 31) + hashCode3) * 31) + i4) * 31) + i5) * 31) + hashCode4) * 31) + i6) * 31) + hashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.playerName;
        int i = this.playerId;
        double d = this.playerPts;
        int i2 = this.playerTypeId;
        String str2 = this.playerType;
        int i3 = this.squadId;
        double d2 = this.playerCreds;
        String str3 = this.playerImg;
        boolean z = this.isFromFirstSquad;
        boolean z2 = this.inDreamTeam;
        String str4 = this.shortRoleName;
        boolean z3 = this.shouldShowNotInLineup;
        String str5 = this.lineUpStatus;
        String str6 = this.playerTypeFullName;
        return "PlayerPreview(playerName=" + str + ", playerId=" + i + ", playerPts=" + d + ", playerTypeId=" + i2 + ", playerType=" + str2 + ", squadId=" + i3 + ", playerCreds=" + d2 + ", playerImg=" + str3 + ", isFromFirstSquad=" + z + ", inDreamTeam=" + z2 + ", shortRoleName=" + str4 + ", shouldShowNotInLineup=" + z3 + ", lineUpStatus=" + str5 + ", playerTypeFullName=" + str6 + ")";
    }

    public PlayerPreview(String str, int i, double d, int i2, String str2, int i3, double d2, String str3, boolean z, boolean z2, String str4, boolean z3, String str5, String str6) {
        runAnimators.ag$a(str, "playerName");
        runAnimators.ag$a(str3, "playerImg");
        this.playerName = str;
        this.playerId = i;
        this.playerPts = d;
        this.playerTypeId = i2;
        this.playerType = str2;
        this.squadId = i3;
        this.playerCreds = d2;
        this.playerImg = str3;
        this.isFromFirstSquad = z;
        this.inDreamTeam = z2;
        this.shortRoleName = str4;
        this.shouldShowNotInLineup = z3;
        this.lineUpStatus = str5;
        this.playerTypeFullName = str6;
    }

    public /* synthetic */ PlayerPreview(String str, int i, double d, int i2, String str2, int i3, double d2, String str3, boolean z, boolean z2, String str4, boolean z3, String str5, String str6, int i4, getTargetTypes gettargettypes) {
        this(str, i, d, i2, str2, i3, d2, str3, z, z2, str4, z3, (i4 & 4096) != 0 ? null : str5, (i4 & 8192) != 0 ? null : str6);
    }

    public final String getPlayerName() {
        return this.playerName;
    }

    public final int getPlayerId() {
        return this.playerId;
    }

    public final double getPlayerPts() {
        return this.playerPts;
    }

    public final int getPlayerTypeId() {
        return this.playerTypeId;
    }

    public final String getPlayerType() {
        return this.playerType;
    }

    public final int getSquadId() {
        return this.squadId;
    }

    public final double getPlayerCreds() {
        return this.playerCreds;
    }

    public final String getPlayerImg() {
        return this.playerImg;
    }

    public final boolean isFromFirstSquad() {
        return this.isFromFirstSquad;
    }

    public final boolean getInDreamTeam() {
        return this.inDreamTeam;
    }

    public final String getShortRoleName() {
        return this.shortRoleName;
    }

    public final boolean getShouldShowNotInLineup() {
        return this.shouldShowNotInLineup;
    }

    public final String getLineUpStatus() {
        return this.lineUpStatus;
    }

    public final String getPlayerTypeFullName() {
        return this.playerTypeFullName;
    }
}
