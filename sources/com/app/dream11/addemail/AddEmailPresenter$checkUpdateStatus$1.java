package com.app.dream11.addemail;

import kotlin.jvm.internal.Lambda;
import o.OpenForTesting;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class AddEmailPresenter$checkUpdateStatus$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $loginType;
    final /* synthetic */ OpenForTesting this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddEmailPresenter$checkUpdateStatus$1(OpenForTesting openForTesting, String str) {
        super(0);
        this.this$0 = openForTesting;
        this.$loginType = str;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.values(this.$loginType);
    }
}
