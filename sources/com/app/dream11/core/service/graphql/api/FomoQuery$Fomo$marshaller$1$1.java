package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FomoQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class FomoQuery$Fomo$marshaller$1$1 extends Lambda implements Transition<List<? extends FomoQuery.PaidContestUserImageURL>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final FomoQuery$Fomo$marshaller$1$1 INSTANCE = new FomoQuery$Fomo$marshaller$1$1();

    FomoQuery$Fomo$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends FomoQuery.PaidContestUserImageURL> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<FomoQuery.PaidContestUserImageURL>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FomoQuery.PaidContestUserImageURL> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (FomoQuery.PaidContestUserImageURL paidContestUserImageURL : list) {
            valueof.values(paidContestUserImageURL == null ? null : paidContestUserImageURL.marshaller());
        }
    }
}
