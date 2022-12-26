package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class GFeedData$AsFeedUserTeam$Fragments$Companion$invoke$1$gFeedUserTeam$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GFeedUserTeam> {
    public static final GFeedData$AsFeedUserTeam$Fragments$Companion$invoke$1$gFeedUserTeam$1 INSTANCE = new GFeedData$AsFeedUserTeam$Fragments$Companion$invoke$1$gFeedUserTeam$1();

    GFeedData$AsFeedUserTeam$Fragments$Companion$invoke$1$gFeedUserTeam$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GFeedUserTeam invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GFeedUserTeam.Companion.invoke(removecancellable);
    }
}
