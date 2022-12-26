package com.app.dream11.core.service.graphql.api.Social.recentsearch;

import com.app.dream11.core.service.graphql.api.Social.recentsearch.GetRecentSearchesQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetRecentSearchesQuery$Edge$Companion$invoke$1$skillScoreTotal$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetRecentSearchesQuery.SkillScoreTotal> {
    public static final GetRecentSearchesQuery$Edge$Companion$invoke$1$skillScoreTotal$1 INSTANCE = new GetRecentSearchesQuery$Edge$Companion$invoke$1$skillScoreTotal$1();

    GetRecentSearchesQuery$Edge$Companion$invoke$1$skillScoreTotal$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetRecentSearchesQuery.SkillScoreTotal invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetRecentSearchesQuery.SkillScoreTotal.Companion.invoke(removecancellable);
    }
}
