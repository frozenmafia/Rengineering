package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ReactionData$TopReaction$Fragments$Companion$invoke$1$userReaction$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserReaction> {
    public static final ReactionData$TopReaction$Fragments$Companion$invoke$1$userReaction$1 INSTANCE = new ReactionData$TopReaction$Fragments$Companion$invoke$1$userReaction$1();

    ReactionData$TopReaction$Fragments$Companion$invoke$1$userReaction$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UserReaction invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UserReaction.Companion.invoke(removecancellable);
    }
}
