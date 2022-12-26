package com.app.dream11.core.service.graphql.api.Social;

import com.app.dream11.core.service.graphql.api.Social.PostContestToFeedMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PostContestToFeedMutation$Data$Companion$invoke$1$shareContestToFeed$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PostContestToFeedMutation.ShareContestToFeed> {
    public static final PostContestToFeedMutation$Data$Companion$invoke$1$shareContestToFeed$1 INSTANCE = new PostContestToFeedMutation$Data$Companion$invoke$1$shareContestToFeed$1();

    PostContestToFeedMutation$Data$Companion$invoke$1$shareContestToFeed$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PostContestToFeedMutation.ShareContestToFeed invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PostContestToFeedMutation.ShareContestToFeed.Companion.invoke(removecancellable);
    }
}
