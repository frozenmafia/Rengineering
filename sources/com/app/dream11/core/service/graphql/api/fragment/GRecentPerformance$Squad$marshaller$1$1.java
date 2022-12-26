package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GRecentPerformance;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GRecentPerformance$Squad$marshaller$1$1 extends Lambda implements Transition<List<? extends GRecentPerformance.Flag>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GRecentPerformance$Squad$marshaller$1$1 INSTANCE = new GRecentPerformance$Squad$marshaller$1$1();

    GRecentPerformance$Squad$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GRecentPerformance.Flag> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GRecentPerformance.Flag>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GRecentPerformance.Flag> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GRecentPerformance.Flag flag : list) {
            valueof.values(flag.marshaller());
        }
    }
}
