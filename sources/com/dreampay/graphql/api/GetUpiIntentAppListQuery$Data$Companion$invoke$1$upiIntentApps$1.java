package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetUpiIntentAppListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GetUpiIntentAppListQuery$Data$Companion$invoke$1$upiIntentApps$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetUpiIntentAppListQuery.UpiIntentApp> {
    public static final GetUpiIntentAppListQuery$Data$Companion$invoke$1$upiIntentApps$1 INSTANCE = new GetUpiIntentAppListQuery$Data$Companion$invoke$1$upiIntentApps$1();

    GetUpiIntentAppListQuery$Data$Companion$invoke$1$upiIntentApps$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.dreampay.graphql.api.GetUpiIntentAppListQuery$Data$Companion$invoke$1$upiIntentApps$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetUpiIntentAppListQuery.UpiIntentApp> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetUpiIntentAppListQuery.UpiIntentApp invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetUpiIntentAppListQuery.UpiIntentApp.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetUpiIntentAppListQuery.UpiIntentApp invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetUpiIntentAppListQuery.UpiIntentApp) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
