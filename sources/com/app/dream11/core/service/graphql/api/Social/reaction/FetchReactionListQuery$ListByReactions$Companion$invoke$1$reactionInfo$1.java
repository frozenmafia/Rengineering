package com.app.dream11.core.service.graphql.api.Social.reaction;

import com.app.dream11.core.service.graphql.api.Social.reaction.FetchReactionListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchReactionListQuery$ListByReactions$Companion$invoke$1$reactionInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchReactionListQuery.ReactionInfo> {
    public static final FetchReactionListQuery$ListByReactions$Companion$invoke$1$reactionInfo$1 INSTANCE = new FetchReactionListQuery$ListByReactions$Companion$invoke$1$reactionInfo$1();

    FetchReactionListQuery$ListByReactions$Companion$invoke$1$reactionInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchReactionListQuery.ReactionInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchReactionListQuery.ReactionInfo.Companion.invoke(removecancellable);
    }
}
