package com.app.dream11.core.service.graphql.api.profile.myprofile;

import com.app.dream11.core.service.graphql.api.profile.myprofile.CareerStatsMyProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CareerStatsMyProfileQuery$RecentMatches$Companion$invoke$1$pageInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CareerStatsMyProfileQuery.PageInfo> {
    public static final CareerStatsMyProfileQuery$RecentMatches$Companion$invoke$1$pageInfo$1 INSTANCE = new CareerStatsMyProfileQuery$RecentMatches$Companion$invoke$1$pageInfo$1();

    CareerStatsMyProfileQuery$RecentMatches$Companion$invoke$1$pageInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CareerStatsMyProfileQuery.PageInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CareerStatsMyProfileQuery.PageInfo.Companion.invoke(removecancellable);
    }
}
