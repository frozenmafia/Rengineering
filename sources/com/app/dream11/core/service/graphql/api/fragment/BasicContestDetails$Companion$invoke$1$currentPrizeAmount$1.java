package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.BasicContestDetails;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BasicContestDetails$Companion$invoke$1$currentPrizeAmount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, BasicContestDetails.CurrentPrizeAmount> {
    public static final BasicContestDetails$Companion$invoke$1$currentPrizeAmount$1 INSTANCE = new BasicContestDetails$Companion$invoke$1$currentPrizeAmount$1();

    BasicContestDetails$Companion$invoke$1$currentPrizeAmount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final BasicContestDetails.CurrentPrizeAmount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return BasicContestDetails.CurrentPrizeAmount.Companion.invoke(removecancellable);
    }
}
