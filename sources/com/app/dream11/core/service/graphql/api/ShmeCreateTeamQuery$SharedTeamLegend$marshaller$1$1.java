package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ShmeCreateTeamQuery$SharedTeamLegend$marshaller$1$1 extends Lambda implements Transition<List<? extends ShmeCreateTeamQuery.IconUrl1>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ShmeCreateTeamQuery$SharedTeamLegend$marshaller$1$1 INSTANCE = new ShmeCreateTeamQuery$SharedTeamLegend$marshaller$1$1();

    ShmeCreateTeamQuery$SharedTeamLegend$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ShmeCreateTeamQuery.IconUrl1> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ShmeCreateTeamQuery.IconUrl1>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ShmeCreateTeamQuery.IconUrl1> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ShmeCreateTeamQuery.IconUrl1 iconUrl1 : list) {
            valueof.values(iconUrl1.marshaller());
        }
    }
}
