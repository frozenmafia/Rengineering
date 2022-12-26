package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyTeamsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class MyTeamsQuery$Site$marshaller$1$4 extends Lambda implements Transition<List<? extends MyTeamsQuery.PlayerType>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MyTeamsQuery$Site$marshaller$1$4 INSTANCE = new MyTeamsQuery$Site$marshaller$1$4();

    MyTeamsQuery$Site$marshaller$1$4() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MyTeamsQuery.PlayerType> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MyTeamsQuery.PlayerType>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MyTeamsQuery.PlayerType> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MyTeamsQuery.PlayerType playerType : list) {
            valueof.values(playerType.marshaller());
        }
    }
}
