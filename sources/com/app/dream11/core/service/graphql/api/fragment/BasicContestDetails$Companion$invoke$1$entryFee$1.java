package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.BasicContestDetails;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BasicContestDetails$Companion$invoke$1$entryFee$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, BasicContestDetails.EntryFee> {
    public static final BasicContestDetails$Companion$invoke$1$entryFee$1 INSTANCE = new BasicContestDetails$Companion$invoke$1$entryFee$1();

    BasicContestDetails$Companion$invoke$1$entryFee$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final BasicContestDetails.EntryFee invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return BasicContestDetails.EntryFee.Companion.invoke(removecancellable);
    }
}
