package com.fancode.payment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes4.dex */
final class GetOrdersQuery$Data$Companion$invoke$1$orders$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetOrdersQuery$ah$a> {
    public static final GetOrdersQuery$Data$Companion$invoke$1$orders$1 INSTANCE = new GetOrdersQuery$Data$Companion$invoke$1$orders$1();

    GetOrdersQuery$Data$Companion$invoke$1$orders$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetOrdersQuery$ah$a invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetOrdersQuery$ah$a.ah$a.valueOf(removecancellable);
    }
}
