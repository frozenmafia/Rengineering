package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.MatchData;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes2.dex */
final class MyContestsQuery$Edge$Fragments$Companion$invoke$1$matchData$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MatchData> {
    public static final MyContestsQuery$Edge$Fragments$Companion$invoke$1$matchData$1 INSTANCE = new MyContestsQuery$Edge$Fragments$Companion$invoke$1$matchData$1();

    MyContestsQuery$Edge$Fragments$Companion$invoke$1$matchData$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MatchData invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MatchData.Companion.invoke(removecancellable);
    }
}
