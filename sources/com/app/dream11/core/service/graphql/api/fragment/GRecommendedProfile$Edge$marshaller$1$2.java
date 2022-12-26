package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GRecommendedProfile;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GRecommendedProfile$Edge$marshaller$1$2 extends Lambda implements Transition<List<? extends GRecommendedProfile.OfficialTick>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GRecommendedProfile$Edge$marshaller$1$2 INSTANCE = new GRecommendedProfile$Edge$marshaller$1$2();

    GRecommendedProfile$Edge$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GRecommendedProfile.OfficialTick> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GRecommendedProfile.OfficialTick>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GRecommendedProfile.OfficialTick> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GRecommendedProfile.OfficialTick officialTick : list) {
            valueof.values(officialTick == null ? null : officialTick.marshaller());
        }
    }
}
