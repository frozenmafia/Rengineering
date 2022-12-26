package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.PlayerInfoQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class PlayerInfoQuery$Player$marshaller$1$3 extends Lambda implements Transition<List<? extends PlayerInfoQuery.Artwork>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final PlayerInfoQuery$Player$marshaller$1$3 INSTANCE = new PlayerInfoQuery$Player$marshaller$1$3();

    PlayerInfoQuery$Player$marshaller$1$3() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends PlayerInfoQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<PlayerInfoQuery.Artwork>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<PlayerInfoQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (PlayerInfoQuery.Artwork artwork : list) {
            valueof.values(artwork.marshaller());
        }
    }
}
