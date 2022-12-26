package com.app.dream11.teamselection.teampreivew;
/* loaded from: classes6.dex */
public enum PreviewShowType {
    MyTEAM("My Team"),
    CREATE_TEAM("createTeam"),
    LeaderBoard("Contest Leaderboard"),
    TourLeaderBoard("Tour Leaderboard"),
    DreamTeam("Dream Team"),
    FEED_TEAM_PREVIEW("Dream Team"),
    WEEKLY_LEADERBOARD("Weekly Leaderboard"),
    HALL_OF_FAME("hall_of_fame");
    
    private String analyticsName;

    PreviewShowType(String str) {
        this.analyticsName = str;
    }

    public String getAnalyticsName() {
        return this.analyticsName;
    }
}
