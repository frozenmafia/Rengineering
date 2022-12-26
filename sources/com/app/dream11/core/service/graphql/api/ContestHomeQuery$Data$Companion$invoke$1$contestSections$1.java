package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestHomeQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestHomeQuery$Data$Companion$invoke$1$contestSections$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ContestHomeQuery.ContestSection> {
    public static final ContestHomeQuery$Data$Companion$invoke$1$contestSections$1 INSTANCE = new ContestHomeQuery$Data$Companion$invoke$1$contestSections$1();

    ContestHomeQuery$Data$Companion$invoke$1$contestSections$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.ContestHomeQuery$Data$Companion$invoke$1$contestSections$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestHomeQuery.ContestSection> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ContestHomeQuery.ContestSection invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ContestHomeQuery.ContestSection.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestHomeQuery.ContestSection invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ContestHomeQuery.ContestSection) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
