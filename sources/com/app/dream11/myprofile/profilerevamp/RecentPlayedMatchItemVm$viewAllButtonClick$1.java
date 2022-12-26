package com.app.dream11.myprofile.profilerevamp;

import kotlin.jvm.internal.Lambda;
import o.Fixed;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class RecentPlayedMatchItemVm$viewAllButtonClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Fixed this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecentPlayedMatchItemVm$viewAllButtonClick$1(Fixed fixed) {
        super(0);
        this.this$0 = fixed;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.ah$a().ah$a("viewall_clicked");
    }
}
