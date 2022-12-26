package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.PlayerPreviewQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PlayerPreviewQuery$Data$Companion$invoke$1$player$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PlayerPreviewQuery.Player> {
    public static final PlayerPreviewQuery$Data$Companion$invoke$1$player$1 INSTANCE = new PlayerPreviewQuery$Data$Companion$invoke$1$player$1();

    PlayerPreviewQuery$Data$Companion$invoke$1$player$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PlayerPreviewQuery.Player invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PlayerPreviewQuery.Player.Companion.invoke(removecancellable);
    }
}
