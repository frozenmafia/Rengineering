package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.ReactionData;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ReactionData$Companion$invoke$1$userReaction$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ReactionData.UserReaction> {
    public static final ReactionData$Companion$invoke$1$userReaction$1 INSTANCE = new ReactionData$Companion$invoke$1$userReaction$1();

    ReactionData$Companion$invoke$1$userReaction$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ReactionData.UserReaction invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ReactionData.UserReaction.Companion.invoke(removecancellable);
    }
}
