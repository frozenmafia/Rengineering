package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HofUserTeam$Player$Fragments$Companion$invoke$1$hofPlayers$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HofPlayers> {
    public static final HofUserTeam$Player$Fragments$Companion$invoke$1$hofPlayers$1 INSTANCE = new HofUserTeam$Player$Fragments$Companion$invoke$1$hofPlayers$1();

    HofUserTeam$Player$Fragments$Companion$invoke$1$hofPlayers$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final HofPlayers invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return HofPlayers.Companion.invoke(removecancellable);
    }
}
