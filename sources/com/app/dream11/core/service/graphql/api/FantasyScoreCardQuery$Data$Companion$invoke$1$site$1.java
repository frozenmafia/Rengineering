package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FantasyScoreCardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FantasyScoreCardQuery$Data$Companion$invoke$1$site$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FantasyScoreCardQuery.Site> {
    public static final FantasyScoreCardQuery$Data$Companion$invoke$1$site$1 INSTANCE = new FantasyScoreCardQuery$Data$Companion$invoke$1$site$1();

    FantasyScoreCardQuery$Data$Companion$invoke$1$site$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FantasyScoreCardQuery.Site invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FantasyScoreCardQuery.Site.Companion.invoke(removecancellable);
    }
}
