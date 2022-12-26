package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GIFeed$Fragments$Companion$invoke$1$gFeedData$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GFeedData> {
    public static final GIFeed$Fragments$Companion$invoke$1$gFeedData$1 INSTANCE = new GIFeed$Fragments$Companion$invoke$1$gFeedData$1();

    GIFeed$Fragments$Companion$invoke$1$gFeedData$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GFeedData invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GFeedData.Companion.invoke(removecancellable);
    }
}
