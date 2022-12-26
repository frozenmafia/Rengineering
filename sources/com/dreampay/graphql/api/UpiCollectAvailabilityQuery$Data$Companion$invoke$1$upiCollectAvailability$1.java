package com.dreampay.graphql.api;

import com.dreampay.graphql.api.UpiCollectAvailabilityQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class UpiCollectAvailabilityQuery$Data$Companion$invoke$1$upiCollectAvailability$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UpiCollectAvailabilityQuery.UpiCollectAvailability> {
    public static final UpiCollectAvailabilityQuery$Data$Companion$invoke$1$upiCollectAvailability$1 INSTANCE = new UpiCollectAvailabilityQuery$Data$Companion$invoke$1$upiCollectAvailability$1();

    UpiCollectAvailabilityQuery$Data$Companion$invoke$1$upiCollectAvailability$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UpiCollectAvailabilityQuery.UpiCollectAvailability invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UpiCollectAvailabilityQuery.UpiCollectAvailability.Companion.invoke(removecancellable);
    }
}
