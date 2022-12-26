package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestStatsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestStatsQuery$Statistics$Companion$invoke$1$playerRole$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ContestStatsQuery.PlayerRole1> {
    public static final ContestStatsQuery$Statistics$Companion$invoke$1$playerRole$1 INSTANCE = new ContestStatsQuery$Statistics$Companion$invoke$1$playerRole$1();

    ContestStatsQuery$Statistics$Companion$invoke$1$playerRole$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.ContestStatsQuery$Statistics$Companion$invoke$1$playerRole$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestStatsQuery.PlayerRole1> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ContestStatsQuery.PlayerRole1 invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ContestStatsQuery.PlayerRole1.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestStatsQuery.PlayerRole1 invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ContestStatsQuery.PlayerRole1) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
