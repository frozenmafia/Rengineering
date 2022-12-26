package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.DepositOption;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DepositOption$Companion$invoke$1$aggregator$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, DepositOption.Aggregator> {
    public static final DepositOption$Companion$invoke$1$aggregator$1 INSTANCE = new DepositOption$Companion$invoke$1$aggregator$1();

    DepositOption$Companion$invoke$1$aggregator$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final DepositOption.Aggregator invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return DepositOption.Aggregator.Companion.invoke(removecancellable);
    }
}
