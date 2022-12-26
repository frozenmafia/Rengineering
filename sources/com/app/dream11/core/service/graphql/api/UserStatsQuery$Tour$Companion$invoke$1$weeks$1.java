package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.UserStatsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class UserStatsQuery$Tour$Companion$invoke$1$weeks$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, UserStatsQuery.Week> {
    public static final UserStatsQuery$Tour$Companion$invoke$1$weeks$1 INSTANCE = new UserStatsQuery$Tour$Companion$invoke$1$weeks$1();

    UserStatsQuery$Tour$Companion$invoke$1$weeks$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.UserStatsQuery$Tour$Companion$invoke$1$weeks$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserStatsQuery.Week> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final UserStatsQuery.Week invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return UserStatsQuery.Week.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final UserStatsQuery.Week invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (UserStatsQuery.Week) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
