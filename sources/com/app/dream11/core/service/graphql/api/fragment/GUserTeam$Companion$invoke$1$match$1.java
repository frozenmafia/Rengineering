package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GUserTeam;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GUserTeam$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GUserTeam.Match> {
    public static final GUserTeam$Companion$invoke$1$match$1 INSTANCE = new GUserTeam$Companion$invoke$1$match$1();

    GUserTeam$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GUserTeam.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GUserTeam.Match.Companion.invoke(removecancellable);
    }
}
