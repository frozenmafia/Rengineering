package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.PlayerPreviewQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PlayerPreviewQuery$Player$Companion$invoke$1$type$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PlayerPreviewQuery.Type> {
    public static final PlayerPreviewQuery$Player$Companion$invoke$1$type$1 INSTANCE = new PlayerPreviewQuery$Player$Companion$invoke$1$type$1();

    PlayerPreviewQuery$Player$Companion$invoke$1$type$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PlayerPreviewQuery.Type invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PlayerPreviewQuery.Type.Companion.invoke(removecancellable);
    }
}
