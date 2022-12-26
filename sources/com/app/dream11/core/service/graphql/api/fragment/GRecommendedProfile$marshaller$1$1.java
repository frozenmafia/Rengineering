package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GRecommendedProfile;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GRecommendedProfile$marshaller$1$1 extends Lambda implements Transition<List<? extends GRecommendedProfile.Edge>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GRecommendedProfile$marshaller$1$1 INSTANCE = new GRecommendedProfile$marshaller$1$1();

    GRecommendedProfile$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GRecommendedProfile.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GRecommendedProfile.Edge>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GRecommendedProfile.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GRecommendedProfile.Edge edge : list) {
            valueof.values(edge.marshaller());
        }
    }
}
