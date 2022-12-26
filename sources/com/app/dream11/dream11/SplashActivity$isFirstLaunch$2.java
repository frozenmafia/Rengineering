package com.app.dream11.dream11;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes3.dex */
final class SplashActivity$isFirstLaunch$2 extends Lambda implements Styleable.ArcMotion<Boolean> {
    final /* synthetic */ SplashActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashActivity$isFirstLaunch$2(SplashActivity splashActivity) {
        super(0);
        this.this$0 = splashActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.HaptikSDK$b().ag$a("animation", true));
    }
}
