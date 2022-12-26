package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ShmeCreateTeamQuery$Match$Companion$invoke$1$players$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ShmeCreateTeamQuery.Player> {
    public static final ShmeCreateTeamQuery$Match$Companion$invoke$1$players$1 INSTANCE = new ShmeCreateTeamQuery$Match$Companion$invoke$1$players$1();

    ShmeCreateTeamQuery$Match$Companion$invoke$1$players$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery$Match$Companion$invoke$1$players$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ShmeCreateTeamQuery.Player> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ShmeCreateTeamQuery.Player invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ShmeCreateTeamQuery.Player.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ShmeCreateTeamQuery.Player invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ShmeCreateTeamQuery.Player) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
