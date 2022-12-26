package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestDetailsBaseQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestDetailsBaseQuery$Data$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestDetailsBaseQuery.Match> {
    public static final ContestDetailsBaseQuery$Data$Companion$invoke$1$match$1 INSTANCE = new ContestDetailsBaseQuery$Data$Companion$invoke$1$match$1();

    ContestDetailsBaseQuery$Data$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestDetailsBaseQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestDetailsBaseQuery.Match.Companion.invoke(removecancellable);
    }
}
