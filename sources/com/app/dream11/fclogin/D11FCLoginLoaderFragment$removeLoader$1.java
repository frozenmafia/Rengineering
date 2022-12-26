package com.app.dream11.fclogin;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
final class D11FCLoginLoaderFragment$removeLoader$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ D11FCLoginLoaderFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11FCLoginLoaderFragment$removeLoader$1(D11FCLoginLoaderFragment d11FCLoginLoaderFragment) {
        super(0);
        this.this$0 = d11FCLoginLoaderFragment;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.this$0.values().getVisibility() == 0) {
            this.this$0.values().setVisibility(8);
            this.this$0.ah$a().removeView(this.this$0.values());
            this.this$0.valueOf().values();
        }
    }
}
