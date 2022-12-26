package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyTeamsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class MyTeamsQuery$Match$marshaller$1$2 extends Lambda implements Transition<List<? extends MyTeamsQuery.UserTeam>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MyTeamsQuery$Match$marshaller$1$2 INSTANCE = new MyTeamsQuery$Match$marshaller$1$2();

    MyTeamsQuery$Match$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MyTeamsQuery.UserTeam> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MyTeamsQuery.UserTeam>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MyTeamsQuery.UserTeam> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MyTeamsQuery.UserTeam userTeam : list) {
            valueof.values(userTeam.marshaller());
        }
    }
}
