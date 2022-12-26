package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestSectionDetailsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestSectionDetailsQuery$Match$Companion$invoke$1$contests$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ContestSectionDetailsQuery.Contest> {
    public static final ContestSectionDetailsQuery$Match$Companion$invoke$1$contests$1 INSTANCE = new ContestSectionDetailsQuery$Match$Companion$invoke$1$contests$1();

    ContestSectionDetailsQuery$Match$Companion$invoke$1$contests$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.ContestSectionDetailsQuery$Match$Companion$invoke$1$contests$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestSectionDetailsQuery.Contest> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ContestSectionDetailsQuery.Contest invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ContestSectionDetailsQuery.Contest.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestSectionDetailsQuery.Contest invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ContestSectionDetailsQuery.Contest) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
