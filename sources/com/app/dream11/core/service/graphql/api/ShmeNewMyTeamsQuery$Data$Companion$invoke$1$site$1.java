package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeNewMyTeamsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ShmeNewMyTeamsQuery$Data$Companion$invoke$1$site$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ShmeNewMyTeamsQuery.Site> {
    public static final ShmeNewMyTeamsQuery$Data$Companion$invoke$1$site$1 INSTANCE = new ShmeNewMyTeamsQuery$Data$Companion$invoke$1$site$1();

    ShmeNewMyTeamsQuery$Data$Companion$invoke$1$site$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ShmeNewMyTeamsQuery.Site invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ShmeNewMyTeamsQuery.Site.Companion.invoke(removecancellable);
    }
}
