package com.app.dream11.core.drs;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.ViewPropertyAnimatorCompatSet;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
public final class DRSClient$fetchExperiments$2 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ int $retryCount;
    final /* synthetic */ long $startTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DRSClient$fetchExperiments$2(long j, int i) {
        super(1);
        this.$startTime = j;
        this.$retryCount = i;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        invoke2(th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        runAnimators.ag$a(th, "it");
        ViewPropertyAnimatorCompatSet.AnonymousClass1.values.values(th, this.$startTime, this.$retryCount);
    }
}
