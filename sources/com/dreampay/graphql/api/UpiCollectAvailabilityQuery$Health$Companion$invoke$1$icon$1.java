package com.dreampay.graphql.api;

import com.dreampay.graphql.api.UpiCollectAvailabilityQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class UpiCollectAvailabilityQuery$Health$Companion$invoke$1$icon$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UpiCollectAvailabilityQuery.Icon> {
    public static final UpiCollectAvailabilityQuery$Health$Companion$invoke$1$icon$1 INSTANCE = new UpiCollectAvailabilityQuery$Health$Companion$invoke$1$icon$1();

    UpiCollectAvailabilityQuery$Health$Companion$invoke$1$icon$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UpiCollectAvailabilityQuery.Icon invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UpiCollectAvailabilityQuery.Icon.Companion.invoke(removecancellable);
    }
}
