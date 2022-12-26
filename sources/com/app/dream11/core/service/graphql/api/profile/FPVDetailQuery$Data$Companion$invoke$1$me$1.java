package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.FPVDetailQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FPVDetailQuery$Data$Companion$invoke$1$me$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FPVDetailQuery.Me> {
    public static final FPVDetailQuery$Data$Companion$invoke$1$me$1 INSTANCE = new FPVDetailQuery$Data$Companion$invoke$1$me$1();

    FPVDetailQuery$Data$Companion$invoke$1$me$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FPVDetailQuery.Me invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FPVDetailQuery.Me.Companion.invoke(removecancellable);
    }
}
