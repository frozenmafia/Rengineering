package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GRecentPerformance;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GRecentPerformance$marshaller$1$1 extends Lambda implements Transition<List<? extends GRecentPerformance.Edge>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GRecentPerformance$marshaller$1$1 INSTANCE = new GRecentPerformance$marshaller$1$1();

    GRecentPerformance$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GRecentPerformance.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GRecentPerformance.Edge>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GRecentPerformance.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GRecentPerformance.Edge edge : list) {
            valueof.values(edge.marshaller());
        }
    }
}
