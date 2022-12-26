package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.HallOfFameMatchCenterQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class HallOfFameMatchCenterQuery$Winners$marshaller$1$1 extends Lambda implements Transition<List<? extends HallOfFameMatchCenterQuery.Edge1>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final HallOfFameMatchCenterQuery$Winners$marshaller$1$1 INSTANCE = new HallOfFameMatchCenterQuery$Winners$marshaller$1$1();

    HallOfFameMatchCenterQuery$Winners$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends HallOfFameMatchCenterQuery.Edge1> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<HallOfFameMatchCenterQuery.Edge1>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<HallOfFameMatchCenterQuery.Edge1> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (HallOfFameMatchCenterQuery.Edge1 edge1 : list) {
            valueof.values(edge1.marshaller());
        }
    }
}
