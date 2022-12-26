package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.ContestItem;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestItem$Companion$invoke$1$currentPrizeAmount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestItem.CurrentPrizeAmount> {
    public static final ContestItem$Companion$invoke$1$currentPrizeAmount$1 INSTANCE = new ContestItem$Companion$invoke$1$currentPrizeAmount$1();

    ContestItem$Companion$invoke$1$currentPrizeAmount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestItem.CurrentPrizeAmount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestItem.CurrentPrizeAmount.Companion.invoke(removecancellable);
    }
}
