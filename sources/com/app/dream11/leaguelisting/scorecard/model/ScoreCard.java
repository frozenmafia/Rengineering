package com.app.dream11.leaguelisting.scorecard.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class ScoreCard implements Serializable {
    private static final long serialVersionUID = 121;
    private String overs;
    private String runs;
    private String state;
    private String wickets;

    public String getRuns() {
        return this.runs;
    }

    public String getWickets() {
        return this.wickets;
    }

    public String getOvers() {
        return this.overs;
    }

    public String getState() {
        return this.state;
    }
}
