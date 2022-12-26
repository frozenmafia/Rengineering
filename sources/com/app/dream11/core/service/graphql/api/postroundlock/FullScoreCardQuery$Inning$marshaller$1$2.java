package com.app.dream11.core.service.graphql.api.postroundlock;

import com.app.dream11.core.service.graphql.api.postroundlock.FullScoreCardQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class FullScoreCardQuery$Inning$marshaller$1$2 extends Lambda implements Transition<List<? extends FullScoreCardQuery.Bowler>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final FullScoreCardQuery$Inning$marshaller$1$2 INSTANCE = new FullScoreCardQuery$Inning$marshaller$1$2();

    FullScoreCardQuery$Inning$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends FullScoreCardQuery.Bowler> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<FullScoreCardQuery.Bowler>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FullScoreCardQuery.Bowler> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (FullScoreCardQuery.Bowler bowler : list) {
            valueof.values(bowler.marshaller());
        }
    }
}
