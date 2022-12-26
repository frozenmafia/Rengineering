package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FantasyScoreCardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FantasyScoreCardQuery$Site$Companion$invoke$1$tour$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FantasyScoreCardQuery.Tour> {
    public static final FantasyScoreCardQuery$Site$Companion$invoke$1$tour$1 INSTANCE = new FantasyScoreCardQuery$Site$Companion$invoke$1$tour$1();

    FantasyScoreCardQuery$Site$Companion$invoke$1$tour$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FantasyScoreCardQuery.Tour invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FantasyScoreCardQuery.Tour.Companion.invoke(removecancellable);
    }
}
