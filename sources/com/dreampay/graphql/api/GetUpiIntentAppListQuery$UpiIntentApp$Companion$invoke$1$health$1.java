package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetUpiIntentAppListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GetUpiIntentAppListQuery$UpiIntentApp$Companion$invoke$1$health$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetUpiIntentAppListQuery.Health> {
    public static final GetUpiIntentAppListQuery$UpiIntentApp$Companion$invoke$1$health$1 INSTANCE = new GetUpiIntentAppListQuery$UpiIntentApp$Companion$invoke$1$health$1();

    GetUpiIntentAppListQuery$UpiIntentApp$Companion$invoke$1$health$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetUpiIntentAppListQuery.Health invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetUpiIntentAppListQuery.Health.Companion.invoke(removecancellable);
    }
}
