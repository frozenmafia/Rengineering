package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MatchHeaderQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MatchHeaderQuery$Data$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MatchHeaderQuery.Match> {
    public static final MatchHeaderQuery$Data$Companion$invoke$1$match$1 INSTANCE = new MatchHeaderQuery$Data$Companion$invoke$1$match$1();

    MatchHeaderQuery$Data$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MatchHeaderQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MatchHeaderQuery.Match.Companion.invoke(removecancellable);
    }
}
