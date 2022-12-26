package com.app.dream11.core.service.graphql.api.responsibleplay;

import com.app.dream11.core.service.graphql.api.responsibleplay.ResponsiblePlayDepositCriticalityQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ResponsiblePlayDepositCriticalityQuery$Data$Companion$invoke$1$getResponsiblePlayDepositCriticality$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ResponsiblePlayDepositCriticalityQuery.GetResponsiblePlayDepositCriticality> {
    public static final ResponsiblePlayDepositCriticalityQuery$Data$Companion$invoke$1$getResponsiblePlayDepositCriticality$1 INSTANCE = new ResponsiblePlayDepositCriticalityQuery$Data$Companion$invoke$1$getResponsiblePlayDepositCriticality$1();

    ResponsiblePlayDepositCriticalityQuery$Data$Companion$invoke$1$getResponsiblePlayDepositCriticality$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.responsibleplay.ResponsiblePlayDepositCriticalityQuery$Data$Companion$invoke$1$getResponsiblePlayDepositCriticality$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ResponsiblePlayDepositCriticalityQuery.GetResponsiblePlayDepositCriticality> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ResponsiblePlayDepositCriticalityQuery.GetResponsiblePlayDepositCriticality invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ResponsiblePlayDepositCriticalityQuery.GetResponsiblePlayDepositCriticality.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ResponsiblePlayDepositCriticalityQuery.GetResponsiblePlayDepositCriticality invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ResponsiblePlayDepositCriticalityQuery.GetResponsiblePlayDepositCriticality) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
