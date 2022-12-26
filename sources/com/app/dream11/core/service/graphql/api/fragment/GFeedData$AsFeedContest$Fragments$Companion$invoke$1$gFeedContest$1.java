package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class GFeedData$AsFeedContest$Fragments$Companion$invoke$1$gFeedContest$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GFeedContest> {
    public static final GFeedData$AsFeedContest$Fragments$Companion$invoke$1$gFeedContest$1 INSTANCE = new GFeedData$AsFeedContest$Fragments$Companion$invoke$1$gFeedContest$1();

    GFeedData$AsFeedContest$Fragments$Companion$invoke$1$gFeedContest$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GFeedContest invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GFeedContest.Companion.invoke(removecancellable);
    }
}
