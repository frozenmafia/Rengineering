package com.app.dream11.onboarding;

import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes3.dex */
final class OnBoardingActivity$isDeferDeepLink$2 extends Lambda implements Styleable.ArcMotion<Boolean> {
    final /* synthetic */ OnBoardingActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBoardingActivity$isDeferDeepLink$2(OnBoardingActivity onBoardingActivity) {
        super(0);
        this.this$0 = onBoardingActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final Boolean invoke() {
        Bundle extras;
        Intent intent = this.this$0.getIntent();
        boolean z = true;
        if (intent != null && (extras = intent.getExtras()) != null) {
            z = extras.getBoolean("shouldShowChangeSport", true);
        }
        return Boolean.valueOf(z);
    }
}
