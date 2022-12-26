package com.app.dream11.scorecard;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
import o.setType;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ScorecardViewHelper$sendVideoStreamingStartEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $source;
    final /* synthetic */ ScorecardViewHelper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScorecardViewHelper$sendVideoStreamingStartEvent$1(ScorecardViewHelper scorecardViewHelper, String str) {
        super(0);
        this.this$0 = scorecardViewHelper;
        this.$source = str;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        setType values = ScorecardViewHelper.values(this.this$0);
        int signupData = this.this$0.getSignupData();
        int asInterface = this.this$0.asInterface();
        String onMessageChannelReady = this.this$0.onMessageChannelReady();
        int ah$a = this.this$0.ah$a();
        String str = this.$source;
        if (str == null) {
            str = "";
        }
        values.ag$a(signupData, asInterface, onMessageChannelReady, ah$a, str);
    }
}
