package com.app.dream11.core.service.graphql.api.Social.comments;

import com.app.dream11.core.service.graphql.api.fragment.GFeedComment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class AddCommentMutation$AddCommentFreeText$Fragments$Companion$invoke$1$gFeedComment$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GFeedComment> {
    public static final AddCommentMutation$AddCommentFreeText$Fragments$Companion$invoke$1$gFeedComment$1 INSTANCE = new AddCommentMutation$AddCommentFreeText$Fragments$Companion$invoke$1$gFeedComment$1();

    AddCommentMutation$AddCommentFreeText$Fragments$Companion$invoke$1$gFeedComment$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GFeedComment invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GFeedComment.Companion.invoke(removecancellable);
    }
}
