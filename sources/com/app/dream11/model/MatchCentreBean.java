package com.app.dream11.model;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class MatchCentreBean implements Serializable {
    private static final long serialVersionUID = 121;
    private boolean areFlagsEnlarged;
    private String displayStatus;
    private Boolean isFantasyLiveMatchAvailable;
    private int isTelevised;
    private List<Matches> matches;
    private int roundId;
    private long roundStartTime;
    private String roundStatus;
    private int showPlayerImages;
    private String televisedImage;
    private int tourId;
    private String tourName;
    private String tourShortName;

    public List<Matches> getMatches() {
        return this.matches;
    }

    public String getTourName() {
        return this.tourName;
    }

    public void setTourName(String str) {
        this.tourName = str;
    }

    public void setMatches(List<Matches> list) {
        this.matches = list;
    }

    public String getRoundStatus() {
        return this.roundStatus;
    }

    public void setRoundStatus(String str) {
        this.roundStatus = str;
    }

    public String getDisplayStatus() {
        return this.displayStatus;
    }

    public void setDisplayStatus(String str) {
        this.displayStatus = str;
    }

    public long getRoundStartTime() {
        return this.roundStartTime;
    }

    public void setRoundStartTime(long j) {
        this.roundStartTime = j;
    }

    public int getRoundId() {
        return this.roundId;
    }

    public void setRoundId(int i) {
        this.roundId = i;
    }

    public int getTourId() {
        return this.tourId;
    }

    public void setTourId(int i) {
        this.tourId = i;
    }

    public boolean isAreFlagsEnlarged() {
        return this.areFlagsEnlarged;
    }

    public void setAreFlagsEnlarged(boolean z) {
        this.areFlagsEnlarged = z;
    }

    public int getShowPlayerImages() {
        return this.showPlayerImages;
    }

    public String getTourSlug() {
        return this.tourShortName;
    }

    public void setTourSlug(String str) {
        this.tourShortName = str;
    }

    public Boolean isFantasyLiveMatchAvailable() {
        return this.isFantasyLiveMatchAvailable;
    }

    public void setFantasyLiveMatchAvailable(Boolean bool) {
        this.isFantasyLiveMatchAvailable = bool;
    }
}
