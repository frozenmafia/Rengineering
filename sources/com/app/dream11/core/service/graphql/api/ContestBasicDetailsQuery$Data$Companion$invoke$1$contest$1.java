package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestBasicDetailsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ContestBasicDetailsQuery$Data$Companion$invoke$1$contest$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestBasicDetailsQuery.Contest> {
    public static final ContestBasicDetailsQuery$Data$Companion$invoke$1$contest$1 INSTANCE = new ContestBasicDetailsQuery$Data$Companion$invoke$1$contest$1();

    ContestBasicDetailsQuery$Data$Companion$invoke$1$contest$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestBasicDetailsQuery.Contest invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestBasicDetailsQuery.Contest.Companion.invoke(removecancellable);
    }
}
