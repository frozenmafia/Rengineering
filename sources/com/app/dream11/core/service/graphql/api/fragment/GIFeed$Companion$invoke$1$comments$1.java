package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GIFeed;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GIFeed$Companion$invoke$1$comments$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GIFeed.Comments> {
    public static final GIFeed$Companion$invoke$1$comments$1 INSTANCE = new GIFeed$Companion$invoke$1$comments$1();

    GIFeed$Companion$invoke$1$comments$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GIFeed.Comments invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GIFeed.Comments.Companion.invoke(removecancellable);
    }
}
