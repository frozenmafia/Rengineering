package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MeBannedQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MeBannedQuery$Me$Companion$invoke$1$state$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MeBannedQuery.State> {
    public static final MeBannedQuery$Me$Companion$invoke$1$state$1 INSTANCE = new MeBannedQuery$Me$Companion$invoke$1$state$1();

    MeBannedQuery$Me$Companion$invoke$1$state$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MeBannedQuery.State invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MeBannedQuery.State.Companion.invoke(removecancellable);
    }
}
