package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GFeedComment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GFeedComment$Companion$invoke$1$user$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GFeedComment.User> {
    public static final GFeedComment$Companion$invoke$1$user$1 INSTANCE = new GFeedComment$Companion$invoke$1$user$1();

    GFeedComment$Companion$invoke$1$user$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GFeedComment.User invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GFeedComment.User.Companion.invoke(removecancellable);
    }
}
