package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeHomeSiteQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ShmeHomeSiteQuery$Site$Companion$invoke$1$matches$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ShmeHomeSiteQuery.Matches> {
    public static final ShmeHomeSiteQuery$Site$Companion$invoke$1$matches$1 INSTANCE = new ShmeHomeSiteQuery$Site$Companion$invoke$1$matches$1();

    ShmeHomeSiteQuery$Site$Companion$invoke$1$matches$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ShmeHomeSiteQuery.Matches invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ShmeHomeSiteQuery.Matches.Companion.invoke(removecancellable);
    }
}
