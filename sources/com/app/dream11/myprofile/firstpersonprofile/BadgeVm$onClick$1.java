package com.app.dream11.myprofile.firstpersonprofile;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.addToRow;
import o.isSmallerThan;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class BadgeVm$onClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ isSmallerThan this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BadgeVm$onClick$1(isSmallerThan issmallerthan) {
        super(0);
        this.this$0 = issmallerthan;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        addToRow addtorow;
        addtorow = this.this$0.HaptikSDK$a;
        if (addtorow == null) {
            return;
        }
        addtorow.valueOf(this.this$0.valueOf().valueOf(), this.this$0.valueOf().values().name());
    }
}
