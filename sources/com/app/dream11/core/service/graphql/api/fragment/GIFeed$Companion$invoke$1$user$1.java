package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GIFeed;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GIFeed$Companion$invoke$1$user$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GIFeed.User> {
    public static final GIFeed$Companion$invoke$1$user$1 INSTANCE = new GIFeed$Companion$invoke$1$user$1();

    GIFeed$Companion$invoke$1$user$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GIFeed.User invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GIFeed.User.Companion.invoke(removecancellable);
    }
}
