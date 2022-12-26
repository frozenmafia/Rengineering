package com.app.dream11.social.reportreasons.ui;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.Styleable;
import o.calculateTopPadding;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ReportReasonBottomSheet$reportReasonPresenter$2 extends Lambda implements Styleable.ArcMotion<calculateTopPadding> {
    final /* synthetic */ ReportReasonBottomSheet this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportReasonBottomSheet$reportReasonPresenter$2(ReportReasonBottomSheet reportReasonBottomSheet) {
        super(0);
        this.this$0 = reportReasonBottomSheet;
    }

    @Override // o.Styleable.ArcMotion
    public final calculateTopPadding invoke() {
        calculateTopPadding onReceiveResult = ActionMenuItem.valueOf().onReceiveResult();
        ReportReasonBottomSheet reportReasonBottomSheet = this.this$0;
        onReceiveResult.ag$a(reportReasonBottomSheet.valueOf());
        onReceiveResult.ag$a(reportReasonBottomSheet.values());
        return onReceiveResult;
    }
}
