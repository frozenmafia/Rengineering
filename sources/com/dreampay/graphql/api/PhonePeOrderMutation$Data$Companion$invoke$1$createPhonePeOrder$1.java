package com.dreampay.graphql.api;

import com.dreampay.graphql.api.PhonePeOrderMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class PhonePeOrderMutation$Data$Companion$invoke$1$createPhonePeOrder$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PhonePeOrderMutation.CreatePhonePeOrder> {
    public static final PhonePeOrderMutation$Data$Companion$invoke$1$createPhonePeOrder$1 INSTANCE = new PhonePeOrderMutation$Data$Companion$invoke$1$createPhonePeOrder$1();

    PhonePeOrderMutation$Data$Companion$invoke$1$createPhonePeOrder$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PhonePeOrderMutation.CreatePhonePeOrder invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PhonePeOrderMutation.CreatePhonePeOrder.Companion.invoke(removecancellable);
    }
}
