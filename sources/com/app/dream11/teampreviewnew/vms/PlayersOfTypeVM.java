package com.app.dream11.teampreviewnew.vms;

import java.io.Serializable;
import java.util.List;
import o.runAnimators;
import o.toBundleArray;
/* loaded from: classes3.dex */
public final class PlayersOfTypeVM implements Serializable {
    private final List<toBundleArray> playersOfType;
    private final String typeTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlayersOfTypeVM copy$default(PlayersOfTypeVM playersOfTypeVM, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playersOfTypeVM.typeTitle;
        }
        if ((i & 2) != 0) {
            list = playersOfTypeVM.playersOfType;
        }
        return playersOfTypeVM.copy(str, list);
    }

    public final String component1() {
        return this.typeTitle;
    }

    public final List<toBundleArray> component2() {
        return this.playersOfType;
    }

    public final PlayersOfTypeVM copy(String str, List<toBundleArray> list) {
        runAnimators.ag$a(str, "typeTitle");
        runAnimators.ag$a(list, "playersOfType");
        return new PlayersOfTypeVM(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayersOfTypeVM) {
            PlayersOfTypeVM playersOfTypeVM = (PlayersOfTypeVM) obj;
            return runAnimators.values((Object) this.typeTitle, (Object) playersOfTypeVM.typeTitle) && runAnimators.values(this.playersOfType, playersOfTypeVM.playersOfType);
        }
        return false;
    }

    public int hashCode() {
        return (this.typeTitle.hashCode() * 31) + this.playersOfType.hashCode();
    }

    public String toString() {
        String str = this.typeTitle;
        List<toBundleArray> list = this.playersOfType;
        return "PlayersOfTypeVM(typeTitle=" + str + ", playersOfType=" + list + ")";
    }

    public PlayersOfTypeVM(String str, List<toBundleArray> list) {
        runAnimators.ag$a(str, "typeTitle");
        runAnimators.ag$a(list, "playersOfType");
        this.typeTitle = str;
        this.playersOfType = list;
    }

    public final List<toBundleArray> getPlayersOfType() {
        return this.playersOfType;
    }

    public final String getTypeTitle() {
        return this.typeTitle;
    }
}
