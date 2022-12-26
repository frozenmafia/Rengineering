package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FantasyScoreCardQuery;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class FantasyScoreCardQuery$Player$marshaller$1$2 extends Lambda implements Transition<List<? extends List<? extends FantasyScoreCardQuery.PointBreakup>>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final FantasyScoreCardQuery$Player$marshaller$1$2 INSTANCE = new FantasyScoreCardQuery$Player$marshaller$1$2();

    FantasyScoreCardQuery$Player$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends List<? extends FantasyScoreCardQuery.PointBreakup>> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<? extends List<FantasyScoreCardQuery.PointBreakup>>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends List<FantasyScoreCardQuery.PointBreakup>> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            valueof.ag$a((List) it.next(), FantasyScoreCardQuery$Player$marshaller$1$2$1$1.INSTANCE);
        }
    }
}
