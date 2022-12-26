package com.app.dream11.myprofile.newprofile.model;

import java.io.Serializable;
import o.invalidateFullSpansAfter;
import o.isFullSpan;
/* loaded from: classes6.dex */
public class UserPoints implements Serializable {
    private static final long serialVersionUID = 5531574571044068533L;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "points")
    private double points;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "teamId")
    private int teamId;

    public double getPoints() {
        return this.points;
    }

    public void setPoints(int i) {
        this.points = i;
    }

    public int getTeamId() {
        return this.teamId;
    }

    public void setTeamId(int i) {
        this.teamId = i;
    }

    public String toString() {
        return "UserPoints{points=" + this.points + ", teamId=" + this.teamId + '}';
    }
}
