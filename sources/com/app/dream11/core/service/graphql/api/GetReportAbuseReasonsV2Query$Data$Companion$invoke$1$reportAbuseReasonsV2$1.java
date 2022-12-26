package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetReportAbuseReasonsV2Query;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetReportAbuseReasonsV2Query$Data$Companion$invoke$1$reportAbuseReasonsV2$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetReportAbuseReasonsV2Query.ReportAbuseReasonsV2> {
    public static final GetReportAbuseReasonsV2Query$Data$Companion$invoke$1$reportAbuseReasonsV2$1 INSTANCE = new GetReportAbuseReasonsV2Query$Data$Companion$invoke$1$reportAbuseReasonsV2$1();

    GetReportAbuseReasonsV2Query$Data$Companion$invoke$1$reportAbuseReasonsV2$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.GetReportAbuseReasonsV2Query$Data$Companion$invoke$1$reportAbuseReasonsV2$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetReportAbuseReasonsV2Query.ReportAbuseReasonsV2> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetReportAbuseReasonsV2Query.ReportAbuseReasonsV2 invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetReportAbuseReasonsV2Query.ReportAbuseReasonsV2.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetReportAbuseReasonsV2Query.ReportAbuseReasonsV2 invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetReportAbuseReasonsV2Query.ReportAbuseReasonsV2) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
