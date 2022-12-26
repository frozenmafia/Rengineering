package com.app.dream11.core.service.graphql.api.Social;

import com.app.dream11.core.service.graphql.api.Social.FetchSingleFeedQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FetchSingleFeedQuery$Data$Companion$invoke$1$activity$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchSingleFeedQuery.Activity> {
    public static final FetchSingleFeedQuery$Data$Companion$invoke$1$activity$1 INSTANCE = new FetchSingleFeedQuery$Data$Companion$invoke$1$activity$1();

    FetchSingleFeedQuery$Data$Companion$invoke$1$activity$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchSingleFeedQuery.Activity invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchSingleFeedQuery.Activity.Companion.invoke(removecancellable);
    }
}
