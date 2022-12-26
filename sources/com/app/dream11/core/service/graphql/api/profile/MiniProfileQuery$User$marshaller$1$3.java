package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.MiniProfileQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class MiniProfileQuery$User$marshaller$1$3 extends Lambda implements Transition<List<? extends MiniProfileQuery.CareerStat>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MiniProfileQuery$User$marshaller$1$3 INSTANCE = new MiniProfileQuery$User$marshaller$1$3();

    MiniProfileQuery$User$marshaller$1$3() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MiniProfileQuery.CareerStat> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MiniProfileQuery.CareerStat>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MiniProfileQuery.CareerStat> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MiniProfileQuery.CareerStat careerStat : list) {
            valueof.values(careerStat == null ? null : careerStat.marshaller());
        }
    }
}
