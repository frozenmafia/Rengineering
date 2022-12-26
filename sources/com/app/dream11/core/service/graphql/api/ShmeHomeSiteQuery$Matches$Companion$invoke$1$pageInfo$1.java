package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeHomeSiteQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ShmeHomeSiteQuery$Matches$Companion$invoke$1$pageInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ShmeHomeSiteQuery.PageInfo> {
    public static final ShmeHomeSiteQuery$Matches$Companion$invoke$1$pageInfo$1 INSTANCE = new ShmeHomeSiteQuery$Matches$Companion$invoke$1$pageInfo$1();

    ShmeHomeSiteQuery$Matches$Companion$invoke$1$pageInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ShmeHomeSiteQuery.PageInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ShmeHomeSiteQuery.PageInfo.Companion.invoke(removecancellable);
    }
}
