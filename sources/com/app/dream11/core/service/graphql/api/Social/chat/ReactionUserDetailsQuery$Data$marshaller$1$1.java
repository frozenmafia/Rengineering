package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.ReactionUserDetailsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ReactionUserDetailsQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends ReactionUserDetailsQuery.ReactionUserDetail>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ReactionUserDetailsQuery$Data$marshaller$1$1 INSTANCE = new ReactionUserDetailsQuery$Data$marshaller$1$1();

    ReactionUserDetailsQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ReactionUserDetailsQuery.ReactionUserDetail> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ReactionUserDetailsQuery.ReactionUserDetail>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ReactionUserDetailsQuery.ReactionUserDetail> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ReactionUserDetailsQuery.ReactionUserDetail reactionUserDetail : list) {
            valueof.values(reactionUserDetail == null ? null : reactionUserDetail.marshaller());
        }
    }
}
