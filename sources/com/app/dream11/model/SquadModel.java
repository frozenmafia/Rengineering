package com.app.dream11.model;

import o.runAnimators;
/* loaded from: classes3.dex */
public final class SquadModel {
    private final String flag;
    private final int id;
    private final String shortName;

    public static /* synthetic */ SquadModel copy$default(SquadModel squadModel, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = squadModel.id;
        }
        if ((i2 & 2) != 0) {
            str = squadModel.shortName;
        }
        if ((i2 & 4) != 0) {
            str2 = squadModel.flag;
        }
        return squadModel.copy(i, str, str2);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.shortName;
    }

    public final String component3() {
        return this.flag;
    }

    public final SquadModel copy(int i, String str, String str2) {
        runAnimators.ag$a(str, "shortName");
        return new SquadModel(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SquadModel) {
            SquadModel squadModel = (SquadModel) obj;
            return this.id == squadModel.id && runAnimators.values((Object) this.shortName, (Object) squadModel.shortName) && runAnimators.values((Object) this.flag, (Object) squadModel.flag);
        }
        return false;
    }

    public int hashCode() {
        int i = this.id;
        int hashCode = this.shortName.hashCode();
        String str = this.flag;
        return (((i * 31) + hashCode) * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i = this.id;
        String str = this.shortName;
        String str2 = this.flag;
        return "SquadModel(id=" + i + ", shortName=" + str + ", flag=" + str2 + ")";
    }

    public SquadModel(int i, String str, String str2) {
        runAnimators.ag$a(str, "shortName");
        this.id = i;
        this.shortName = str;
        this.flag = str2;
    }

    public final int getId() {
        return this.id;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final String getFlag() {
        return this.flag;
    }
}
