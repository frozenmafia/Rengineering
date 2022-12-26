package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.PlayerInfoQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class PlayerInfoQuery$Squad$marshaller$1$1 extends Lambda implements Transition<List<? extends PlayerInfoQuery.Flag>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final PlayerInfoQuery$Squad$marshaller$1$1 INSTANCE = new PlayerInfoQuery$Squad$marshaller$1$1();

    PlayerInfoQuery$Squad$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends PlayerInfoQuery.Flag> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<PlayerInfoQuery.Flag>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<PlayerInfoQuery.Flag> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (PlayerInfoQuery.Flag flag : list) {
            valueof.values(flag.marshaller());
        }
    }
}
