package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.RoundMessageQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class RoundMessageQuery$Data$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, RoundMessageQuery.Match> {
    public static final RoundMessageQuery$Data$Companion$invoke$1$match$1 INSTANCE = new RoundMessageQuery$Data$Companion$invoke$1$match$1();

    RoundMessageQuery$Data$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final RoundMessageQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return RoundMessageQuery.Match.Companion.invoke(removecancellable);
    }
}
