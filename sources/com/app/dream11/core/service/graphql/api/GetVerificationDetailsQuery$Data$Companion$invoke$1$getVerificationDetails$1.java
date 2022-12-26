package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetVerificationDetailsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetVerificationDetailsQuery$Data$Companion$invoke$1$getVerificationDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetVerificationDetailsQuery.GetVerificationDetail> {
    public static final GetVerificationDetailsQuery$Data$Companion$invoke$1$getVerificationDetails$1 INSTANCE = new GetVerificationDetailsQuery$Data$Companion$invoke$1$getVerificationDetails$1();

    GetVerificationDetailsQuery$Data$Companion$invoke$1$getVerificationDetails$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.GetVerificationDetailsQuery$Data$Companion$invoke$1$getVerificationDetails$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetVerificationDetailsQuery.GetVerificationDetail> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetVerificationDetailsQuery.GetVerificationDetail invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetVerificationDetailsQuery.GetVerificationDetail.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetVerificationDetailsQuery.GetVerificationDetail invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetVerificationDetailsQuery.GetVerificationDetail) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
