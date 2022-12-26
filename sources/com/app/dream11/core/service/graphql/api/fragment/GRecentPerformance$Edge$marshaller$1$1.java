package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GRecentPerformance;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GRecentPerformance$Edge$marshaller$1$1 extends Lambda implements Transition<List<? extends GRecentPerformance.Squad>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GRecentPerformance$Edge$marshaller$1$1 INSTANCE = new GRecentPerformance$Edge$marshaller$1$1();

    GRecentPerformance$Edge$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GRecentPerformance.Squad> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GRecentPerformance.Squad>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GRecentPerformance.Squad> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GRecentPerformance.Squad squad : list) {
            valueof.values(squad.marshaller());
        }
    }
}
