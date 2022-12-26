package com.google.android.play.core.ktx;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class AppUpdateManagerKtxKt$runTask$3$1 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ Styleable.ArcMotion<setAnimationMatrix> $onCanceled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateManagerKtxKt$runTask$3$1(Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        super(1);
        this.$onCanceled = arcMotion;
    }

    @Override // o.Styleable.ChangeBounds
    public final /* bridge */ /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        invoke2(th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$onCanceled.invoke();
    }
}
