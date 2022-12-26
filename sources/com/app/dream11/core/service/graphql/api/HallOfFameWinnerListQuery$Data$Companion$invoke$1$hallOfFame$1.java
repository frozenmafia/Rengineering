package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.HallOfFameWinnerListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HallOfFameWinnerListQuery$Data$Companion$invoke$1$hallOfFame$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HallOfFameWinnerListQuery.HallOfFame> {
    public static final HallOfFameWinnerListQuery$Data$Companion$invoke$1$hallOfFame$1 INSTANCE = new HallOfFameWinnerListQuery$Data$Companion$invoke$1$hallOfFame$1();

    HallOfFameWinnerListQuery$Data$Companion$invoke$1$hallOfFame$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final HallOfFameWinnerListQuery.HallOfFame invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return HallOfFameWinnerListQuery.HallOfFame.Companion.invoke(removecancellable);
    }
}
