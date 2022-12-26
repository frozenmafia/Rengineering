package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GUserTeam;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GUserTeam$marshaller$1$6 extends Lambda implements Transition<List<? extends GUserTeam.PlayerRole>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GUserTeam$marshaller$1$6 INSTANCE = new GUserTeam$marshaller$1$6();

    GUserTeam$marshaller$1$6() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GUserTeam.PlayerRole> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GUserTeam.PlayerRole>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GUserTeam.PlayerRole> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GUserTeam.PlayerRole playerRole : list) {
            valueof.values(playerRole.marshaller());
        }
    }
}
