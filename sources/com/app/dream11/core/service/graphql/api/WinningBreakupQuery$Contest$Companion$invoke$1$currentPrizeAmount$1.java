package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WinningBreakupQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WinningBreakupQuery$Contest$Companion$invoke$1$currentPrizeAmount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WinningBreakupQuery.CurrentPrizeAmount> {
    public static final WinningBreakupQuery$Contest$Companion$invoke$1$currentPrizeAmount$1 INSTANCE = new WinningBreakupQuery$Contest$Companion$invoke$1$currentPrizeAmount$1();

    WinningBreakupQuery$Contest$Companion$invoke$1$currentPrizeAmount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WinningBreakupQuery.CurrentPrizeAmount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return WinningBreakupQuery.CurrentPrizeAmount.Companion.invoke(removecancellable);
    }
}
