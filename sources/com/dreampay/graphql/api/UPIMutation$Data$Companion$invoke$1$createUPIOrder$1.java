package com.dreampay.graphql.api;

import com.dreampay.graphql.api.UPIMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class UPIMutation$Data$Companion$invoke$1$createUPIOrder$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UPIMutation.CreateUPIOrder> {
    public static final UPIMutation$Data$Companion$invoke$1$createUPIOrder$1 INSTANCE = new UPIMutation$Data$Companion$invoke$1$createUPIOrder$1();

    UPIMutation$Data$Companion$invoke$1$createUPIOrder$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UPIMutation.CreateUPIOrder invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UPIMutation.CreateUPIOrder.Companion.invoke(removecancellable);
    }
}
