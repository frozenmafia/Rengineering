package com.app.dream11.core.service.graphql.api.postroundlock;

import com.app.dream11.core.service.graphql.api.postroundlock.FullScoreCardQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class FullScoreCardQuery$FowHeaders$marshaller$1$1 extends Lambda implements Transition<List<? extends FullScoreCardQuery.SubHeader2>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final FullScoreCardQuery$FowHeaders$marshaller$1$1 INSTANCE = new FullScoreCardQuery$FowHeaders$marshaller$1$1();

    FullScoreCardQuery$FowHeaders$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends FullScoreCardQuery.SubHeader2> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<FullScoreCardQuery.SubHeader2>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FullScoreCardQuery.SubHeader2> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (FullScoreCardQuery.SubHeader2 subHeader2 : list) {
            valueof.values(subHeader2.marshaller());
        }
    }
}
