package com.app.dream11.core.service.graphql.api.privacyscreen;

import com.app.dream11.core.service.graphql.api.privacyscreen.UnblockMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class UnblockMutation$Data$Companion$invoke$1$unblock$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UnblockMutation.Unblock> {
    public static final UnblockMutation$Data$Companion$invoke$1$unblock$1 INSTANCE = new UnblockMutation$Data$Companion$invoke$1$unblock$1();

    UnblockMutation$Data$Companion$invoke$1$unblock$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UnblockMutation.Unblock invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UnblockMutation.Unblock.Companion.invoke(removecancellable);
    }
}
