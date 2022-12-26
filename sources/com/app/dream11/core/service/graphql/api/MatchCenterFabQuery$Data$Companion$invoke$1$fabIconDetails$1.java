package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MatchCenterFabQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MatchCenterFabQuery$Data$Companion$invoke$1$fabIconDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MatchCenterFabQuery.FabIconDetails> {
    public static final MatchCenterFabQuery$Data$Companion$invoke$1$fabIconDetails$1 INSTANCE = new MatchCenterFabQuery$Data$Companion$invoke$1$fabIconDetails$1();

    MatchCenterFabQuery$Data$Companion$invoke$1$fabIconDetails$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MatchCenterFabQuery.FabIconDetails invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MatchCenterFabQuery.FabIconDetails.Companion.invoke(removecancellable);
    }
}
