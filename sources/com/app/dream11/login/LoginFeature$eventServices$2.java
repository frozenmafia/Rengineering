package com.app.dream11.login;

import kotlin.jvm.internal.Lambda;
import o.AbstractResolvableFuture;
import o.Styleable;
import o.setPresenterCallback;
/* loaded from: classes3.dex */
public final class LoginFeature$eventServices$2 extends Lambda implements Styleable.ArcMotion<setPresenterCallback> {
    final /* synthetic */ AbstractResolvableFuture.AtomicHelper $serviceProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginFeature$eventServices$2(AbstractResolvableFuture.AtomicHelper atomicHelper) {
        super(0);
        this.$serviceProvider = atomicHelper;
    }

    @Override // o.Styleable.ArcMotion
    public final setPresenterCallback invoke() {
        return this.$serviceProvider.invoke();
    }
}
