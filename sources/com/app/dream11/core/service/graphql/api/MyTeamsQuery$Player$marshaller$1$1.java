package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyTeamsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class MyTeamsQuery$Player$marshaller$1$1 extends Lambda implements Transition<List<? extends MyTeamsQuery.Artwork2>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MyTeamsQuery$Player$marshaller$1$1 INSTANCE = new MyTeamsQuery$Player$marshaller$1$1();

    MyTeamsQuery$Player$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MyTeamsQuery.Artwork2> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MyTeamsQuery.Artwork2>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MyTeamsQuery.Artwork2> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MyTeamsQuery.Artwork2 artwork2 : list) {
            valueof.values(artwork2.marshaller());
        }
    }
}
