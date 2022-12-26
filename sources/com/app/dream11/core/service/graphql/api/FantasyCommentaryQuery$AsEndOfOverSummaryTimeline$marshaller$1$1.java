package com.app.dream11.core.service.graphql.api;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class FantasyCommentaryQuery$AsEndOfOverSummaryTimeline$marshaller$1$1 extends Lambda implements Transition<List<? extends String>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final FantasyCommentaryQuery$AsEndOfOverSummaryTimeline$marshaller$1$1 INSTANCE = new FantasyCommentaryQuery$AsEndOfOverSummaryTimeline$marshaller$1$1();

    FantasyCommentaryQuery$AsEndOfOverSummaryTimeline$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends String> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<String>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<String> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (String str : list) {
            valueof.valueOf(str);
        }
    }
}
