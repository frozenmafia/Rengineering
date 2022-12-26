package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FantasyCommentaryQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class FantasyCommentaryQuery$FantasyCommentary$marshaller$1$1 extends Lambda implements Transition<List<? extends FantasyCommentaryQuery.Edge>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final FantasyCommentaryQuery$FantasyCommentary$marshaller$1$1 INSTANCE = new FantasyCommentaryQuery$FantasyCommentary$marshaller$1$1();

    FantasyCommentaryQuery$FantasyCommentary$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends FantasyCommentaryQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<FantasyCommentaryQuery.Edge>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FantasyCommentaryQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (FantasyCommentaryQuery.Edge edge : list) {
            valueof.values(edge.marshaller());
        }
    }
}
