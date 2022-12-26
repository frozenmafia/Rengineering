package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.type.VerificationOption;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class WithdrawalQuery$WithdrawalOptions$marshaller$1$1 extends Lambda implements Transition<List<? extends VerificationOption>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final WithdrawalQuery$WithdrawalOptions$marshaller$1$1 INSTANCE = new WithdrawalQuery$WithdrawalOptions$marshaller$1$1();

    WithdrawalQuery$WithdrawalOptions$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends VerificationOption> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2(list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends VerificationOption> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (VerificationOption verificationOption : list) {
            valueof.valueOf(verificationOption.getRawValue());
        }
    }
}
