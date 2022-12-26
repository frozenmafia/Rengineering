package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FantasyScoreCardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FantasyScoreCardQuery$Tour$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FantasyScoreCardQuery.Match> {
    public static final FantasyScoreCardQuery$Tour$Companion$invoke$1$match$1 INSTANCE = new FantasyScoreCardQuery$Tour$Companion$invoke$1$match$1();

    FantasyScoreCardQuery$Tour$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FantasyScoreCardQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FantasyScoreCardQuery.Match.Companion.invoke(removecancellable);
    }
}
