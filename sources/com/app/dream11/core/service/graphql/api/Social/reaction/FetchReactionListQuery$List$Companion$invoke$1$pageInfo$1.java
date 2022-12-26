package com.app.dream11.core.service.graphql.api.Social.reaction;

import com.app.dream11.core.service.graphql.api.Social.reaction.FetchReactionListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchReactionListQuery$List$Companion$invoke$1$pageInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchReactionListQuery.PageInfo> {
    public static final FetchReactionListQuery$List$Companion$invoke$1$pageInfo$1 INSTANCE = new FetchReactionListQuery$List$Companion$invoke$1$pageInfo$1();

    FetchReactionListQuery$List$Companion$invoke$1$pageInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchReactionListQuery.PageInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchReactionListQuery.PageInfo.Companion.invoke(removecancellable);
    }
}
