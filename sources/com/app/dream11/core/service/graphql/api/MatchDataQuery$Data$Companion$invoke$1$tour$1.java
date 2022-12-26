package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MatchDataQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MatchDataQuery$Data$Companion$invoke$1$tour$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MatchDataQuery.Tour> {
    public static final MatchDataQuery$Data$Companion$invoke$1$tour$1 INSTANCE = new MatchDataQuery$Data$Companion$invoke$1$tour$1();

    MatchDataQuery$Data$Companion$invoke$1$tour$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MatchDataQuery.Tour invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MatchDataQuery.Tour.Companion.invoke(removecancellable);
    }
}
