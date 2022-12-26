package com.app.dream11.teamselection.newcreateteam;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.combineArrayExtra;
import o.getLabel;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class LegendVM$tooltipClickHandler$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ getLabel $clickHandler;
    final /* synthetic */ combineArrayExtra this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegendVM$tooltipClickHandler$1(getLabel getlabel, combineArrayExtra combinearrayextra) {
        super(0);
        this.$clickHandler = getlabel;
        this.this$0 = combinearrayextra;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        getLabel getlabel = this.$clickHandler;
        if (getlabel == null) {
            return;
        }
        getlabel.valueOf(this.this$0.HaptikSDK$c());
    }
}
