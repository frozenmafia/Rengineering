package com.app.dream11.contest.leaderboard;

import com.app.dream11.dream11.DreamApplication;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.updatePreDraw;
/* loaded from: classes.dex */
public final class PushBasedLeaderboardManager$leagueListingFeature$2 extends Lambda implements Styleable.ArcMotion<updatePreDraw> {
    public static final PushBasedLeaderboardManager$leagueListingFeature$2 INSTANCE = new PushBasedLeaderboardManager$leagueListingFeature$2();

    PushBasedLeaderboardManager$leagueListingFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final updatePreDraw invoke() {
        return DreamApplication.valueOf().aj$a().isLogoutPending();
    }
}
