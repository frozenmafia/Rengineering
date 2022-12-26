package com.app.dream11.chat.chatlist.contestinvitebottomsheet;

import o.runAnimators;
/* loaded from: classes.dex */
public final class ContestInviterInfoModel {
    private final int inviterId;
    private final String inviterText;
    private final String profilePicUrl;

    public static /* synthetic */ ContestInviterInfoModel copy$default(ContestInviterInfoModel contestInviterInfoModel, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = contestInviterInfoModel.inviterId;
        }
        if ((i2 & 2) != 0) {
            str = contestInviterInfoModel.inviterText;
        }
        if ((i2 & 4) != 0) {
            str2 = contestInviterInfoModel.profilePicUrl;
        }
        return contestInviterInfoModel.copy(i, str, str2);
    }

    public final int component1() {
        return this.inviterId;
    }

    public final String component2() {
        return this.inviterText;
    }

    public final String component3() {
        return this.profilePicUrl;
    }

    public final ContestInviterInfoModel copy(int i, String str, String str2) {
        runAnimators.ag$a(str, "inviterText");
        runAnimators.ag$a(str2, "profilePicUrl");
        return new ContestInviterInfoModel(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContestInviterInfoModel) {
            ContestInviterInfoModel contestInviterInfoModel = (ContestInviterInfoModel) obj;
            return this.inviterId == contestInviterInfoModel.inviterId && runAnimators.values((Object) this.inviterText, (Object) contestInviterInfoModel.inviterText) && runAnimators.values((Object) this.profilePicUrl, (Object) contestInviterInfoModel.profilePicUrl);
        }
        return false;
    }

    public int hashCode() {
        return (((this.inviterId * 31) + this.inviterText.hashCode()) * 31) + this.profilePicUrl.hashCode();
    }

    public String toString() {
        int i = this.inviterId;
        String str = this.inviterText;
        String str2 = this.profilePicUrl;
        return "ContestInviterInfoModel(inviterId=" + i + ", inviterText=" + str + ", profilePicUrl=" + str2 + ")";
    }

    public ContestInviterInfoModel(int i, String str, String str2) {
        runAnimators.ag$a(str, "inviterText");
        runAnimators.ag$a(str2, "profilePicUrl");
        this.inviterId = i;
        this.inviterText = str;
        this.profilePicUrl = str2;
    }

    public final int getInviterId() {
        return this.inviterId;
    }

    public final String getInviterText() {
        return this.inviterText;
    }

    public final String getProfilePicUrl() {
        return this.profilePicUrl;
    }
}
