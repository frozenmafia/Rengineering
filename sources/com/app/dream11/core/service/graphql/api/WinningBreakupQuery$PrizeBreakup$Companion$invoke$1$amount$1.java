package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WinningBreakupQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WinningBreakupQuery$PrizeBreakup$Companion$invoke$1$amount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WinningBreakupQuery.Amount> {
    public static final WinningBreakupQuery$PrizeBreakup$Companion$invoke$1$amount$1 INSTANCE = new WinningBreakupQuery$PrizeBreakup$Companion$invoke$1$amount$1();

    WinningBreakupQuery$PrizeBreakup$Companion$invoke$1$amount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WinningBreakupQuery.Amount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return WinningBreakupQuery.Amount.Companion.invoke(removecancellable);
    }
}
