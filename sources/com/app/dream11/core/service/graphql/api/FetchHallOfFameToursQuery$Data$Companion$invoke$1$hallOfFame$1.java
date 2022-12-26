package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchHallOfFameToursQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchHallOfFameToursQuery$Data$Companion$invoke$1$hallOfFame$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchHallOfFameToursQuery.HallOfFame> {
    public static final FetchHallOfFameToursQuery$Data$Companion$invoke$1$hallOfFame$1 INSTANCE = new FetchHallOfFameToursQuery$Data$Companion$invoke$1$hallOfFame$1();

    FetchHallOfFameToursQuery$Data$Companion$invoke$1$hallOfFame$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchHallOfFameToursQuery.HallOfFame invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchHallOfFameToursQuery.HallOfFame.Companion.invoke(removecancellable);
    }
}
