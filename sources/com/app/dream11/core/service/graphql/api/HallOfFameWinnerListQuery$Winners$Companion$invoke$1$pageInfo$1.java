package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.HallOfFameWinnerListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HallOfFameWinnerListQuery$Winners$Companion$invoke$1$pageInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HallOfFameWinnerListQuery.PageInfo> {
    public static final HallOfFameWinnerListQuery$Winners$Companion$invoke$1$pageInfo$1 INSTANCE = new HallOfFameWinnerListQuery$Winners$Companion$invoke$1$pageInfo$1();

    HallOfFameWinnerListQuery$Winners$Companion$invoke$1$pageInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final HallOfFameWinnerListQuery.PageInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return HallOfFameWinnerListQuery.PageInfo.Companion.invoke(removecancellable);
    }
}
