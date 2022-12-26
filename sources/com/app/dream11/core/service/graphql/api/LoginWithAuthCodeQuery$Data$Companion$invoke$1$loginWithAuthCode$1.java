package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.LoginWithAuthCodeQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class LoginWithAuthCodeQuery$Data$Companion$invoke$1$loginWithAuthCode$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, LoginWithAuthCodeQuery.LoginWithAuthCode> {
    public static final LoginWithAuthCodeQuery$Data$Companion$invoke$1$loginWithAuthCode$1 INSTANCE = new LoginWithAuthCodeQuery$Data$Companion$invoke$1$loginWithAuthCode$1();

    LoginWithAuthCodeQuery$Data$Companion$invoke$1$loginWithAuthCode$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final LoginWithAuthCodeQuery.LoginWithAuthCode invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return LoginWithAuthCodeQuery.LoginWithAuthCode.Companion.invoke(removecancellable);
    }
}
