package com.app.dream11.core.service.graphql.api.Social.reaction;

import com.app.dream11.core.service.graphql.api.Social.reaction.FetchReactionListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchReactionListQuery$ListByReactions$Companion$invoke$1$list$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchReactionListQuery.List> {
    public static final FetchReactionListQuery$ListByReactions$Companion$invoke$1$list$1 INSTANCE = new FetchReactionListQuery$ListByReactions$Companion$invoke$1$list$1();

    FetchReactionListQuery$ListByReactions$Companion$invoke$1$list$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchReactionListQuery.List invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchReactionListQuery.List.Companion.invoke(removecancellable);
    }
}
