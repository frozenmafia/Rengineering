package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ShmeCreateTeamQuery$PlayerType$Companion$invoke$1$artwork$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ShmeCreateTeamQuery.Artwork1> {
    public static final ShmeCreateTeamQuery$PlayerType$Companion$invoke$1$artwork$1 INSTANCE = new ShmeCreateTeamQuery$PlayerType$Companion$invoke$1$artwork$1();

    ShmeCreateTeamQuery$PlayerType$Companion$invoke$1$artwork$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery$PlayerType$Companion$invoke$1$artwork$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ShmeCreateTeamQuery.Artwork1> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ShmeCreateTeamQuery.Artwork1 invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ShmeCreateTeamQuery.Artwork1.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ShmeCreateTeamQuery.Artwork1 invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ShmeCreateTeamQuery.Artwork1) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
