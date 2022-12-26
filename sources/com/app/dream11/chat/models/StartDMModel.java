package com.app.dream11.chat.models;

import com.app.dream11.social.SocialHelper;
import o.runAnimators;
/* loaded from: classes.dex */
public final class StartDMModel {
    private final SocialHelper.ConnectionStatus connectionStatus;
    private final Integer loyaltyLevel;
    private final String teamName;
    private final String userGuid;
    private final int userId;

    public static /* synthetic */ StartDMModel copy$default(StartDMModel startDMModel, String str, int i, String str2, Integer num, SocialHelper.ConnectionStatus connectionStatus, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = startDMModel.teamName;
        }
        if ((i2 & 2) != 0) {
            i = startDMModel.userId;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = startDMModel.userGuid;
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            num = startDMModel.loyaltyLevel;
        }
        Integer num2 = num;
        if ((i2 & 16) != 0) {
            connectionStatus = startDMModel.connectionStatus;
        }
        return startDMModel.copy(str, i3, str3, num2, connectionStatus);
    }

    public final String component1() {
        return this.teamName;
    }

    public final int component2() {
        return this.userId;
    }

    public final String component3() {
        return this.userGuid;
    }

    public final Integer component4() {
        return this.loyaltyLevel;
    }

    public final SocialHelper.ConnectionStatus component5() {
        return this.connectionStatus;
    }

    public final StartDMModel copy(String str, int i, String str2, Integer num, SocialHelper.ConnectionStatus connectionStatus) {
        runAnimators.ag$a(str, "teamName");
        runAnimators.ag$a(str2, "userGuid");
        return new StartDMModel(str, i, str2, num, connectionStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartDMModel) {
            StartDMModel startDMModel = (StartDMModel) obj;
            return runAnimators.values((Object) this.teamName, (Object) startDMModel.teamName) && this.userId == startDMModel.userId && runAnimators.values((Object) this.userGuid, (Object) startDMModel.userGuid) && runAnimators.values(this.loyaltyLevel, startDMModel.loyaltyLevel) && this.connectionStatus == startDMModel.connectionStatus;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.teamName.hashCode();
        int i = this.userId;
        int hashCode2 = this.userGuid.hashCode();
        Integer num = this.loyaltyLevel;
        int hashCode3 = num == null ? 0 : num.hashCode();
        SocialHelper.ConnectionStatus connectionStatus = this.connectionStatus;
        return (((((((hashCode * 31) + i) * 31) + hashCode2) * 31) + hashCode3) * 31) + (connectionStatus != null ? connectionStatus.hashCode() : 0);
    }

    public String toString() {
        String str = this.teamName;
        int i = this.userId;
        String str2 = this.userGuid;
        Integer num = this.loyaltyLevel;
        SocialHelper.ConnectionStatus connectionStatus = this.connectionStatus;
        return "StartDMModel(teamName=" + str + ", userId=" + i + ", userGuid=" + str2 + ", loyaltyLevel=" + num + ", connectionStatus=" + connectionStatus + ")";
    }

    public StartDMModel(String str, int i, String str2, Integer num, SocialHelper.ConnectionStatus connectionStatus) {
        runAnimators.ag$a(str, "teamName");
        runAnimators.ag$a(str2, "userGuid");
        this.teamName = str;
        this.userId = i;
        this.userGuid = str2;
        this.loyaltyLevel = num;
        this.connectionStatus = connectionStatus;
    }

    public final String getTeamName() {
        return this.teamName;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final String getUserGuid() {
        return this.userGuid;
    }

    public final Integer getLoyaltyLevel() {
        return this.loyaltyLevel;
    }

    public final SocialHelper.ConnectionStatus getConnectionStatus() {
        return this.connectionStatus;
    }
}
