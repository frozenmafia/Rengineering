package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.CricketMiniScoreCardQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class CricketMiniScoreCardQuery$Over$marshaller$1$1 extends Lambda implements Transition<List<? extends CricketMiniScoreCardQuery.Ball>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final CricketMiniScoreCardQuery$Over$marshaller$1$1 INSTANCE = new CricketMiniScoreCardQuery$Over$marshaller$1$1();

    CricketMiniScoreCardQuery$Over$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends CricketMiniScoreCardQuery.Ball> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<CricketMiniScoreCardQuery.Ball>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<CricketMiniScoreCardQuery.Ball> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (CricketMiniScoreCardQuery.Ball ball : list) {
            valueof.values(ball.marshaller());
        }
    }
}
