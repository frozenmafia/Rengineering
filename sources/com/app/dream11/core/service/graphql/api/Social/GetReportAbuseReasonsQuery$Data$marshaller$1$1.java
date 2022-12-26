package com.app.dream11.core.service.graphql.api.Social;

import com.app.dream11.core.service.graphql.api.Social.GetReportAbuseReasonsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GetReportAbuseReasonsQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends GetReportAbuseReasonsQuery.ReportAbuseReason>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetReportAbuseReasonsQuery$Data$marshaller$1$1 INSTANCE = new GetReportAbuseReasonsQuery$Data$marshaller$1$1();

    GetReportAbuseReasonsQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetReportAbuseReasonsQuery.ReportAbuseReason> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetReportAbuseReasonsQuery.ReportAbuseReason>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetReportAbuseReasonsQuery.ReportAbuseReason> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetReportAbuseReasonsQuery.ReportAbuseReason reportAbuseReason : list) {
            valueof.values(reportAbuseReason.marshaller());
        }
    }
}
