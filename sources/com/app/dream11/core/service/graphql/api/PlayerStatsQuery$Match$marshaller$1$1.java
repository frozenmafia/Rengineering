package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.PlayerStatsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class PlayerStatsQuery$Match$marshaller$1$1 extends Lambda implements Transition<List<? extends PlayerStatsQuery.Player>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final PlayerStatsQuery$Match$marshaller$1$1 INSTANCE = new PlayerStatsQuery$Match$marshaller$1$1();

    PlayerStatsQuery$Match$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends PlayerStatsQuery.Player> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<PlayerStatsQuery.Player>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<PlayerStatsQuery.Player> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (PlayerStatsQuery.Player player : list) {
            valueof.values(player.marshaller());
        }
    }
}
