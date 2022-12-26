package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ShmeCreateTeamQuery$Match$marshaller$1$2 extends Lambda implements Transition<List<? extends ShmeCreateTeamQuery.Player>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ShmeCreateTeamQuery$Match$marshaller$1$2 INSTANCE = new ShmeCreateTeamQuery$Match$marshaller$1$2();

    ShmeCreateTeamQuery$Match$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ShmeCreateTeamQuery.Player> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ShmeCreateTeamQuery.Player>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ShmeCreateTeamQuery.Player> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ShmeCreateTeamQuery.Player player : list) {
            valueof.values(player.marshaller());
        }
    }
}
