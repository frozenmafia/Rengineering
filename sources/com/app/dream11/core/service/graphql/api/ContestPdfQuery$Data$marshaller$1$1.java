package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestPdfQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ContestPdfQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends ContestPdfQuery.FetchContestPdf>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ContestPdfQuery$Data$marshaller$1$1 INSTANCE = new ContestPdfQuery$Data$marshaller$1$1();

    ContestPdfQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ContestPdfQuery.FetchContestPdf> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ContestPdfQuery.FetchContestPdf>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ContestPdfQuery.FetchContestPdf> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ContestPdfQuery.FetchContestPdf fetchContestPdf : list) {
            valueof.values(fetchContestPdf.marshaller());
        }
    }
}
