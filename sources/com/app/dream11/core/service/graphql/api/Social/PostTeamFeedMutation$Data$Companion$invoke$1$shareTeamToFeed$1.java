package com.app.dream11.core.service.graphql.api.Social;

import com.app.dream11.core.service.graphql.api.Social.PostTeamFeedMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PostTeamFeedMutation$Data$Companion$invoke$1$shareTeamToFeed$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PostTeamFeedMutation.ShareTeamToFeed> {
    public static final PostTeamFeedMutation$Data$Companion$invoke$1$shareTeamToFeed$1 INSTANCE = new PostTeamFeedMutation$Data$Companion$invoke$1$shareTeamToFeed$1();

    PostTeamFeedMutation$Data$Companion$invoke$1$shareTeamToFeed$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PostTeamFeedMutation.ShareTeamToFeed invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PostTeamFeedMutation.ShareTeamToFeed.Companion.invoke(removecancellable);
    }
}
