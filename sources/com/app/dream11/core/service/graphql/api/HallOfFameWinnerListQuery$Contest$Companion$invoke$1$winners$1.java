package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.HallOfFameWinnerListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HallOfFameWinnerListQuery$Contest$Companion$invoke$1$winners$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HallOfFameWinnerListQuery.Winners> {
    public static final HallOfFameWinnerListQuery$Contest$Companion$invoke$1$winners$1 INSTANCE = new HallOfFameWinnerListQuery$Contest$Companion$invoke$1$winners$1();

    HallOfFameWinnerListQuery$Contest$Companion$invoke$1$winners$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final HallOfFameWinnerListQuery.Winners invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return HallOfFameWinnerListQuery.Winners.Companion.invoke(removecancellable);
    }
}
