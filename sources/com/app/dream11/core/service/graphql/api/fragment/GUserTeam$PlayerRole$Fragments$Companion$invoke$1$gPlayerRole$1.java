package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GUserTeam$PlayerRole$Fragments$Companion$invoke$1$gPlayerRole$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GPlayerRole> {
    public static final GUserTeam$PlayerRole$Fragments$Companion$invoke$1$gPlayerRole$1 INSTANCE = new GUserTeam$PlayerRole$Fragments$Companion$invoke$1$gPlayerRole$1();

    GUserTeam$PlayerRole$Fragments$Companion$invoke$1$gPlayerRole$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GPlayerRole invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GPlayerRole.Companion.invoke(removecancellable);
    }
}
