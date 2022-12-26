package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.LoginTwoFactorCredentialsCheckMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LoginTwoFactorCredentialsCheckMutation$LoginTwoFactorCheckCredentials$Companion$invoke$1$otpResponse$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, LoginTwoFactorCredentialsCheckMutation.OtpResponse> {
    public static final LoginTwoFactorCredentialsCheckMutation$LoginTwoFactorCheckCredentials$Companion$invoke$1$otpResponse$1 INSTANCE = new LoginTwoFactorCredentialsCheckMutation$LoginTwoFactorCheckCredentials$Companion$invoke$1$otpResponse$1();

    LoginTwoFactorCredentialsCheckMutation$LoginTwoFactorCheckCredentials$Companion$invoke$1$otpResponse$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final LoginTwoFactorCredentialsCheckMutation.OtpResponse invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return LoginTwoFactorCredentialsCheckMutation.OtpResponse.Companion.invoke(removecancellable);
    }
}
