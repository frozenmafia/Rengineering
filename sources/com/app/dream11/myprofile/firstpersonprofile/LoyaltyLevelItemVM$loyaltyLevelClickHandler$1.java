package com.app.dream11.myprofile.firstpersonprofile;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
import o.setFinalValue;
import o.updateReferencesWithNewDefinition;
/* loaded from: classes3.dex */
public final class LoyaltyLevelItemVM$loyaltyLevelClickHandler$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ setFinalValue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyLevelItemVM$loyaltyLevelClickHandler$1(setFinalValue setfinalvalue) {
        super(0);
        this.this$0 = setfinalvalue;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.this$0.ah$b() instanceof updateReferencesWithNewDefinition) {
            ((updateReferencesWithNewDefinition) this.this$0.ah$b()).values(this.this$0.HaptikSDK$a());
        }
    }
}
