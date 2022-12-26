package com.app.dream11.teamselection.removeplayers;

import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class PlayerItem implements Serializable {
    private final double creditValue;
    private final int playerId;
    private final String playerImgUrl;
    private final String playerName;
    private final String playerSquadName;
    private final String playerType;
    private final String playerTypeIconUrl;
    private final String ptsValue;
    private final boolean showPlayerTypeIcon;

    public final int component1() {
        return this.playerId;
    }

    public final String component2() {
        return this.playerImgUrl;
    }

    public final String component3() {
        return this.playerSquadName;
    }

    public final String component4() {
        return this.playerType;
    }

    public final String component5() {
        return this.playerName;
    }

    public final double component6() {
        return this.creditValue;
    }

    public final String component7() {
        return this.ptsValue;
    }

    public final String component8() {
        return this.playerTypeIconUrl;
    }

    public final boolean component9() {
        return this.showPlayerTypeIcon;
    }

    public final PlayerItem copy(int i, String str, String str2, String str3, String str4, double d, String str5, String str6, boolean z) {
        runAnimators.ag$a(str, "playerImgUrl");
        runAnimators.ag$a(str2, "playerSquadName");
        runAnimators.ag$a(str3, "playerType");
        runAnimators.ag$a(str4, "playerName");
        runAnimators.ag$a(str5, "ptsValue");
        return new PlayerItem(i, str, str2, str3, str4, d, str5, str6, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayerItem) {
            PlayerItem playerItem = (PlayerItem) obj;
            return this.playerId == playerItem.playerId && runAnimators.values((Object) this.playerImgUrl, (Object) playerItem.playerImgUrl) && runAnimators.values((Object) this.playerSquadName, (Object) playerItem.playerSquadName) && runAnimators.values((Object) this.playerType, (Object) playerItem.playerType) && runAnimators.values((Object) this.playerName, (Object) playerItem.playerName) && runAnimators.values(Double.valueOf(this.creditValue), Double.valueOf(playerItem.creditValue)) && runAnimators.values((Object) this.ptsValue, (Object) playerItem.ptsValue) && runAnimators.values((Object) this.playerTypeIconUrl, (Object) playerItem.playerTypeIconUrl) && this.showPlayerTypeIcon == playerItem.showPlayerTypeIcon;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = this.playerId;
        int hashCode = this.playerImgUrl.hashCode();
        int hashCode2 = this.playerSquadName.hashCode();
        int hashCode3 = this.playerType.hashCode();
        int hashCode4 = this.playerName.hashCode();
        int doubleToLongBits = Double.doubleToLongBits(this.creditValue);
        int hashCode5 = this.ptsValue.hashCode();
        String str = this.playerTypeIconUrl;
        int hashCode6 = str == null ? 0 : str.hashCode();
        boolean z = this.showPlayerTypeIcon;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return (((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + doubleToLongBits) * 31) + hashCode5) * 31) + hashCode6) * 31) + i2;
    }

    public String toString() {
        int i = this.playerId;
        String str = this.playerImgUrl;
        String str2 = this.playerSquadName;
        String str3 = this.playerType;
        String str4 = this.playerName;
        double d = this.creditValue;
        String str5 = this.ptsValue;
        String str6 = this.playerTypeIconUrl;
        boolean z = this.showPlayerTypeIcon;
        return "PlayerItem(playerId=" + i + ", playerImgUrl=" + str + ", playerSquadName=" + str2 + ", playerType=" + str3 + ", playerName=" + str4 + ", creditValue=" + d + ", ptsValue=" + str5 + ", playerTypeIconUrl=" + str6 + ", showPlayerTypeIcon=" + z + ")";
    }

    public PlayerItem(int i, String str, String str2, String str3, String str4, double d, String str5, String str6, boolean z) {
        runAnimators.ag$a(str, "playerImgUrl");
        runAnimators.ag$a(str2, "playerSquadName");
        runAnimators.ag$a(str3, "playerType");
        runAnimators.ag$a(str4, "playerName");
        runAnimators.ag$a(str5, "ptsValue");
        this.playerId = i;
        this.playerImgUrl = str;
        this.playerSquadName = str2;
        this.playerType = str3;
        this.playerName = str4;
        this.creditValue = d;
        this.ptsValue = str5;
        this.playerTypeIconUrl = str6;
        this.showPlayerTypeIcon = z;
    }

    public final int getPlayerId() {
        return this.playerId;
    }

    public final String getPlayerImgUrl() {
        return this.playerImgUrl;
    }

    public final String getPlayerSquadName() {
        return this.playerSquadName;
    }

    public final String getPlayerType() {
        return this.playerType;
    }

    public final String getPlayerName() {
        return this.playerName;
    }

    public final double getCreditValue() {
        return this.creditValue;
    }

    public final String getPtsValue() {
        return this.ptsValue;
    }

    public final String getPlayerTypeIconUrl() {
        return this.playerTypeIconUrl;
    }

    public final boolean getShowPlayerTypeIcon() {
        return this.showPlayerTypeIcon;
    }
}
