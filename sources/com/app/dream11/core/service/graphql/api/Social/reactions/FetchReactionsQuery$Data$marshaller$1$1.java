package com.app.dream11.core.service.graphql.api.Social.reactions;

import com.app.dream11.core.service.graphql.api.Social.reactions.FetchReactionsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class FetchReactionsQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends FetchReactionsQuery.FetchReaction>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final FetchReactionsQuery$Data$marshaller$1$1 INSTANCE = new FetchReactionsQuery$Data$marshaller$1$1();

    FetchReactionsQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends FetchReactionsQuery.FetchReaction> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<FetchReactionsQuery.FetchReaction>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FetchReactionsQuery.FetchReaction> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (FetchReactionsQuery.FetchReaction fetchReaction : list) {
            valueof.values(fetchReaction == null ? null : fetchReaction.marshaller());
        }
    }
}
