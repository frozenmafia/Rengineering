package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetVerificationDetailsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GetVerificationDetailsQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends GetVerificationDetailsQuery.GetVerificationDetail>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetVerificationDetailsQuery$Data$marshaller$1$1 INSTANCE = new GetVerificationDetailsQuery$Data$marshaller$1$1();

    GetVerificationDetailsQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetVerificationDetailsQuery.GetVerificationDetail> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetVerificationDetailsQuery.GetVerificationDetail>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetVerificationDetailsQuery.GetVerificationDetail> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetVerificationDetailsQuery.GetVerificationDetail getVerificationDetail : list) {
            valueof.values(getVerificationDetail.marshaller());
        }
    }
}
