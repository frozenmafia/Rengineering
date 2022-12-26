package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestsPostLockQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestsPostLockQuery$Data$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestsPostLockQuery.Match> {
    public static final ContestsPostLockQuery$Data$Companion$invoke$1$match$1 INSTANCE = new ContestsPostLockQuery$Data$Companion$invoke$1$match$1();

    ContestsPostLockQuery$Data$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestsPostLockQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestsPostLockQuery.Match.Companion.invoke(removecancellable);
    }
}
