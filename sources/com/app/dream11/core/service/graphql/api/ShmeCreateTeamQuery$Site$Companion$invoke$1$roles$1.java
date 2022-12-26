package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ShmeCreateTeamQuery$Site$Companion$invoke$1$roles$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ShmeCreateTeamQuery.Role> {
    public static final ShmeCreateTeamQuery$Site$Companion$invoke$1$roles$1 INSTANCE = new ShmeCreateTeamQuery$Site$Companion$invoke$1$roles$1();

    ShmeCreateTeamQuery$Site$Companion$invoke$1$roles$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery$Site$Companion$invoke$1$roles$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ShmeCreateTeamQuery.Role> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ShmeCreateTeamQuery.Role invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ShmeCreateTeamQuery.Role.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ShmeCreateTeamQuery.Role invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ShmeCreateTeamQuery.Role) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
