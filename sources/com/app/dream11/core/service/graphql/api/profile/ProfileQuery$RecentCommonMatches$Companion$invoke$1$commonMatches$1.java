package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.ProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ProfileQuery$RecentCommonMatches$Companion$invoke$1$commonMatches$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ProfileQuery.CommonMatches> {
    public static final ProfileQuery$RecentCommonMatches$Companion$invoke$1$commonMatches$1 INSTANCE = new ProfileQuery$RecentCommonMatches$Companion$invoke$1$commonMatches$1();

    ProfileQuery$RecentCommonMatches$Companion$invoke$1$commonMatches$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ProfileQuery.CommonMatches invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ProfileQuery.CommonMatches.Companion.invoke(removecancellable);
    }
}
