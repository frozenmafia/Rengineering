package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.SideNavQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class SideNavQuery$Badges$marshaller$1$1 extends Lambda implements Transition<List<? extends SideNavQuery.AwardEdge>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final SideNavQuery$Badges$marshaller$1$1 INSTANCE = new SideNavQuery$Badges$marshaller$1$1();

    SideNavQuery$Badges$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends SideNavQuery.AwardEdge> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<SideNavQuery.AwardEdge>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<SideNavQuery.AwardEdge> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (SideNavQuery.AwardEdge awardEdge : list) {
            valueof.values(awardEdge.marshaller());
        }
    }
}
