package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GFeed$AsIFeed$Fragments$Companion$invoke$1$gIFeed$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GIFeed> {
    public static final GFeed$AsIFeed$Fragments$Companion$invoke$1$gIFeed$1 INSTANCE = new GFeed$AsIFeed$Fragments$Companion$invoke$1$gIFeed$1();

    GFeed$AsIFeed$Fragments$Companion$invoke$1$gIFeed$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GIFeed invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GIFeed.Companion.invoke(removecancellable);
    }
}
