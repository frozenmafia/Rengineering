package com.app.dream11.core.service.graphql.api.Social.reactions;

import com.app.dream11.core.service.graphql.api.Social.reactions.ReactOnPostMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ReactOnPostMutation$Data$Companion$invoke$1$react$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ReactOnPostMutation.React> {
    public static final ReactOnPostMutation$Data$Companion$invoke$1$react$1 INSTANCE = new ReactOnPostMutation$Data$Companion$invoke$1$react$1();

    ReactOnPostMutation$Data$Companion$invoke$1$react$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ReactOnPostMutation.React invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ReactOnPostMutation.React.Companion.invoke(removecancellable);
    }
}
