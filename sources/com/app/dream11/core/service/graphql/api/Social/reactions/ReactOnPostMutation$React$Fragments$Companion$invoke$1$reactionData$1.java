package com.app.dream11.core.service.graphql.api.Social.reactions;

import com.app.dream11.core.service.graphql.api.fragment.ReactionData;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ReactOnPostMutation$React$Fragments$Companion$invoke$1$reactionData$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ReactionData> {
    public static final ReactOnPostMutation$React$Fragments$Companion$invoke$1$reactionData$1 INSTANCE = new ReactOnPostMutation$React$Fragments$Companion$invoke$1$reactionData$1();

    ReactOnPostMutation$React$Fragments$Companion$invoke$1$reactionData$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ReactionData invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ReactionData.Companion.invoke(removecancellable);
    }
}
