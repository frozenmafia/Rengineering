package com.dreampay.vsc.core;

import com.dreampay.commons.constants.Constants;
import com.dreampay.vsc.api.AttestationCallback;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class VisaSafeClickImpl$requestSafetyNetAttestation$1 extends Lambda implements Transition<String, String, setAnimationMatrix> {
    final /* synthetic */ AttestationCallback $attestationCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VisaSafeClickImpl$requestSafetyNetAttestation$1(AttestationCallback attestationCallback) {
        super(2);
        this.$attestationCallback = attestationCallback;
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(String str, String str2) {
        invoke2(str, str2);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        runAnimators.valueOf(str, Constants.RESULT);
        runAnimators.valueOf(str2, "nonce");
        this.$attestationCallback.valueOf(str, str2);
    }
}
