package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetWeeksOfTourQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetWeeksOfTourQuery$Data$Companion$invoke$1$tour$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetWeeksOfTourQuery.Tour> {
    public static final GetWeeksOfTourQuery$Data$Companion$invoke$1$tour$1 INSTANCE = new GetWeeksOfTourQuery$Data$Companion$invoke$1$tour$1();

    GetWeeksOfTourQuery$Data$Companion$invoke$1$tour$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetWeeksOfTourQuery.Tour invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetWeeksOfTourQuery.Tour.Companion.invoke(removecancellable);
    }
}
