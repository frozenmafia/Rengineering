package com.app.dream11.leaguelisting.scorecard.model;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes3.dex */
public class ScoreResponse implements Serializable {
    private static final long serialVersionUID = 121;
    private List<ScoreCardTeam> score;
    private String scoreformat = "cricket";
    private String state;
    private String status;
    private String time;

    public String getState() {
        return this.state;
    }

    public List<ScoreCardTeam> getScore() {
        return this.score;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTime() {
        return this.time;
    }

    public String getScoreformat() {
        return this.scoreformat;
    }
}
