package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.CricketMiniScoreCardQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class CricketMiniScoreCardQuery$Scorecard$marshaller$1$1 extends Lambda implements Transition<List<? extends CricketMiniScoreCardQuery.Batsmen>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final CricketMiniScoreCardQuery$Scorecard$marshaller$1$1 INSTANCE = new CricketMiniScoreCardQuery$Scorecard$marshaller$1$1();

    CricketMiniScoreCardQuery$Scorecard$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends CricketMiniScoreCardQuery.Batsmen> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<CricketMiniScoreCardQuery.Batsmen>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<CricketMiniScoreCardQuery.Batsmen> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (CricketMiniScoreCardQuery.Batsmen batsmen : list) {
            valueof.values(batsmen.marshaller());
        }
    }
}
