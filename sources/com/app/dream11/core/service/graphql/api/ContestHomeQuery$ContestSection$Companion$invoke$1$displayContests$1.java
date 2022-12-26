package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestHomeQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestHomeQuery$ContestSection$Companion$invoke$1$displayContests$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ContestHomeQuery.DisplayContest> {
    public static final ContestHomeQuery$ContestSection$Companion$invoke$1$displayContests$1 INSTANCE = new ContestHomeQuery$ContestSection$Companion$invoke$1$displayContests$1();

    ContestHomeQuery$ContestSection$Companion$invoke$1$displayContests$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.ContestHomeQuery$ContestSection$Companion$invoke$1$displayContests$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestHomeQuery.DisplayContest> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ContestHomeQuery.DisplayContest invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ContestHomeQuery.DisplayContest.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestHomeQuery.DisplayContest invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ContestHomeQuery.DisplayContest) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
