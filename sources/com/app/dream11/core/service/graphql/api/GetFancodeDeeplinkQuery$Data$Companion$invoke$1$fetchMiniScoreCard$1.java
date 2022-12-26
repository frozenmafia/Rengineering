package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetFancodeDeeplinkQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetFancodeDeeplinkQuery$Data$Companion$invoke$1$fetchMiniScoreCard$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetFancodeDeeplinkQuery.FetchMiniScoreCard> {
    public static final GetFancodeDeeplinkQuery$Data$Companion$invoke$1$fetchMiniScoreCard$1 INSTANCE = new GetFancodeDeeplinkQuery$Data$Companion$invoke$1$fetchMiniScoreCard$1();

    GetFancodeDeeplinkQuery$Data$Companion$invoke$1$fetchMiniScoreCard$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetFancodeDeeplinkQuery.FetchMiniScoreCard invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetFancodeDeeplinkQuery.FetchMiniScoreCard.Companion.invoke(removecancellable);
    }
}
