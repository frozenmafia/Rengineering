package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.PlayerRole;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class PlayerRole$marshaller$1$1 extends Lambda implements Transition<List<? extends PlayerRole.Artwork>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final PlayerRole$marshaller$1$1 INSTANCE = new PlayerRole$marshaller$1$1();

    PlayerRole$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends PlayerRole.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<PlayerRole.Artwork>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<PlayerRole.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (PlayerRole.Artwork artwork : list) {
            valueof.values(artwork == null ? null : artwork.marshaller());
        }
    }
}
