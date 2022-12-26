package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchMatchConditionsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchMatchConditionsQuery$Data$Companion$invoke$1$matchConditions$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchMatchConditionsQuery.MatchConditions> {
    public static final FetchMatchConditionsQuery$Data$Companion$invoke$1$matchConditions$1 INSTANCE = new FetchMatchConditionsQuery$Data$Companion$invoke$1$matchConditions$1();

    FetchMatchConditionsQuery$Data$Companion$invoke$1$matchConditions$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchMatchConditionsQuery.MatchConditions invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchMatchConditionsQuery.MatchConditions.Companion.invoke(removecancellable);
    }
}
