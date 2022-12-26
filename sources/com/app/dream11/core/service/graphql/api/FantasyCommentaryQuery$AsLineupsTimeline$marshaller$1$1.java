package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FantasyCommentaryQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class FantasyCommentaryQuery$AsLineupsTimeline$marshaller$1$1 extends Lambda implements Transition<List<? extends FantasyCommentaryQuery.Lineup>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final FantasyCommentaryQuery$AsLineupsTimeline$marshaller$1$1 INSTANCE = new FantasyCommentaryQuery$AsLineupsTimeline$marshaller$1$1();

    FantasyCommentaryQuery$AsLineupsTimeline$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends FantasyCommentaryQuery.Lineup> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<FantasyCommentaryQuery.Lineup>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FantasyCommentaryQuery.Lineup> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (FantasyCommentaryQuery.Lineup lineup : list) {
            valueof.values(lineup.marshaller());
        }
    }
}
