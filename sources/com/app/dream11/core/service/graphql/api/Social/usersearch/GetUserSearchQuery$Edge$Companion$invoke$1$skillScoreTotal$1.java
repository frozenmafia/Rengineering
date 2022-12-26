package com.app.dream11.core.service.graphql.api.Social.usersearch;

import com.app.dream11.core.service.graphql.api.Social.usersearch.GetUserSearchQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetUserSearchQuery$Edge$Companion$invoke$1$skillScoreTotal$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetUserSearchQuery.SkillScoreTotal> {
    public static final GetUserSearchQuery$Edge$Companion$invoke$1$skillScoreTotal$1 INSTANCE = new GetUserSearchQuery$Edge$Companion$invoke$1$skillScoreTotal$1();

    GetUserSearchQuery$Edge$Companion$invoke$1$skillScoreTotal$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetUserSearchQuery.SkillScoreTotal invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetUserSearchQuery.SkillScoreTotal.Companion.invoke(removecancellable);
    }
}
