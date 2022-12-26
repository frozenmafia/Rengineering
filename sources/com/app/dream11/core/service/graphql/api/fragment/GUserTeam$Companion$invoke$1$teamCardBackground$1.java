package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GUserTeam;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GUserTeam$Companion$invoke$1$teamCardBackground$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GUserTeam.TeamCardBackground> {
    public static final GUserTeam$Companion$invoke$1$teamCardBackground$1 INSTANCE = new GUserTeam$Companion$invoke$1$teamCardBackground$1();

    GUserTeam$Companion$invoke$1$teamCardBackground$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.GUserTeam$Companion$invoke$1$teamCardBackground$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GUserTeam.TeamCardBackground> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GUserTeam.TeamCardBackground invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GUserTeam.TeamCardBackground.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GUserTeam.TeamCardBackground invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GUserTeam.TeamCardBackground) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
