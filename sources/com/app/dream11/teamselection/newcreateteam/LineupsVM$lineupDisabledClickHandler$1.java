package com.app.dream11.teamselection.newcreateteam;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.addEmailCc;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class LineupsVM$lineupDisabledClickHandler$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ addEmailCc $clickHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineupsVM$lineupDisabledClickHandler$1(addEmailCc addemailcc) {
        super(0);
        this.$clickHandler = addemailcc;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$clickHandler.toString("CreateTeamFilter");
    }
}
