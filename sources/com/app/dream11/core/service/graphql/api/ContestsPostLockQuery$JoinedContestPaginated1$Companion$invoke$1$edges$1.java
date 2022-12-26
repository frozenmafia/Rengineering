package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestsPostLockQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestsPostLockQuery$JoinedContestPaginated1$Companion$invoke$1$edges$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ContestsPostLockQuery.Edge1> {
    public static final ContestsPostLockQuery$JoinedContestPaginated1$Companion$invoke$1$edges$1 INSTANCE = new ContestsPostLockQuery$JoinedContestPaginated1$Companion$invoke$1$edges$1();

    ContestsPostLockQuery$JoinedContestPaginated1$Companion$invoke$1$edges$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.ContestsPostLockQuery$JoinedContestPaginated1$Companion$invoke$1$edges$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestsPostLockQuery.Edge1> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ContestsPostLockQuery.Edge1 invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ContestsPostLockQuery.Edge1.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestsPostLockQuery.Edge1 invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ContestsPostLockQuery.Edge1) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
