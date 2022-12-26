package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyTeamsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MyTeamsQuery$UserTeam$Companion$invoke$1$players$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, MyTeamsQuery.Player> {
    public static final MyTeamsQuery$UserTeam$Companion$invoke$1$players$1 INSTANCE = new MyTeamsQuery$UserTeam$Companion$invoke$1$players$1();

    MyTeamsQuery$UserTeam$Companion$invoke$1$players$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.MyTeamsQuery$UserTeam$Companion$invoke$1$players$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MyTeamsQuery.Player> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final MyTeamsQuery.Player invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return MyTeamsQuery.Player.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final MyTeamsQuery.Player invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (MyTeamsQuery.Player) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
