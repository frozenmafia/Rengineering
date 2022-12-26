package com.app.dream11.core.service.graphql.api.verification.bank;

import com.app.dream11.core.service.graphql.api.verification.bank.IfscDetailsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class IfscDetailsQuery$Data$Companion$invoke$1$getIfscDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, IfscDetailsQuery.GetIfscDetails> {
    public static final IfscDetailsQuery$Data$Companion$invoke$1$getIfscDetails$1 INSTANCE = new IfscDetailsQuery$Data$Companion$invoke$1$getIfscDetails$1();

    IfscDetailsQuery$Data$Companion$invoke$1$getIfscDetails$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final IfscDetailsQuery.GetIfscDetails invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return IfscDetailsQuery.GetIfscDetails.Companion.invoke(removecancellable);
    }
}
