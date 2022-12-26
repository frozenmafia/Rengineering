package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetReportAbuseReasonsV2Query;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class GetReportAbuseReasonsV2Query$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends GetReportAbuseReasonsV2Query.ReportAbuseReasonsV2>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetReportAbuseReasonsV2Query$Data$marshaller$1$1 INSTANCE = new GetReportAbuseReasonsV2Query$Data$marshaller$1$1();

    GetReportAbuseReasonsV2Query$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetReportAbuseReasonsV2Query.ReportAbuseReasonsV2> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetReportAbuseReasonsV2Query.ReportAbuseReasonsV2>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetReportAbuseReasonsV2Query.ReportAbuseReasonsV2> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetReportAbuseReasonsV2Query.ReportAbuseReasonsV2 reportAbuseReasonsV2 : list) {
            valueof.values(reportAbuseReasonsV2.marshaller());
        }
    }
}
