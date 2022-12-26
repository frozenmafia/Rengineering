package com.app.dream11.core.service.graphql.api.contest;

import com.app.dream11.core.service.graphql.api.contest.GetWinnerBreakupTemplateQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetWinnerBreakupTemplateQuery$WinnerBreakup$Companion$invoke$1$amount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetWinnerBreakupTemplateQuery.Amount> {
    public static final GetWinnerBreakupTemplateQuery$WinnerBreakup$Companion$invoke$1$amount$1 INSTANCE = new GetWinnerBreakupTemplateQuery$WinnerBreakup$Companion$invoke$1$amount$1();

    GetWinnerBreakupTemplateQuery$WinnerBreakup$Companion$invoke$1$amount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetWinnerBreakupTemplateQuery.Amount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetWinnerBreakupTemplateQuery.Amount.Companion.invoke(removecancellable);
    }
}
