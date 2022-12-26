package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.PlayerInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PlayerInfoQuery$Player$Companion$invoke$1$squad$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PlayerInfoQuery.Squad> {
    public static final PlayerInfoQuery$Player$Companion$invoke$1$squad$1 INSTANCE = new PlayerInfoQuery$Player$Companion$invoke$1$squad$1();

    PlayerInfoQuery$Player$Companion$invoke$1$squad$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PlayerInfoQuery.Squad invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PlayerInfoQuery.Squad.Companion.invoke(removecancellable);
    }
}
