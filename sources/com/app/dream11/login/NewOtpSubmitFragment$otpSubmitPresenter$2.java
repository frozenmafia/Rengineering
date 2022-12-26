package com.app.dream11.login;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.MotionLayout;
import o.Styleable;
/* loaded from: classes3.dex */
final class NewOtpSubmitFragment$otpSubmitPresenter$2 extends Lambda implements Styleable.ArcMotion<MotionLayout.TransitionState> {
    public static final NewOtpSubmitFragment$otpSubmitPresenter$2 INSTANCE = new NewOtpSubmitFragment$otpSubmitPresenter$2();

    NewOtpSubmitFragment$otpSubmitPresenter$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final MotionLayout.TransitionState invoke() {
        return ActionMenuItem.valueOf().sendCustomAction();
    }
}
