package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.RematchContestHomeQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class RematchContestHomeQuery$AsContest$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, RematchContestHomeQuery.Match> {
    public static final RematchContestHomeQuery$AsContest$Companion$invoke$1$match$1 INSTANCE = new RematchContestHomeQuery$AsContest$Companion$invoke$1$match$1();

    RematchContestHomeQuery$AsContest$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final RematchContestHomeQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return RematchContestHomeQuery.Match.Companion.invoke(removecancellable);
    }
}
