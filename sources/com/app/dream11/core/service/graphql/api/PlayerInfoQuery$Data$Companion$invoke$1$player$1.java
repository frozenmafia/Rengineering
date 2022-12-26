package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.PlayerInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PlayerInfoQuery$Data$Companion$invoke$1$player$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PlayerInfoQuery.Player> {
    public static final PlayerInfoQuery$Data$Companion$invoke$1$player$1 INSTANCE = new PlayerInfoQuery$Data$Companion$invoke$1$player$1();

    PlayerInfoQuery$Data$Companion$invoke$1$player$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PlayerInfoQuery.Player invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PlayerInfoQuery.Player.Companion.invoke(removecancellable);
    }
}
