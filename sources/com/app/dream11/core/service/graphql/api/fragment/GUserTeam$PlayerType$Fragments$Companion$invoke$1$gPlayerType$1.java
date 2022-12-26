package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GUserTeam$PlayerType$Fragments$Companion$invoke$1$gPlayerType$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GPlayerType> {
    public static final GUserTeam$PlayerType$Fragments$Companion$invoke$1$gPlayerType$1 INSTANCE = new GUserTeam$PlayerType$Fragments$Companion$invoke$1$gPlayerType$1();

    GUserTeam$PlayerType$Fragments$Companion$invoke$1$gPlayerType$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GPlayerType invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GPlayerType.Companion.invoke(removecancellable);
    }
}
