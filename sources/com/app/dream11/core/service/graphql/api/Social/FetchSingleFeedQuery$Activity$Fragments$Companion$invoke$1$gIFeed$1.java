package com.app.dream11.core.service.graphql.api.Social;

import com.app.dream11.core.service.graphql.api.fragment.GIFeed;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FetchSingleFeedQuery$Activity$Fragments$Companion$invoke$1$gIFeed$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GIFeed> {
    public static final FetchSingleFeedQuery$Activity$Fragments$Companion$invoke$1$gIFeed$1 INSTANCE = new FetchSingleFeedQuery$Activity$Fragments$Companion$invoke$1$gIFeed$1();

    FetchSingleFeedQuery$Activity$Fragments$Companion$invoke$1$gIFeed$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GIFeed invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GIFeed.Companion.invoke(removecancellable);
    }
}
