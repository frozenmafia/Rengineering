package com.app.dream11.core.service.graphql.api.contest;

import com.app.dream11.core.service.graphql.api.contest.GetUnfilledContestsInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetUnfilledContestsInfoQuery$Match$Companion$invoke$1$unfilledContestsInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetUnfilledContestsInfoQuery.UnfilledContestsInfo> {
    public static final GetUnfilledContestsInfoQuery$Match$Companion$invoke$1$unfilledContestsInfo$1 INSTANCE = new GetUnfilledContestsInfoQuery$Match$Companion$invoke$1$unfilledContestsInfo$1();

    GetUnfilledContestsInfoQuery$Match$Companion$invoke$1$unfilledContestsInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetUnfilledContestsInfoQuery.UnfilledContestsInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetUnfilledContestsInfoQuery.UnfilledContestsInfo.Companion.invoke(removecancellable);
    }
}
