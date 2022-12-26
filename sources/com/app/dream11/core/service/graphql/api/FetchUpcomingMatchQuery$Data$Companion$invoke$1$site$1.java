package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchUpcomingMatchQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchUpcomingMatchQuery$Data$Companion$invoke$1$site$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchUpcomingMatchQuery.Site> {
    public static final FetchUpcomingMatchQuery$Data$Companion$invoke$1$site$1 INSTANCE = new FetchUpcomingMatchQuery$Data$Companion$invoke$1$site$1();

    FetchUpcomingMatchQuery$Data$Companion$invoke$1$site$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchUpcomingMatchQuery.Site invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchUpcomingMatchQuery.Site.Companion.invoke(removecancellable);
    }
}
