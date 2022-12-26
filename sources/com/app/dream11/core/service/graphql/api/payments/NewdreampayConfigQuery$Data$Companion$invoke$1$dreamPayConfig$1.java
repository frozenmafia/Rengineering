package com.app.dream11.core.service.graphql.api.payments;

import com.app.dream11.core.service.graphql.api.payments.NewdreampayConfigQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NewdreampayConfigQuery$Data$Companion$invoke$1$dreamPayConfig$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, NewdreampayConfigQuery.DreamPayConfig> {
    public static final NewdreampayConfigQuery$Data$Companion$invoke$1$dreamPayConfig$1 INSTANCE = new NewdreampayConfigQuery$Data$Companion$invoke$1$dreamPayConfig$1();

    NewdreampayConfigQuery$Data$Companion$invoke$1$dreamPayConfig$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final NewdreampayConfigQuery.DreamPayConfig invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return NewdreampayConfigQuery.DreamPayConfig.Companion.invoke(removecancellable);
    }
}
