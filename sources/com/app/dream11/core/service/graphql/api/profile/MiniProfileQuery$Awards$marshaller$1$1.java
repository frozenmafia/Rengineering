package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.MiniProfileQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class MiniProfileQuery$Awards$marshaller$1$1 extends Lambda implements Transition<List<? extends MiniProfileQuery.Edge>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MiniProfileQuery$Awards$marshaller$1$1 INSTANCE = new MiniProfileQuery$Awards$marshaller$1$1();

    MiniProfileQuery$Awards$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MiniProfileQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MiniProfileQuery.Edge>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MiniProfileQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MiniProfileQuery.Edge edge : list) {
            valueof.values(edge.marshaller());
        }
    }
}
