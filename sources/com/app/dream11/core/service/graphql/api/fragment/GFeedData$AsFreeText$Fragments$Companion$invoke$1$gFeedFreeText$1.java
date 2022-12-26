package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class GFeedData$AsFreeText$Fragments$Companion$invoke$1$gFeedFreeText$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GFeedFreeText> {
    public static final GFeedData$AsFreeText$Fragments$Companion$invoke$1$gFeedFreeText$1 INSTANCE = new GFeedData$AsFreeText$Fragments$Companion$invoke$1$gFeedFreeText$1();

    GFeedData$AsFreeText$Fragments$Companion$invoke$1$gFeedFreeText$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GFeedFreeText invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GFeedFreeText.Companion.invoke(removecancellable);
    }
}
