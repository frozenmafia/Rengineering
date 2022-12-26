package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetMatchDetailsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetMatchDetailsQuery$Site$Companion$invoke$1$tour$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetMatchDetailsQuery.Tour> {
    public static final GetMatchDetailsQuery$Site$Companion$invoke$1$tour$1 INSTANCE = new GetMatchDetailsQuery$Site$Companion$invoke$1$tour$1();

    GetMatchDetailsQuery$Site$Companion$invoke$1$tour$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetMatchDetailsQuery.Tour invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetMatchDetailsQuery.Tour.Companion.invoke(removecancellable);
    }
}
