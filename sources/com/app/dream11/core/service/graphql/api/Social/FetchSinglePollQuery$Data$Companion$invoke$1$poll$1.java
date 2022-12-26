package com.app.dream11.core.service.graphql.api.Social;

import com.app.dream11.core.service.graphql.api.Social.FetchSinglePollQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FetchSinglePollQuery$Data$Companion$invoke$1$poll$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchSinglePollQuery.Poll> {
    public static final FetchSinglePollQuery$Data$Companion$invoke$1$poll$1 INSTANCE = new FetchSinglePollQuery$Data$Companion$invoke$1$poll$1();

    FetchSinglePollQuery$Data$Companion$invoke$1$poll$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchSinglePollQuery.Poll invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchSinglePollQuery.Poll.Companion.invoke(removecancellable);
    }
}
