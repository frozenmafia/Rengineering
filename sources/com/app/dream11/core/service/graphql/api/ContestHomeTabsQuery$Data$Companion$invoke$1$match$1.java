package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestHomeTabsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestHomeTabsQuery$Data$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestHomeTabsQuery.Match> {
    public static final ContestHomeTabsQuery$Data$Companion$invoke$1$match$1 INSTANCE = new ContestHomeTabsQuery$Data$Companion$invoke$1$match$1();

    ContestHomeTabsQuery$Data$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestHomeTabsQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestHomeTabsQuery.Match.Companion.invoke(removecancellable);
    }
}
