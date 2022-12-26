package com.app.dream11.core.service.graphql.api.Social.reactions;

import com.app.dream11.core.service.graphql.api.Social.reactions.UnreactOnPostMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class UnreactOnPostMutation$Data$Companion$invoke$1$unreact$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UnreactOnPostMutation.Unreact> {
    public static final UnreactOnPostMutation$Data$Companion$invoke$1$unreact$1 INSTANCE = new UnreactOnPostMutation$Data$Companion$invoke$1$unreact$1();

    UnreactOnPostMutation$Data$Companion$invoke$1$unreact$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UnreactOnPostMutation.Unreact invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UnreactOnPostMutation.Unreact.Companion.invoke(removecancellable);
    }
}
