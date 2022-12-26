package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchTourInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchTourInfoQuery$Match$Companion$invoke$1$tour$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchTourInfoQuery.Tour> {
    public static final FetchTourInfoQuery$Match$Companion$invoke$1$tour$1 INSTANCE = new FetchTourInfoQuery$Match$Companion$invoke$1$tour$1();

    FetchTourInfoQuery$Match$Companion$invoke$1$tour$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchTourInfoQuery.Tour invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchTourInfoQuery.Tour.Companion.invoke(removecancellable);
    }
}
