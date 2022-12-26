package com.app.dream11.chat.chatlist.contestinvitebottomsheet;

import o.runAnimators;
/* loaded from: classes.dex */
public final class SquadModel {
    private final String flag;
    private final String fullName;
    private final String shortName;

    public static /* synthetic */ SquadModel copy$default(SquadModel squadModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = squadModel.shortName;
        }
        if ((i & 2) != 0) {
            str2 = squadModel.fullName;
        }
        if ((i & 4) != 0) {
            str3 = squadModel.flag;
        }
        return squadModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.shortName;
    }

    public final String component2() {
        return this.fullName;
    }

    public final String component3() {
        return this.flag;
    }

    public final SquadModel copy(String str, String str2, String str3) {
        runAnimators.ag$a(str, "shortName");
        runAnimators.ag$a(str2, "fullName");
        return new SquadModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SquadModel) {
            SquadModel squadModel = (SquadModel) obj;
            return runAnimators.values((Object) this.shortName, (Object) squadModel.shortName) && runAnimators.values((Object) this.fullName, (Object) squadModel.fullName) && runAnimators.values((Object) this.flag, (Object) squadModel.flag);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.shortName.hashCode();
        int hashCode2 = this.fullName.hashCode();
        String str = this.flag;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.shortName;
        String str2 = this.fullName;
        String str3 = this.flag;
        return "SquadModel(shortName=" + str + ", fullName=" + str2 + ", flag=" + str3 + ")";
    }

    public SquadModel(String str, String str2, String str3) {
        runAnimators.ag$a(str, "shortName");
        runAnimators.ag$a(str2, "fullName");
        this.shortName = str;
        this.fullName = str2;
        this.flag = str3;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getFlag() {
        return this.flag;
    }
}
