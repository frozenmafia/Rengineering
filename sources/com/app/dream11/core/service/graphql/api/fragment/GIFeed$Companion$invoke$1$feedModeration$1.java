package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GIFeed;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GIFeed$Companion$invoke$1$feedModeration$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GIFeed.FeedModeration> {
    public static final GIFeed$Companion$invoke$1$feedModeration$1 INSTANCE = new GIFeed$Companion$invoke$1$feedModeration$1();

    GIFeed$Companion$invoke$1$feedModeration$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GIFeed.FeedModeration invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GIFeed.FeedModeration.Companion.invoke(removecancellable);
    }
}
