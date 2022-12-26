package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.SelfExclusionQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class SelfExclusionQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends SelfExclusionQuery.SelfExclusionOption>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final SelfExclusionQuery$Data$marshaller$1$1 INSTANCE = new SelfExclusionQuery$Data$marshaller$1$1();

    SelfExclusionQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends SelfExclusionQuery.SelfExclusionOption> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<SelfExclusionQuery.SelfExclusionOption>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<SelfExclusionQuery.SelfExclusionOption> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (SelfExclusionQuery.SelfExclusionOption selfExclusionOption : list) {
            valueof.values(selfExclusionOption.marshaller());
        }
    }
}
