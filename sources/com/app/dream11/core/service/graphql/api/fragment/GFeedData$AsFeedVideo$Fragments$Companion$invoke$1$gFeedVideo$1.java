package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class GFeedData$AsFeedVideo$Fragments$Companion$invoke$1$gFeedVideo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GFeedVideo> {
    public static final GFeedData$AsFeedVideo$Fragments$Companion$invoke$1$gFeedVideo$1 INSTANCE = new GFeedData$AsFeedVideo$Fragments$Companion$invoke$1$gFeedVideo$1();

    GFeedData$AsFeedVideo$Fragments$Companion$invoke$1$gFeedVideo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GFeedVideo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GFeedVideo.Companion.invoke(removecancellable);
    }
}
