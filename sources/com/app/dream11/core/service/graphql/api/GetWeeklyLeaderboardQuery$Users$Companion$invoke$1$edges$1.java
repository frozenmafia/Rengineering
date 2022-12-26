package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetWeeklyLeaderboardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetWeeklyLeaderboardQuery$Users$Companion$invoke$1$edges$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetWeeklyLeaderboardQuery.Edge> {
    public static final GetWeeklyLeaderboardQuery$Users$Companion$invoke$1$edges$1 INSTANCE = new GetWeeklyLeaderboardQuery$Users$Companion$invoke$1$edges$1();

    GetWeeklyLeaderboardQuery$Users$Companion$invoke$1$edges$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.GetWeeklyLeaderboardQuery$Users$Companion$invoke$1$edges$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetWeeklyLeaderboardQuery.Edge> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetWeeklyLeaderboardQuery.Edge invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetWeeklyLeaderboardQuery.Edge.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetWeeklyLeaderboardQuery.Edge invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetWeeklyLeaderboardQuery.Edge) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
