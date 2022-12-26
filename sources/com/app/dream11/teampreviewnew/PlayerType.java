package com.app.dream11.teampreviewnew;

import java.io.Serializable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class PlayerType implements Serializable {
    private String fullName;
    private int id;
    private String type;

    public PlayerType() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ PlayerType copy$default(PlayerType playerType, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = playerType.id;
        }
        if ((i2 & 2) != 0) {
            str = playerType.type;
        }
        if ((i2 & 4) != 0) {
            str2 = playerType.fullName;
        }
        return playerType.copy(i, str, str2);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.fullName;
    }

    public final PlayerType copy(int i, String str, String str2) {
        return new PlayerType(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayerType) {
            PlayerType playerType = (PlayerType) obj;
            return this.id == playerType.id && runAnimators.values((Object) this.type, (Object) playerType.type) && runAnimators.values((Object) this.fullName, (Object) playerType.fullName);
        }
        return false;
    }

    public int hashCode() {
        int i = this.id;
        String str = this.type;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.fullName;
        return (((i * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = this.id;
        String str = this.type;
        String str2 = this.fullName;
        return "PlayerType(id=" + i + ", type=" + str + ", fullName=" + str2 + ")";
    }

    public PlayerType(int i, String str, String str2) {
        this.id = i;
        this.type = str;
        this.fullName = str2;
    }

    public /* synthetic */ PlayerType(int i, String str, String str2, int i2, getTargetTypes gettargettypes) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final void setFullName(String str) {
        this.fullName = str;
    }
}
