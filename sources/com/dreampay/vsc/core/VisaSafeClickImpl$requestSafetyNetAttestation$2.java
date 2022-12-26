package com.dreampay.vsc.core;

import com.dreampay.vsc.api.AttestationCallback;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class VisaSafeClickImpl$requestSafetyNetAttestation$2 extends Lambda implements Styleable.ChangeBounds<Exception, setAnimationMatrix> {
    final /* synthetic */ AttestationCallback $attestationCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VisaSafeClickImpl$requestSafetyNetAttestation$2(AttestationCallback attestationCallback) {
        super(1);
        this.$attestationCallback = attestationCallback;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Exception exc) {
        invoke2(exc);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Exception exc) {
        runAnimators.valueOf(exc, "exception");
        this.$attestationCallback.ag$a(exc);
        exc.printStackTrace();
    }
}
