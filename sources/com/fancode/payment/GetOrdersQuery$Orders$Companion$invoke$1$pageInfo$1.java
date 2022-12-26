package com.fancode.payment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GetOrdersQuery$Orders$Companion$invoke$1$pageInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetOrdersQuery$HaptikSDK$a> {
    public static final GetOrdersQuery$Orders$Companion$invoke$1$pageInfo$1 INSTANCE = new GetOrdersQuery$Orders$Companion$invoke$1$pageInfo$1();

    GetOrdersQuery$Orders$Companion$invoke$1$pageInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetOrdersQuery$HaptikSDK$a invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetOrdersQuery$HaptikSDK$a.ag$a.ag$a(removecancellable);
    }
}
