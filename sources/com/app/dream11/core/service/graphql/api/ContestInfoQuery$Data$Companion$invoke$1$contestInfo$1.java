package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestInfoQuery$Data$Companion$invoke$1$contestInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestInfoQuery.ContestInfo> {
    public static final ContestInfoQuery$Data$Companion$invoke$1$contestInfo$1 INSTANCE = new ContestInfoQuery$Data$Companion$invoke$1$contestInfo$1();

    ContestInfoQuery$Data$Companion$invoke$1$contestInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestInfoQuery.ContestInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestInfoQuery.ContestInfo.Companion.invoke(removecancellable);
    }
}
