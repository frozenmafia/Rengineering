package com.app.dream11.core.service.graphql.api.Social;

import com.app.dream11.core.service.graphql.api.Social.UnFollowMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class UnFollowMutation$Data$Companion$invoke$1$unFollow$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UnFollowMutation.UnFollow> {
    public static final UnFollowMutation$Data$Companion$invoke$1$unFollow$1 INSTANCE = new UnFollowMutation$Data$Companion$invoke$1$unFollow$1();

    UnFollowMutation$Data$Companion$invoke$1$unFollow$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UnFollowMutation.UnFollow invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UnFollowMutation.UnFollow.Companion.invoke(removecancellable);
    }
}
