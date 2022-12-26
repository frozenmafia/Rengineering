package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.HofUserTeam;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HofUserTeam$Companion$invoke$1$playerType$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, HofUserTeam.PlayerType> {
    public static final HofUserTeam$Companion$invoke$1$playerType$1 INSTANCE = new HofUserTeam$Companion$invoke$1$playerType$1();

    HofUserTeam$Companion$invoke$1$playerType$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.HofUserTeam$Companion$invoke$1$playerType$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HofUserTeam.PlayerType> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final HofUserTeam.PlayerType invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return HofUserTeam.PlayerType.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final HofUserTeam.PlayerType invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (HofUserTeam.PlayerType) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
