package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GIFeed$TopComment$Fragments$Companion$invoke$1$gFeedComment$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GFeedComment> {
    public static final GIFeed$TopComment$Fragments$Companion$invoke$1$gFeedComment$1 INSTANCE = new GIFeed$TopComment$Fragments$Companion$invoke$1$gFeedComment$1();

    GIFeed$TopComment$Fragments$Companion$invoke$1$gFeedComment$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GFeedComment invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GFeedComment.Companion.invoke(removecancellable);
    }
}
