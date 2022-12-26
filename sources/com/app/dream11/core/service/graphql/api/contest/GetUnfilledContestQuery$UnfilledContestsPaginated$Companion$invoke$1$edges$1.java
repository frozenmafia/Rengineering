package com.app.dream11.core.service.graphql.api.contest;

import com.app.dream11.core.service.graphql.api.contest.GetUnfilledContestQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetUnfilledContestQuery$UnfilledContestsPaginated$Companion$invoke$1$edges$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetUnfilledContestQuery.Edge> {
    public static final GetUnfilledContestQuery$UnfilledContestsPaginated$Companion$invoke$1$edges$1 INSTANCE = new GetUnfilledContestQuery$UnfilledContestsPaginated$Companion$invoke$1$edges$1();

    GetUnfilledContestQuery$UnfilledContestsPaginated$Companion$invoke$1$edges$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.contest.GetUnfilledContestQuery$UnfilledContestsPaginated$Companion$invoke$1$edges$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetUnfilledContestQuery.Edge> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetUnfilledContestQuery.Edge invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetUnfilledContestQuery.Edge.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetUnfilledContestQuery.Edge invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetUnfilledContestQuery.Edge) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
