package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchMyContestDefaultTabQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchMyContestDefaultTabQuery$Data$Companion$invoke$1$site$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchMyContestDefaultTabQuery.Site> {
    public static final FetchMyContestDefaultTabQuery$Data$Companion$invoke$1$site$1 INSTANCE = new FetchMyContestDefaultTabQuery$Data$Companion$invoke$1$site$1();

    FetchMyContestDefaultTabQuery$Data$Companion$invoke$1$site$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchMyContestDefaultTabQuery.Site invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchMyContestDefaultTabQuery.Site.Companion.invoke(removecancellable);
    }
}
