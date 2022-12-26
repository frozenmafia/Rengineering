package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.MatchData;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class MatchData$marshaller$1$1 extends Lambda implements Transition<List<? extends MatchData.Squad>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MatchData$marshaller$1$1 INSTANCE = new MatchData$marshaller$1$1();

    MatchData$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MatchData.Squad> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MatchData.Squad>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MatchData.Squad> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MatchData.Squad squad : list) {
            valueof.values(squad.marshaller());
        }
    }
}
