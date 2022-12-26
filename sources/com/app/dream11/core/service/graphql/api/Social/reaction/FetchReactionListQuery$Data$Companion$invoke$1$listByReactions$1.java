package com.app.dream11.core.service.graphql.api.Social.reaction;

import com.app.dream11.core.service.graphql.api.Social.reaction.FetchReactionListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchReactionListQuery$Data$Companion$invoke$1$listByReactions$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchReactionListQuery.ListByReactions> {
    public static final FetchReactionListQuery$Data$Companion$invoke$1$listByReactions$1 INSTANCE = new FetchReactionListQuery$Data$Companion$invoke$1$listByReactions$1();

    FetchReactionListQuery$Data$Companion$invoke$1$listByReactions$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchReactionListQuery.ListByReactions invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchReactionListQuery.ListByReactions.Companion.invoke(removecancellable);
    }
}
