package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.ReactionData;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class ReactionData$marshaller$1$1 extends Lambda implements Transition<List<? extends ReactionData.TopReaction>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ReactionData$marshaller$1$1 INSTANCE = new ReactionData$marshaller$1$1();

    ReactionData$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ReactionData.TopReaction> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ReactionData.TopReaction>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ReactionData.TopReaction> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ReactionData.TopReaction topReaction : list) {
            valueof.values(topReaction == null ? null : topReaction.marshaller());
        }
    }
}
