package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MeBannedQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MeBannedQuery$Data$Companion$invoke$1$me$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MeBannedQuery.Me> {
    public static final MeBannedQuery$Data$Companion$invoke$1$me$1 INSTANCE = new MeBannedQuery$Data$Companion$invoke$1$me$1();

    MeBannedQuery$Data$Companion$invoke$1$me$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MeBannedQuery.Me invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MeBannedQuery.Me.Companion.invoke(removecancellable);
    }
}
