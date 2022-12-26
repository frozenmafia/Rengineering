package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class GFeedData$AsFeedPoll$Fragments$Companion$invoke$1$gFeedPoll$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GFeedPoll> {
    public static final GFeedData$AsFeedPoll$Fragments$Companion$invoke$1$gFeedPoll$1 INSTANCE = new GFeedData$AsFeedPoll$Fragments$Companion$invoke$1$gFeedPoll$1();

    GFeedData$AsFeedPoll$Fragments$Companion$invoke$1$gFeedPoll$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GFeedPoll invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GFeedPoll.Companion.invoke(removecancellable);
    }
}
