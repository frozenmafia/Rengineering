package com.app.dream11.core.service.graphql.api.Social.recentsearch;

import com.app.dream11.core.service.graphql.api.Social.recentsearch.GetRecentSearchesQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetRecentSearchesQuery$Data$Companion$invoke$1$recentSearch$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetRecentSearchesQuery.RecentSearch> {
    public static final GetRecentSearchesQuery$Data$Companion$invoke$1$recentSearch$1 INSTANCE = new GetRecentSearchesQuery$Data$Companion$invoke$1$recentSearch$1();

    GetRecentSearchesQuery$Data$Companion$invoke$1$recentSearch$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetRecentSearchesQuery.RecentSearch invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetRecentSearchesQuery.RecentSearch.Companion.invoke(removecancellable);
    }
}
