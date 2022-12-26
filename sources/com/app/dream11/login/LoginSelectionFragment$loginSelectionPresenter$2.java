package com.app.dream11.login;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.MotionLayout;
import o.Styleable;
/* loaded from: classes3.dex */
final class LoginSelectionFragment$loginSelectionPresenter$2 extends Lambda implements Styleable.ArcMotion<MotionLayout.StateCache> {
    public static final LoginSelectionFragment$loginSelectionPresenter$2 INSTANCE = new LoginSelectionFragment$loginSelectionPresenter$2();

    LoginSelectionFragment$loginSelectionPresenter$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final MotionLayout.StateCache invoke() {
        return ActionMenuItem.valueOf().cancel();
    }
}
