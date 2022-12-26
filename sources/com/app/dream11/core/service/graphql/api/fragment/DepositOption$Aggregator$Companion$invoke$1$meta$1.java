package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.DepositOption;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DepositOption$Aggregator$Companion$invoke$1$meta$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, DepositOption.Meta> {
    public static final DepositOption$Aggregator$Companion$invoke$1$meta$1 INSTANCE = new DepositOption$Aggregator$Companion$invoke$1$meta$1();

    DepositOption$Aggregator$Companion$invoke$1$meta$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final DepositOption.Meta invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return DepositOption.Meta.Companion.invoke(removecancellable);
    }
}
