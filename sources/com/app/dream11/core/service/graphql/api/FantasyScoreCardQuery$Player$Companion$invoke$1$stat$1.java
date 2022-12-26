package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FantasyScoreCardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FantasyScoreCardQuery$Player$Companion$invoke$1$stat$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FantasyScoreCardQuery.Stat> {
    public static final FantasyScoreCardQuery$Player$Companion$invoke$1$stat$1 INSTANCE = new FantasyScoreCardQuery$Player$Companion$invoke$1$stat$1();

    FantasyScoreCardQuery$Player$Companion$invoke$1$stat$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FantasyScoreCardQuery.Stat invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FantasyScoreCardQuery.Stat.Companion.invoke(removecancellable);
    }
}
