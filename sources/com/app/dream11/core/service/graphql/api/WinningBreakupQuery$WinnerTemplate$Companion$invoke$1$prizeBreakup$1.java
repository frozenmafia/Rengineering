package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WinningBreakupQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WinningBreakupQuery$WinnerTemplate$Companion$invoke$1$prizeBreakup$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, WinningBreakupQuery.PrizeBreakup> {
    public static final WinningBreakupQuery$WinnerTemplate$Companion$invoke$1$prizeBreakup$1 INSTANCE = new WinningBreakupQuery$WinnerTemplate$Companion$invoke$1$prizeBreakup$1();

    WinningBreakupQuery$WinnerTemplate$Companion$invoke$1$prizeBreakup$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.WinningBreakupQuery$WinnerTemplate$Companion$invoke$1$prizeBreakup$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WinningBreakupQuery.PrizeBreakup> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final WinningBreakupQuery.PrizeBreakup invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return WinningBreakupQuery.PrizeBreakup.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final WinningBreakupQuery.PrizeBreakup invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (WinningBreakupQuery.PrizeBreakup) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
