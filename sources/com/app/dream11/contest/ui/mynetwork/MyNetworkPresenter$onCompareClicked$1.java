package com.app.dream11.contest.ui.mynetwork;

import com.app.dream11.core.service.graphql.api.type.MatchStatus;
import kotlin.jvm.internal.Lambda;
import o.AnimatedStateListDrawableCompat;
import o.Styleable;
import o.TrustedWebActivityCallbackRemote;
import o.readFamily;
import o.setAnimationMatrix;
import o.updatePreDraw;
/* loaded from: classes2.dex */
public final class MyNetworkPresenter$onCompareClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ AnimatedStateListDrawableCompat.AnimatedVectorDrawableTransition this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyNetworkPresenter$onCompareClicked$1(AnimatedStateListDrawableCompat.AnimatedVectorDrawableTransition animatedVectorDrawableTransition) {
        super(0);
        this.this$0 = animatedVectorDrawableTransition;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        updatePreDraw ah$a = this.this$0.ah$a();
        MatchStatus ah$b = this.this$0.ah$b();
        readFamily.valueOf((TrustedWebActivityCallbackRemote) ah$a, this.this$0.getInitSettings(), this.this$0.HaptikSDK$a(), -1L, (ah$b == null || (r2 = ah$b.getRawValue()) == null) ? "" : "", "", "", -1, "", (Integer) (-1), -1.0d, false, false, -1);
    }
}
