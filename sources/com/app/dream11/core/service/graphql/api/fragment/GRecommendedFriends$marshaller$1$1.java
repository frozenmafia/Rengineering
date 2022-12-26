package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GRecommendedFriends;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GRecommendedFriends$marshaller$1$1 extends Lambda implements Transition<List<? extends GRecommendedFriends.Edge>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GRecommendedFriends$marshaller$1$1 INSTANCE = new GRecommendedFriends$marshaller$1$1();

    GRecommendedFriends$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GRecommendedFriends.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GRecommendedFriends.Edge>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GRecommendedFriends.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GRecommendedFriends.Edge edge : list) {
            valueof.values(edge.marshaller());
        }
    }
}
