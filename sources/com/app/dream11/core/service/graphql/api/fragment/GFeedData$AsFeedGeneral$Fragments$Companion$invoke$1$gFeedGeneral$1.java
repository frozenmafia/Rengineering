package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class GFeedData$AsFeedGeneral$Fragments$Companion$invoke$1$gFeedGeneral$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GFeedGeneral> {
    public static final GFeedData$AsFeedGeneral$Fragments$Companion$invoke$1$gFeedGeneral$1 INSTANCE = new GFeedData$AsFeedGeneral$Fragments$Companion$invoke$1$gFeedGeneral$1();

    GFeedData$AsFeedGeneral$Fragments$Companion$invoke$1$gFeedGeneral$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GFeedGeneral invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GFeedGeneral.Companion.invoke(removecancellable);
    }
}
