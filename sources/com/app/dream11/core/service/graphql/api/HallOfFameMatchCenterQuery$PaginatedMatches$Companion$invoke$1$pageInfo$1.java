package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.HallOfFameMatchCenterQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HallOfFameMatchCenterQuery$PaginatedMatches$Companion$invoke$1$pageInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HallOfFameMatchCenterQuery.PageInfo> {
    public static final HallOfFameMatchCenterQuery$PaginatedMatches$Companion$invoke$1$pageInfo$1 INSTANCE = new HallOfFameMatchCenterQuery$PaginatedMatches$Companion$invoke$1$pageInfo$1();

    HallOfFameMatchCenterQuery$PaginatedMatches$Companion$invoke$1$pageInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final HallOfFameMatchCenterQuery.PageInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return HallOfFameMatchCenterQuery.PageInfo.Companion.invoke(removecancellable);
    }
}
