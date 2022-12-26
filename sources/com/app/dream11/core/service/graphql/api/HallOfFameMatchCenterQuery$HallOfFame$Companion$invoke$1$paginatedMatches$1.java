package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.HallOfFameMatchCenterQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HallOfFameMatchCenterQuery$HallOfFame$Companion$invoke$1$paginatedMatches$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HallOfFameMatchCenterQuery.PaginatedMatches> {
    public static final HallOfFameMatchCenterQuery$HallOfFame$Companion$invoke$1$paginatedMatches$1 INSTANCE = new HallOfFameMatchCenterQuery$HallOfFame$Companion$invoke$1$paginatedMatches$1();

    HallOfFameMatchCenterQuery$HallOfFame$Companion$invoke$1$paginatedMatches$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final HallOfFameMatchCenterQuery.PaginatedMatches invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return HallOfFameMatchCenterQuery.PaginatedMatches.Companion.invoke(removecancellable);
    }
}
