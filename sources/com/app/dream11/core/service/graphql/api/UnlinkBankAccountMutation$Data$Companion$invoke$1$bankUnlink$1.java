package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.UnlinkBankAccountMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class UnlinkBankAccountMutation$Data$Companion$invoke$1$bankUnlink$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UnlinkBankAccountMutation.BankUnlink> {
    public static final UnlinkBankAccountMutation$Data$Companion$invoke$1$bankUnlink$1 INSTANCE = new UnlinkBankAccountMutation$Data$Companion$invoke$1$bankUnlink$1();

    UnlinkBankAccountMutation$Data$Companion$invoke$1$bankUnlink$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UnlinkBankAccountMutation.BankUnlink invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UnlinkBankAccountMutation.BankUnlink.Companion.invoke(removecancellable);
    }
}
