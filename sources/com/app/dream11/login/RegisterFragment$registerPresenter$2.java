package com.app.dream11.login;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.MotionScene;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RegisterFragment$registerPresenter$2 extends Lambda implements Styleable.ArcMotion<MotionScene> {
    final /* synthetic */ RegisterFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterFragment$registerPresenter$2(RegisterFragment registerFragment) {
        super(0);
        this.this$0 = registerFragment;
    }

    @Override // o.Styleable.ArcMotion
    public final MotionScene invoke() {
        return ActionMenuItem.valueOf().values(this.this$0.getBaseActivity());
    }
}
