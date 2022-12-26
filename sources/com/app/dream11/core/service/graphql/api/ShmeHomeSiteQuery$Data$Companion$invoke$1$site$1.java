package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeHomeSiteQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ShmeHomeSiteQuery$Data$Companion$invoke$1$site$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ShmeHomeSiteQuery.Site> {
    public static final ShmeHomeSiteQuery$Data$Companion$invoke$1$site$1 INSTANCE = new ShmeHomeSiteQuery$Data$Companion$invoke$1$site$1();

    ShmeHomeSiteQuery$Data$Companion$invoke$1$site$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ShmeHomeSiteQuery.Site invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ShmeHomeSiteQuery.Site.Companion.invoke(removecancellable);
    }
}
