package com.app.dream11.core.service.graphql.api.createteam;

import com.app.dream11.core.service.graphql.api.createteam.PlayerSortStatsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class PlayerSortStatsQuery$Stat$marshaller$1$1 extends Lambda implements Transition<List<? extends PlayerSortStatsQuery.Stat1>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final PlayerSortStatsQuery$Stat$marshaller$1$1 INSTANCE = new PlayerSortStatsQuery$Stat$marshaller$1$1();

    PlayerSortStatsQuery$Stat$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends PlayerSortStatsQuery.Stat1> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<PlayerSortStatsQuery.Stat1>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<PlayerSortStatsQuery.Stat1> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (PlayerSortStatsQuery.Stat1 stat1 : list) {
            valueof.values(stat1.marshaller());
        }
    }
}
