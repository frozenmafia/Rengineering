package com.app.dream11.core.service.graphql.api.Social.reaction;

import com.app.dream11.core.service.graphql.api.Social.reaction.FetchReactionListQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class FetchReactionListQuery$Reaction$marshaller$1$1 extends Lambda implements Transition<List<? extends FetchReactionListQuery.Artwork1>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final FetchReactionListQuery$Reaction$marshaller$1$1 INSTANCE = new FetchReactionListQuery$Reaction$marshaller$1$1();

    FetchReactionListQuery$Reaction$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends FetchReactionListQuery.Artwork1> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<FetchReactionListQuery.Artwork1>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FetchReactionListQuery.Artwork1> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (FetchReactionListQuery.Artwork1 artwork1 : list) {
            valueof.values(artwork1 == null ? null : artwork1.marshaller());
        }
    }
}
