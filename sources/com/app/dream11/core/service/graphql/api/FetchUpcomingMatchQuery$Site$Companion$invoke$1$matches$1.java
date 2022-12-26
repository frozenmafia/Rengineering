package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchUpcomingMatchQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchUpcomingMatchQuery$Site$Companion$invoke$1$matches$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchUpcomingMatchQuery.Matches> {
    public static final FetchUpcomingMatchQuery$Site$Companion$invoke$1$matches$1 INSTANCE = new FetchUpcomingMatchQuery$Site$Companion$invoke$1$matches$1();

    FetchUpcomingMatchQuery$Site$Companion$invoke$1$matches$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchUpcomingMatchQuery.Matches invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchUpcomingMatchQuery.Matches.Companion.invoke(removecancellable);
    }
}
