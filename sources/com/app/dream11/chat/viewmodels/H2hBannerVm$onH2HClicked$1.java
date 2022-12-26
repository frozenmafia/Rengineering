package com.app.dream11.chat.viewmodels;

import com.app.dream11.chat.viewmodels.H2hBannerVm;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class H2hBannerVm$onH2HClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ H2hBannerVm this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H2hBannerVm$onH2HClicked$1(H2hBannerVm h2hBannerVm) {
        super(0);
        this.this$0 = h2hBannerVm;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        H2hBannerVm.H2HInteraction h2HInteraction;
        h2HInteraction = this.this$0.h2HInteraction;
        Integer num = this.this$0.getSelfScore().get();
        if (num == null) {
            num = r2;
        }
        int intValue = num.intValue();
        Integer num2 = this.this$0.getOpponentScore().get();
        int intValue2 = (num2 != null ? num2 : 0).intValue();
        String str = this.this$0.getSelfTeamName().get();
        if (str == null) {
            str = "";
        }
        String str2 = this.this$0.getOpponentTeamName().get();
        h2HInteraction.onH2HClicked(intValue, intValue2, str, str2 != null ? str2 : "");
    }
}
