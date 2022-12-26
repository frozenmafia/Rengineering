package com.app.dream11.core.service.graphql.api.Social.recommendedprofile;

import com.app.dream11.core.service.graphql.api.fragment.GRecommendedProfile;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetRecommendedProfileQuery$RecommendedUsers$Fragments$Companion$invoke$1$gRecommendedProfile$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GRecommendedProfile> {
    public static final GetRecommendedProfileQuery$RecommendedUsers$Fragments$Companion$invoke$1$gRecommendedProfile$1 INSTANCE = new GetRecommendedProfileQuery$RecommendedUsers$Fragments$Companion$invoke$1$gRecommendedProfile$1();

    GetRecommendedProfileQuery$RecommendedUsers$Fragments$Companion$invoke$1$gRecommendedProfile$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GRecommendedProfile invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GRecommendedProfile.Companion.invoke(removecancellable);
    }
}
