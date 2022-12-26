package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyTeamsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class MyTeamsQuery$Squad$marshaller$1$1 extends Lambda implements Transition<List<? extends MyTeamsQuery.Flag>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MyTeamsQuery$Squad$marshaller$1$1 INSTANCE = new MyTeamsQuery$Squad$marshaller$1$1();

    MyTeamsQuery$Squad$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MyTeamsQuery.Flag> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MyTeamsQuery.Flag>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MyTeamsQuery.Flag> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MyTeamsQuery.Flag flag : list) {
            valueof.values(flag.marshaller());
        }
    }
}
