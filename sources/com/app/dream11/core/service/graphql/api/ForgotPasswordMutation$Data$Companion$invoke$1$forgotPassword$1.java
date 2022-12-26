package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ForgotPasswordMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ForgotPasswordMutation$Data$Companion$invoke$1$forgotPassword$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ForgotPasswordMutation.ForgotPassword> {
    public static final ForgotPasswordMutation$Data$Companion$invoke$1$forgotPassword$1 INSTANCE = new ForgotPasswordMutation$Data$Companion$invoke$1$forgotPassword$1();

    ForgotPasswordMutation$Data$Companion$invoke$1$forgotPassword$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ForgotPasswordMutation.ForgotPassword invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ForgotPasswordMutation.ForgotPassword.Companion.invoke(removecancellable);
    }
}
