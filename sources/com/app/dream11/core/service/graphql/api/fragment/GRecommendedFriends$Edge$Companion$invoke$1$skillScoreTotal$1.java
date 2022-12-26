package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GRecommendedFriends;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GRecommendedFriends$Edge$Companion$invoke$1$skillScoreTotal$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GRecommendedFriends.SkillScoreTotal> {
    public static final GRecommendedFriends$Edge$Companion$invoke$1$skillScoreTotal$1 INSTANCE = new GRecommendedFriends$Edge$Companion$invoke$1$skillScoreTotal$1();

    GRecommendedFriends$Edge$Companion$invoke$1$skillScoreTotal$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GRecommendedFriends.SkillScoreTotal invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GRecommendedFriends.SkillScoreTotal.Companion.invoke(removecancellable);
    }
}
