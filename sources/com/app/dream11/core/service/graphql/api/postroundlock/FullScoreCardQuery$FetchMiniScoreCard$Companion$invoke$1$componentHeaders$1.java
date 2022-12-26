package com.app.dream11.core.service.graphql.api.postroundlock;

import com.app.dream11.core.service.graphql.api.postroundlock.FullScoreCardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FullScoreCardQuery$FetchMiniScoreCard$Companion$invoke$1$componentHeaders$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FullScoreCardQuery.ComponentHeaders> {
    public static final FullScoreCardQuery$FetchMiniScoreCard$Companion$invoke$1$componentHeaders$1 INSTANCE = new FullScoreCardQuery$FetchMiniScoreCard$Companion$invoke$1$componentHeaders$1();

    FullScoreCardQuery$FetchMiniScoreCard$Companion$invoke$1$componentHeaders$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FullScoreCardQuery.ComponentHeaders invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FullScoreCardQuery.ComponentHeaders.Companion.invoke(removecancellable);
    }
}
