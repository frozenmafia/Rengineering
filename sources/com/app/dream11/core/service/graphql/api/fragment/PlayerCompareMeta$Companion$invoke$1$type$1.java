package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.PlayerCompareMeta;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PlayerCompareMeta$Companion$invoke$1$type$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PlayerCompareMeta.Type> {
    public static final PlayerCompareMeta$Companion$invoke$1$type$1 INSTANCE = new PlayerCompareMeta$Companion$invoke$1$type$1();

    PlayerCompareMeta$Companion$invoke$1$type$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PlayerCompareMeta.Type invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PlayerCompareMeta.Type.Companion.invoke(removecancellable);
    }
}
