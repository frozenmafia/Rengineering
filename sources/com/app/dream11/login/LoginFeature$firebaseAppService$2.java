package com.app.dream11.login;

import kotlin.jvm.internal.Lambda;
import o.AbstractResolvableFuture;
import o.Styleable;
import o.setMaxElevation;
/* loaded from: classes3.dex */
public final class LoginFeature$firebaseAppService$2 extends Lambda implements Styleable.ArcMotion<setMaxElevation> {
    final /* synthetic */ AbstractResolvableFuture.AtomicHelper $serviceProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginFeature$firebaseAppService$2(AbstractResolvableFuture.AtomicHelper atomicHelper) {
        super(0);
        this.$serviceProvider = atomicHelper;
    }

    @Override // o.Styleable.ArcMotion
    public final setMaxElevation invoke() {
        return this.$serviceProvider.HaptikSDK$b();
    }
}
