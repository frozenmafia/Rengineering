package com.app.dream11.core.service.graphql.api.Social.recommendedfriends;

import com.app.dream11.core.service.graphql.api.Social.recommendedfriends.GetRecommendedFriendsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetRecommendedFriendsQuery$Data$Companion$invoke$1$recommendedUsers$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetRecommendedFriendsQuery.RecommendedUsers> {
    public static final GetRecommendedFriendsQuery$Data$Companion$invoke$1$recommendedUsers$1 INSTANCE = new GetRecommendedFriendsQuery$Data$Companion$invoke$1$recommendedUsers$1();

    GetRecommendedFriendsQuery$Data$Companion$invoke$1$recommendedUsers$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetRecommendedFriendsQuery.RecommendedUsers invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetRecommendedFriendsQuery.RecommendedUsers.Companion.invoke(removecancellable);
    }
}
