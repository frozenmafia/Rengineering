package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeNewMyTeamsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ShmeNewMyTeamsQuery$Match$marshaller$1$1 extends Lambda implements Transition<List<? extends ShmeNewMyTeamsQuery.UserTeam>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ShmeNewMyTeamsQuery$Match$marshaller$1$1 INSTANCE = new ShmeNewMyTeamsQuery$Match$marshaller$1$1();

    ShmeNewMyTeamsQuery$Match$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ShmeNewMyTeamsQuery.UserTeam> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ShmeNewMyTeamsQuery.UserTeam>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ShmeNewMyTeamsQuery.UserTeam> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ShmeNewMyTeamsQuery.UserTeam userTeam : list) {
            valueof.values(userTeam.marshaller());
        }
    }
}
