package com.app.dream11.login.presenters;

import com.app.dream11.model.FlowState;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.SupportSQLiteQuery;
import o.getLayoutDuringTransition;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class EnterOTPForMobileVerificationFor2FAPresenter$submitOTP$1 extends Lambda implements Styleable.ArcMotion<SupportSQLiteQuery<FlowState>> {
    final /* synthetic */ getLayoutDuringTransition this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterOTPForMobileVerificationFor2FAPresenter$submitOTP$1(getLayoutDuringTransition getlayoutduringtransition) {
        super(0);
        this.this$0 = getlayoutduringtransition;
    }

    @Override // o.Styleable.ArcMotion
    public final SupportSQLiteQuery<FlowState> invoke() {
        SupportSQLiteQuery<FlowState> values = this.this$0.values().values();
        runAnimators.ah$a(values, "deepLinkingFeature.flowState");
        return values;
    }
}
