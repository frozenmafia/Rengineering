package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.PlayerInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PlayerInfoQuery$Player$Companion$invoke$1$playingStyleIcon$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, PlayerInfoQuery.PlayingStyleIcon> {
    public static final PlayerInfoQuery$Player$Companion$invoke$1$playingStyleIcon$1 INSTANCE = new PlayerInfoQuery$Player$Companion$invoke$1$playingStyleIcon$1();

    PlayerInfoQuery$Player$Companion$invoke$1$playingStyleIcon$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.PlayerInfoQuery$Player$Companion$invoke$1$playingStyleIcon$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PlayerInfoQuery.PlayingStyleIcon> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final PlayerInfoQuery.PlayingStyleIcon invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return PlayerInfoQuery.PlayingStyleIcon.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final PlayerInfoQuery.PlayingStyleIcon invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (PlayerInfoQuery.PlayingStyleIcon) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
