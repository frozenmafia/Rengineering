package com.dreampay.graphql.api;

import com.dreampay.graphql.api.UpiCollectAvailabilityQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class UpiCollectAvailabilityQuery$UpiCollectAvailability$Companion$invoke$1$health$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UpiCollectAvailabilityQuery.Health> {
    public static final UpiCollectAvailabilityQuery$UpiCollectAvailability$Companion$invoke$1$health$1 INSTANCE = new UpiCollectAvailabilityQuery$UpiCollectAvailability$Companion$invoke$1$health$1();

    UpiCollectAvailabilityQuery$UpiCollectAvailability$Companion$invoke$1$health$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UpiCollectAvailabilityQuery.Health invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UpiCollectAvailabilityQuery.Health.Companion.invoke(removecancellable);
    }
}
