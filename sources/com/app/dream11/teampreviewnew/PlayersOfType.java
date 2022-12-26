package com.app.dream11.teampreviewnew;

import java.io.Serializable;
import java.util.List;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class PlayersOfType implements Serializable {
    private final List<PlayerPreview> playersOfType;
    private final String typeTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlayersOfType copy$default(PlayersOfType playersOfType, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playersOfType.typeTitle;
        }
        if ((i & 2) != 0) {
            list = playersOfType.playersOfType;
        }
        return playersOfType.copy(str, list);
    }

    public final String component1() {
        return this.typeTitle;
    }

    public final List<PlayerPreview> component2() {
        return this.playersOfType;
    }

    public final PlayersOfType copy(String str, List<PlayerPreview> list) {
        runAnimators.ag$a(str, "typeTitle");
        runAnimators.ag$a(list, "playersOfType");
        return new PlayersOfType(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayersOfType) {
            PlayersOfType playersOfType = (PlayersOfType) obj;
            return runAnimators.values((Object) this.typeTitle, (Object) playersOfType.typeTitle) && runAnimators.values(this.playersOfType, playersOfType.playersOfType);
        }
        return false;
    }

    public int hashCode() {
        return (this.typeTitle.hashCode() * 31) + this.playersOfType.hashCode();
    }

    public String toString() {
        String str = this.typeTitle;
        List<PlayerPreview> list = this.playersOfType;
        return "PlayersOfType(typeTitle=" + str + ", playersOfType=" + list + ")";
    }

    public PlayersOfType(String str, List<PlayerPreview> list) {
        runAnimators.ag$a(str, "typeTitle");
        runAnimators.ag$a(list, "playersOfType");
        this.typeTitle = str;
        this.playersOfType = list;
    }

    public final List<PlayerPreview> getPlayersOfType() {
        return this.playersOfType;
    }

    public final String getTypeTitle() {
        return this.typeTitle;
    }
}
