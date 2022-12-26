package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestStatsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestStatsQuery$Match$Companion$invoke$1$players$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ContestStatsQuery.Player> {
    public static final ContestStatsQuery$Match$Companion$invoke$1$players$1 INSTANCE = new ContestStatsQuery$Match$Companion$invoke$1$players$1();

    ContestStatsQuery$Match$Companion$invoke$1$players$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.ContestStatsQuery$Match$Companion$invoke$1$players$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestStatsQuery.Player> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ContestStatsQuery.Player invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ContestStatsQuery.Player.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestStatsQuery.Player invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ContestStatsQuery.Player) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
