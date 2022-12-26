package com.app.dream11.myprofile.firstpersonprofile;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class EmptyBadgesListVm$onLearnMoreClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Styleable.ArcMotion<setAnimationMatrix> $onCLick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmptyBadgesListVm$onLearnMoreClick$1(Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        super(0);
        this.$onCLick = arcMotion;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Styleable.ArcMotion<setAnimationMatrix> arcMotion = this.$onCLick;
        if (arcMotion == null) {
            return;
        }
        arcMotion.invoke();
    }
}
