package com.app.dream11.teamselection.teampreivew;

import com.app.dream11.model.SportPlayerType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class PreviewRowModel implements Serializable {
    private static final long serialVersionUID = 121;
    SportPlayerType playerType;
    List<PreviewPlayerInfo> players;

    public PreviewRowModel(List<PreviewPlayerInfo> list, SportPlayerType sportPlayerType) {
        this.players = new ArrayList();
        this.players = list;
        this.playerType = sportPlayerType;
    }

    public List<PreviewPlayerInfo> getPlayers() {
        return this.players;
    }

    public SportPlayerType getPlayerType() {
        return this.playerType;
    }
}
