package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ShmeCreateTeamQuery$PlayerType$marshaller$1$1 extends Lambda implements Transition<List<? extends ShmeCreateTeamQuery.Artwork1>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ShmeCreateTeamQuery$PlayerType$marshaller$1$1 INSTANCE = new ShmeCreateTeamQuery$PlayerType$marshaller$1$1();

    ShmeCreateTeamQuery$PlayerType$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ShmeCreateTeamQuery.Artwork1> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ShmeCreateTeamQuery.Artwork1>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ShmeCreateTeamQuery.Artwork1> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ShmeCreateTeamQuery.Artwork1 artwork1 : list) {
            valueof.values(artwork1.marshaller());
        }
    }
}
