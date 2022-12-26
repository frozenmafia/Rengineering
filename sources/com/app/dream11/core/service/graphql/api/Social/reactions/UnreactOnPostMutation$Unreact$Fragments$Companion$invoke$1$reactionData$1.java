package com.app.dream11.core.service.graphql.api.Social.reactions;

import com.app.dream11.core.service.graphql.api.fragment.ReactionData;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class UnreactOnPostMutation$Unreact$Fragments$Companion$invoke$1$reactionData$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ReactionData> {
    public static final UnreactOnPostMutation$Unreact$Fragments$Companion$invoke$1$reactionData$1 INSTANCE = new UnreactOnPostMutation$Unreact$Fragments$Companion$invoke$1$reactionData$1();

    UnreactOnPostMutation$Unreact$Fragments$Companion$invoke$1$reactionData$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ReactionData invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ReactionData.Companion.invoke(removecancellable);
    }
}
