package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.LoginGetOTPMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LoginGetOTPMutation$Data$Companion$invoke$1$loginGetOTP$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, LoginGetOTPMutation.LoginGetOTP> {
    public static final LoginGetOTPMutation$Data$Companion$invoke$1$loginGetOTP$1 INSTANCE = new LoginGetOTPMutation$Data$Companion$invoke$1$loginGetOTP$1();

    LoginGetOTPMutation$Data$Companion$invoke$1$loginGetOTP$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final LoginGetOTPMutation.LoginGetOTP invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return LoginGetOTPMutation.LoginGetOTP.Companion.invoke(removecancellable);
    }
}
