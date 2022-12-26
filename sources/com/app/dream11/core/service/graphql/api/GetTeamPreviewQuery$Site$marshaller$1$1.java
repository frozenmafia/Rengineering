package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetTeamPreviewQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GetTeamPreviewQuery$Site$marshaller$1$1 extends Lambda implements Transition<List<? extends GetTeamPreviewQuery.PlayerType>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetTeamPreviewQuery$Site$marshaller$1$1 INSTANCE = new GetTeamPreviewQuery$Site$marshaller$1$1();

    GetTeamPreviewQuery$Site$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetTeamPreviewQuery.PlayerType> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetTeamPreviewQuery.PlayerType>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetTeamPreviewQuery.PlayerType> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetTeamPreviewQuery.PlayerType playerType : list) {
            valueof.values(playerType.marshaller());
        }
    }
}
