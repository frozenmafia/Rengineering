package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestShareQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestShareQuery$Data$Companion$invoke$1$contest$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestShareQuery.Contest> {
    public static final ContestShareQuery$Data$Companion$invoke$1$contest$1 INSTANCE = new ContestShareQuery$Data$Companion$invoke$1$contest$1();

    ContestShareQuery$Data$Companion$invoke$1$contest$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestShareQuery.Contest invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestShareQuery.Contest.Companion.invoke(removecancellable);
    }
}
