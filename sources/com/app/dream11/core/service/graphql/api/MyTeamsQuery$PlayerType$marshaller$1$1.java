package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyTeamsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class MyTeamsQuery$PlayerType$marshaller$1$1 extends Lambda implements Transition<List<? extends MyTeamsQuery.Artwork1>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MyTeamsQuery$PlayerType$marshaller$1$1 INSTANCE = new MyTeamsQuery$PlayerType$marshaller$1$1();

    MyTeamsQuery$PlayerType$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MyTeamsQuery.Artwork1> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MyTeamsQuery.Artwork1>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MyTeamsQuery.Artwork1> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MyTeamsQuery.Artwork1 artwork1 : list) {
            valueof.values(artwork1.marshaller());
        }
    }
}
