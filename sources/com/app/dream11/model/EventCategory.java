package com.app.dream11.model;
/* loaded from: classes.dex */
public enum EventCategory {
    CONTEST("Contest"),
    LOGIN("Login"),
    PAYMENTS("Payments"),
    PROMOTIONS("Promotions"),
    VERIFICATION("Verification"),
    HOMEPAGE("HomePage"),
    ATTRIBUTION("Attribution"),
    PROFILE("Profile"),
    MATCH_ENGAGEMENT("MatchEngagement"),
    EXPERIMENT("Experiment"),
    $UNKNOWN(""),
    HALLOFFAME("HallOfFame"),
    LOCALISATION("Localisation"),
    DREAM_RUN("DreamRun");
    
    String name;

    EventCategory(String str) {
        this.name = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }
}
