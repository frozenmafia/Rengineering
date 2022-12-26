package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes2.dex */
final class GPlayer$Fragments$Companion$invoke$1$playerLineupStatus$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PlayerLineupStatus> {
    public static final GPlayer$Fragments$Companion$invoke$1$playerLineupStatus$1 INSTANCE = new GPlayer$Fragments$Companion$invoke$1$playerLineupStatus$1();

    GPlayer$Fragments$Companion$invoke$1$playerLineupStatus$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PlayerLineupStatus invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PlayerLineupStatus.Companion.invoke(removecancellable);
    }
}
