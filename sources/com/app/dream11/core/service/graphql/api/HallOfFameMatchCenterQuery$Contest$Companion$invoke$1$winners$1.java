package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.HallOfFameMatchCenterQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HallOfFameMatchCenterQuery$Contest$Companion$invoke$1$winners$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HallOfFameMatchCenterQuery.Winners> {
    public static final HallOfFameMatchCenterQuery$Contest$Companion$invoke$1$winners$1 INSTANCE = new HallOfFameMatchCenterQuery$Contest$Companion$invoke$1$winners$1();

    HallOfFameMatchCenterQuery$Contest$Companion$invoke$1$winners$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final HallOfFameMatchCenterQuery.Winners invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return HallOfFameMatchCenterQuery.Winners.Companion.invoke(removecancellable);
    }
}
