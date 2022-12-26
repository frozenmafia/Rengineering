package com.app.dream11.rewards;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
final class ReactRewardsFragment$removeLoader$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ ReactRewardsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactRewardsFragment$removeLoader$1(ReactRewardsFragment reactRewardsFragment) {
        super(0);
        this.this$0 = reactRewardsFragment;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.this$0.ag$a().getVisibility() == 0) {
            this.this$0.ag$a().setVisibility(8);
            this.this$0.ah$a().removeView(this.this$0.ag$a());
            this.this$0.valueOf().ag$a();
        }
    }
}
