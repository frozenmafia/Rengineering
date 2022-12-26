package com.dreampay.vsc.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class SafetyNetManager$onSafetyNetAttestationFailure$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Exception $exception;
    final /* synthetic */ Styleable.ChangeBounds $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyNetManager$onSafetyNetAttestationFailure$1(Styleable.ChangeBounds changeBounds, Exception exc) {
        super(0);
        this.$onError = changeBounds;
        this.$exception = exc;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Styleable.ChangeBounds changeBounds = this.$onError;
        Exception exc = this.$exception;
        changeBounds.invoke(new Exception((exc == null || (r1 = exc.getMessage()) == null) ? "Error occurred while attestation" : "Error occurred while attestation"));
    }
}
