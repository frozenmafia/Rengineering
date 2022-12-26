package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ShmeCreateTeamQuery$Player$Companion$invoke$1$playingStyleIcon$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ShmeCreateTeamQuery.PlayingStyleIcon> {
    public static final ShmeCreateTeamQuery$Player$Companion$invoke$1$playingStyleIcon$1 INSTANCE = new ShmeCreateTeamQuery$Player$Companion$invoke$1$playingStyleIcon$1();

    ShmeCreateTeamQuery$Player$Companion$invoke$1$playingStyleIcon$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery$Player$Companion$invoke$1$playingStyleIcon$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ShmeCreateTeamQuery.PlayingStyleIcon> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ShmeCreateTeamQuery.PlayingStyleIcon invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ShmeCreateTeamQuery.PlayingStyleIcon.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ShmeCreateTeamQuery.PlayingStyleIcon invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ShmeCreateTeamQuery.PlayingStyleIcon) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
