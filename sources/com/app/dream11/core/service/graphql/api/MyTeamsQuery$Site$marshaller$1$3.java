package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyTeamsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class MyTeamsQuery$Site$marshaller$1$3 extends Lambda implements Transition<List<? extends MyTeamsQuery.Role>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MyTeamsQuery$Site$marshaller$1$3 INSTANCE = new MyTeamsQuery$Site$marshaller$1$3();

    MyTeamsQuery$Site$marshaller$1$3() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MyTeamsQuery.Role> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MyTeamsQuery.Role>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MyTeamsQuery.Role> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MyTeamsQuery.Role role : list) {
            valueof.values(role.marshaller());
        }
    }
}
