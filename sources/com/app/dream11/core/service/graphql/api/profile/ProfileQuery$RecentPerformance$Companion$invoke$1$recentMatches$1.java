package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.ProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ProfileQuery$RecentPerformance$Companion$invoke$1$recentMatches$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ProfileQuery.RecentMatches> {
    public static final ProfileQuery$RecentPerformance$Companion$invoke$1$recentMatches$1 INSTANCE = new ProfileQuery$RecentPerformance$Companion$invoke$1$recentMatches$1();

    ProfileQuery$RecentPerformance$Companion$invoke$1$recentMatches$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ProfileQuery.RecentMatches invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ProfileQuery.RecentMatches.Companion.invoke(removecancellable);
    }
}
