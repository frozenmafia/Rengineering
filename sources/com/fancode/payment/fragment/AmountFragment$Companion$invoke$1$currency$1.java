package com.fancode.payment.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onActivityPostStarted$ah$a;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class AmountFragment$Companion$invoke$1$currency$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, onActivityPostStarted$ah$a> {
    public static final AmountFragment$Companion$invoke$1$currency$1 INSTANCE = new AmountFragment$Companion$invoke$1$currency$1();

    AmountFragment$Companion$invoke$1$currency$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final onActivityPostStarted$ah$a invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return onActivityPostStarted$ah$a.ag$a.valueOf(removecancellable);
    }
}
