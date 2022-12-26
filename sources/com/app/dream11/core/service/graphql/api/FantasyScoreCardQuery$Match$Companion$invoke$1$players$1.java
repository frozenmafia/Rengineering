package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FantasyScoreCardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FantasyScoreCardQuery$Match$Companion$invoke$1$players$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, FantasyScoreCardQuery.Player> {
    public static final FantasyScoreCardQuery$Match$Companion$invoke$1$players$1 INSTANCE = new FantasyScoreCardQuery$Match$Companion$invoke$1$players$1();

    FantasyScoreCardQuery$Match$Companion$invoke$1$players$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.FantasyScoreCardQuery$Match$Companion$invoke$1$players$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FantasyScoreCardQuery.Player> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final FantasyScoreCardQuery.Player invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return FantasyScoreCardQuery.Player.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final FantasyScoreCardQuery.Player invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (FantasyScoreCardQuery.Player) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
