package com.app.dream11.core.service.graphql.api.Social.recommendedfriends;

import com.app.dream11.core.service.graphql.api.fragment.GRecommendedFriends;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetRecommendedFriendsQuery$RecommendedUsers$Fragments$Companion$invoke$1$gRecommendedFriends$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GRecommendedFriends> {
    public static final GetRecommendedFriendsQuery$RecommendedUsers$Fragments$Companion$invoke$1$gRecommendedFriends$1 INSTANCE = new GetRecommendedFriendsQuery$RecommendedUsers$Fragments$Companion$invoke$1$gRecommendedFriends$1();

    GetRecommendedFriendsQuery$RecommendedUsers$Fragments$Companion$invoke$1$gRecommendedFriends$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GRecommendedFriends invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GRecommendedFriends.Companion.invoke(removecancellable);
    }
}
