package com.dreampay.graphql.api;

import com.dreampay.graphql.api.CheckPhonePeAvailabilityQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class CheckPhonePeAvailabilityQuery$Data$Companion$invoke$1$phonepeAvailability$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CheckPhonePeAvailabilityQuery.PhonepeAvailability> {
    public static final CheckPhonePeAvailabilityQuery$Data$Companion$invoke$1$phonepeAvailability$1 INSTANCE = new CheckPhonePeAvailabilityQuery$Data$Companion$invoke$1$phonepeAvailability$1();

    CheckPhonePeAvailabilityQuery$Data$Companion$invoke$1$phonepeAvailability$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CheckPhonePeAvailabilityQuery.PhonepeAvailability invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CheckPhonePeAvailabilityQuery.PhonepeAvailability.Companion.invoke(removecancellable);
    }
}
