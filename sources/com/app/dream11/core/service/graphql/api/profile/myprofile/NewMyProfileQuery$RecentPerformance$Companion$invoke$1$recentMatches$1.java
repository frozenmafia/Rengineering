package com.app.dream11.core.service.graphql.api.profile.myprofile;

import com.app.dream11.core.service.graphql.api.profile.myprofile.NewMyProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class NewMyProfileQuery$RecentPerformance$Companion$invoke$1$recentMatches$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, NewMyProfileQuery.RecentMatches> {
    public static final NewMyProfileQuery$RecentPerformance$Companion$invoke$1$recentMatches$1 INSTANCE = new NewMyProfileQuery$RecentPerformance$Companion$invoke$1$recentMatches$1();

    NewMyProfileQuery$RecentPerformance$Companion$invoke$1$recentMatches$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final NewMyProfileQuery.RecentMatches invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return NewMyProfileQuery.RecentMatches.Companion.invoke(removecancellable);
    }
}
