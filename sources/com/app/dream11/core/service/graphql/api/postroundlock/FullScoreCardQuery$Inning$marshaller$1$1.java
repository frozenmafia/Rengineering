package com.app.dream11.core.service.graphql.api.postroundlock;

import com.app.dream11.core.service.graphql.api.postroundlock.FullScoreCardQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class FullScoreCardQuery$Inning$marshaller$1$1 extends Lambda implements Transition<List<? extends FullScoreCardQuery.Batsmen>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final FullScoreCardQuery$Inning$marshaller$1$1 INSTANCE = new FullScoreCardQuery$Inning$marshaller$1$1();

    FullScoreCardQuery$Inning$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends FullScoreCardQuery.Batsmen> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<FullScoreCardQuery.Batsmen>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FullScoreCardQuery.Batsmen> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (FullScoreCardQuery.Batsmen batsmen : list) {
            valueof.values(batsmen.marshaller());
        }
    }
}
