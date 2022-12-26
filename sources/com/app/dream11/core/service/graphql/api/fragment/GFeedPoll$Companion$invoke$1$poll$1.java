package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GFeedPoll;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GFeedPoll$Companion$invoke$1$poll$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GFeedPoll.Poll> {
    public static final GFeedPoll$Companion$invoke$1$poll$1 INSTANCE = new GFeedPoll$Companion$invoke$1$poll$1();

    GFeedPoll$Companion$invoke$1$poll$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GFeedPoll.Poll invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GFeedPoll.Poll.Companion.invoke(removecancellable);
    }
}
