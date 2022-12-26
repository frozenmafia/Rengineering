package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestWinningBreakupQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestWinningBreakupQuery$RoundWinningsInfo$Companion$invoke$1$feesDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ContestWinningBreakupQuery.FeesDetail> {
    public static final ContestWinningBreakupQuery$RoundWinningsInfo$Companion$invoke$1$feesDetails$1 INSTANCE = new ContestWinningBreakupQuery$RoundWinningsInfo$Companion$invoke$1$feesDetails$1();

    ContestWinningBreakupQuery$RoundWinningsInfo$Companion$invoke$1$feesDetails$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.ContestWinningBreakupQuery$RoundWinningsInfo$Companion$invoke$1$feesDetails$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestWinningBreakupQuery.FeesDetail> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ContestWinningBreakupQuery.FeesDetail invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ContestWinningBreakupQuery.FeesDetail.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestWinningBreakupQuery.FeesDetail invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ContestWinningBreakupQuery.FeesDetail) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
