package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.BankData;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class BankData$Companion$invoke$1$bank$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, BankData.Bank> {
    public static final BankData$Companion$invoke$1$bank$1 INSTANCE = new BankData$Companion$invoke$1$bank$1();

    BankData$Companion$invoke$1$bank$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final BankData.Bank invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return BankData.Bank.Companion.invoke(removecancellable);
    }
}
