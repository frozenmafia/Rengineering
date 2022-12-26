package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.type.VerificationOption;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WithdrawalQuery$WithdrawalOptions$Companion$invoke$1$addVerificationOptions$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, VerificationOption> {
    public static final WithdrawalQuery$WithdrawalOptions$Companion$invoke$1$addVerificationOptions$1 INSTANCE = new WithdrawalQuery$WithdrawalOptions$Companion$invoke$1$addVerificationOptions$1();

    WithdrawalQuery$WithdrawalOptions$Companion$invoke$1$addVerificationOptions$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final VerificationOption invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return VerificationOption.Companion.safeValueOf(valuesVar.ah$a());
    }
}
