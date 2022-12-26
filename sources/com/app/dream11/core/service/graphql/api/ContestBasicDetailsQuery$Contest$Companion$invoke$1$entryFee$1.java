package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestBasicDetailsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ContestBasicDetailsQuery$Contest$Companion$invoke$1$entryFee$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestBasicDetailsQuery.EntryFee> {
    public static final ContestBasicDetailsQuery$Contest$Companion$invoke$1$entryFee$1 INSTANCE = new ContestBasicDetailsQuery$Contest$Companion$invoke$1$entryFee$1();

    ContestBasicDetailsQuery$Contest$Companion$invoke$1$entryFee$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestBasicDetailsQuery.EntryFee invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestBasicDetailsQuery.EntryFee.Companion.invoke(removecancellable);
    }
}
