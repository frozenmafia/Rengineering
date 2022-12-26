package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ChangePasswordMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ChangePasswordMutation$Data$Companion$invoke$1$changePassword$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ChangePasswordMutation.ChangePassword> {
    public static final ChangePasswordMutation$Data$Companion$invoke$1$changePassword$1 INSTANCE = new ChangePasswordMutation$Data$Companion$invoke$1$changePassword$1();

    ChangePasswordMutation$Data$Companion$invoke$1$changePassword$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ChangePasswordMutation.ChangePassword invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ChangePasswordMutation.ChangePassword.Companion.invoke(removecancellable);
    }
}
