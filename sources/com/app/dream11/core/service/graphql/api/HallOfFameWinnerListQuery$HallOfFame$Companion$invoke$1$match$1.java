package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.HallOfFameWinnerListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HallOfFameWinnerListQuery$HallOfFame$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HallOfFameWinnerListQuery.Match> {
    public static final HallOfFameWinnerListQuery$HallOfFame$Companion$invoke$1$match$1 INSTANCE = new HallOfFameWinnerListQuery$HallOfFame$Companion$invoke$1$match$1();

    HallOfFameWinnerListQuery$HallOfFame$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final HallOfFameWinnerListQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return HallOfFameWinnerListQuery.Match.Companion.invoke(removecancellable);
    }
}
