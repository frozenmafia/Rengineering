package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestInfoQuery$ContestInfo$Companion$invoke$1$tour$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestInfoQuery.Tour> {
    public static final ContestInfoQuery$ContestInfo$Companion$invoke$1$tour$1 INSTANCE = new ContestInfoQuery$ContestInfo$Companion$invoke$1$tour$1();

    ContestInfoQuery$ContestInfo$Companion$invoke$1$tour$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestInfoQuery.Tour invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestInfoQuery.Tour.Companion.invoke(removecancellable);
    }
}
