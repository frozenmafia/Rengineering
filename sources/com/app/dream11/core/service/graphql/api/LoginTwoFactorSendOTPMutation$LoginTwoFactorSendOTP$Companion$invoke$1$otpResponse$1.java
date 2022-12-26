package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.LoginTwoFactorSendOTPMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LoginTwoFactorSendOTPMutation$LoginTwoFactorSendOTP$Companion$invoke$1$otpResponse$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, LoginTwoFactorSendOTPMutation.OtpResponse> {
    public static final LoginTwoFactorSendOTPMutation$LoginTwoFactorSendOTP$Companion$invoke$1$otpResponse$1 INSTANCE = new LoginTwoFactorSendOTPMutation$LoginTwoFactorSendOTP$Companion$invoke$1$otpResponse$1();

    LoginTwoFactorSendOTPMutation$LoginTwoFactorSendOTP$Companion$invoke$1$otpResponse$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final LoginTwoFactorSendOTPMutation.OtpResponse invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return LoginTwoFactorSendOTPMutation.OtpResponse.Companion.invoke(removecancellable);
    }
}
