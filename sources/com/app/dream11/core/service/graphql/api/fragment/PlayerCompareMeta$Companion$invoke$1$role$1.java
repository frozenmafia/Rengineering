package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.PlayerCompareMeta;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PlayerCompareMeta$Companion$invoke$1$role$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PlayerCompareMeta.Role> {
    public static final PlayerCompareMeta$Companion$invoke$1$role$1 INSTANCE = new PlayerCompareMeta$Companion$invoke$1$role$1();

    PlayerCompareMeta$Companion$invoke$1$role$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PlayerCompareMeta.Role invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PlayerCompareMeta.Role.Companion.invoke(removecancellable);
    }
}
