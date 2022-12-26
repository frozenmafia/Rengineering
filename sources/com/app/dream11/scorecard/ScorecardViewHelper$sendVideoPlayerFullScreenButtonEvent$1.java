package com.app.dream11.scorecard;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ScorecardViewHelper$sendVideoPlayerFullScreenButtonEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ ScorecardViewHelper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScorecardViewHelper$sendVideoPlayerFullScreenButtonEvent$1(ScorecardViewHelper scorecardViewHelper) {
        super(0);
        this.this$0 = scorecardViewHelper;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ScorecardViewHelper.values(this.this$0).ah$a(this.this$0.getSignupData(), this.this$0.asInterface(), this.this$0.onMessageChannelReady(), this.this$0.ah$a());
    }
}
