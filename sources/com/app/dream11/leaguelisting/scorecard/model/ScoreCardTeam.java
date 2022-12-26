package com.app.dream11.leaguelisting.scorecard.model;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes3.dex */
public class ScoreCardTeam implements Serializable {
    private static final long serialVersionUID = 121;
    private String score;
    private List<ScoreCard> scoreCard;
    private String squadName;

    public String getSquadName() {
        return this.squadName;
    }

    public List<ScoreCard> getScoreCard() {
        return this.scoreCard;
    }

    public String getScore() {
        return this.score;
    }
}
