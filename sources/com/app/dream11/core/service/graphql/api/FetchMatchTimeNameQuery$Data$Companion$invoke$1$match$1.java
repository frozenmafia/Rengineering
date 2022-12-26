package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchMatchTimeNameQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchMatchTimeNameQuery$Data$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchMatchTimeNameQuery.Match> {
    public static final FetchMatchTimeNameQuery$Data$Companion$invoke$1$match$1 INSTANCE = new FetchMatchTimeNameQuery$Data$Companion$invoke$1$match$1();

    FetchMatchTimeNameQuery$Data$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchMatchTimeNameQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchMatchTimeNameQuery.Match.Companion.invoke(removecancellable);
    }
}
