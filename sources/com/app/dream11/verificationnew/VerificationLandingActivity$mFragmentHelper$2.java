package com.app.dream11.verificationnew;

import com.app.dream11Pro.R;
import kotlin.jvm.internal.Lambda;
import o.MenuPresenter;
import o.Styleable;
/* loaded from: classes3.dex */
final class VerificationLandingActivity$mFragmentHelper$2 extends Lambda implements Styleable.ArcMotion<MenuPresenter> {
    final /* synthetic */ VerificationLandingActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationLandingActivity$mFragmentHelper$2(VerificationLandingActivity verificationLandingActivity) {
        super(0);
        this.this$0 = verificationLandingActivity;
    }

    @Override // o.Styleable.ArcMotion
    public final MenuPresenter invoke() {
        return new MenuPresenter(this.this$0.getSupportFragmentManager(), R.id.container_verification);
    }
}
