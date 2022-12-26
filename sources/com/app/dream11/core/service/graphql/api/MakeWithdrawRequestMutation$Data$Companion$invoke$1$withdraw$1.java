package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MakeWithdrawRequestMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MakeWithdrawRequestMutation$Data$Companion$invoke$1$withdraw$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MakeWithdrawRequestMutation.Withdraw> {
    public static final MakeWithdrawRequestMutation$Data$Companion$invoke$1$withdraw$1 INSTANCE = new MakeWithdrawRequestMutation$Data$Companion$invoke$1$withdraw$1();

    MakeWithdrawRequestMutation$Data$Companion$invoke$1$withdraw$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MakeWithdrawRequestMutation.Withdraw invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MakeWithdrawRequestMutation.Withdraw.Companion.invoke(removecancellable);
    }
}
