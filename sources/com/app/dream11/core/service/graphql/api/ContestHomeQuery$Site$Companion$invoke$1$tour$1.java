package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestHomeQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestHomeQuery$Site$Companion$invoke$1$tour$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestHomeQuery.Tour> {
    public static final ContestHomeQuery$Site$Companion$invoke$1$tour$1 INSTANCE = new ContestHomeQuery$Site$Companion$invoke$1$tour$1();

    ContestHomeQuery$Site$Companion$invoke$1$tour$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestHomeQuery.Tour invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestHomeQuery.Tour.Companion.invoke(removecancellable);
    }
}
