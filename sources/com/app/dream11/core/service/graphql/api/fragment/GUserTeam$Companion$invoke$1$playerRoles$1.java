package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GUserTeam;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GUserTeam$Companion$invoke$1$playerRoles$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GUserTeam.PlayerRole> {
    public static final GUserTeam$Companion$invoke$1$playerRoles$1 INSTANCE = new GUserTeam$Companion$invoke$1$playerRoles$1();

    GUserTeam$Companion$invoke$1$playerRoles$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.GUserTeam$Companion$invoke$1$playerRoles$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GUserTeam.PlayerRole> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GUserTeam.PlayerRole invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GUserTeam.PlayerRole.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GUserTeam.PlayerRole invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GUserTeam.PlayerRole) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
