package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GFeed;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GFeed$Edge$Companion$invoke$1$asIFeed$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GFeed.AsIFeed> {
    public static final GFeed$Edge$Companion$invoke$1$asIFeed$1 INSTANCE = new GFeed$Edge$Companion$invoke$1$asIFeed$1();

    GFeed$Edge$Companion$invoke$1$asIFeed$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GFeed.AsIFeed invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GFeed.AsIFeed.Companion.invoke(removecancellable);
    }
}
