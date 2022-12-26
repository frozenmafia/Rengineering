package com.app.dream11.model;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes3.dex */
public class PlayerPointsResponse implements Serializable {
    List<PlayerScoreCard> players;
    RoundInfo roundInfo;

    public RoundInfo getRoundInfo() {
        return this.roundInfo;
    }

    public List<PlayerScoreCard> getPlayers() {
        return this.players;
    }
}
