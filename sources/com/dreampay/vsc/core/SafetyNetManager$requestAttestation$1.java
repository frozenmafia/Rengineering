package com.dreampay.vsc.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class SafetyNetManager$requestAttestation$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Styleable.ChangeBounds $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyNetManager$requestAttestation$1(Styleable.ChangeBounds changeBounds) {
        super(0);
        this.$onError = changeBounds;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onError.invoke(new IllegalStateException("Cannot access APIs without Google Play services."));
    }
}
