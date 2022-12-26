package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.LoginWithEmailMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class LoginWithEmailMutation$Data$Companion$invoke$1$login$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, LoginWithEmailMutation.Login> {
    public static final LoginWithEmailMutation$Data$Companion$invoke$1$login$1 INSTANCE = new LoginWithEmailMutation$Data$Companion$invoke$1$login$1();

    LoginWithEmailMutation$Data$Companion$invoke$1$login$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final LoginWithEmailMutation.Login invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return LoginWithEmailMutation.Login.Companion.invoke(removecancellable);
    }
}
