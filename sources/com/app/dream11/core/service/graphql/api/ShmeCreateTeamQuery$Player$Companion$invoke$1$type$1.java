package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ShmeCreateTeamQuery$Player$Companion$invoke$1$type$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ShmeCreateTeamQuery.Type> {
    public static final ShmeCreateTeamQuery$Player$Companion$invoke$1$type$1 INSTANCE = new ShmeCreateTeamQuery$Player$Companion$invoke$1$type$1();

    ShmeCreateTeamQuery$Player$Companion$invoke$1$type$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ShmeCreateTeamQuery.Type invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ShmeCreateTeamQuery.Type.Companion.invoke(removecancellable);
    }
}
