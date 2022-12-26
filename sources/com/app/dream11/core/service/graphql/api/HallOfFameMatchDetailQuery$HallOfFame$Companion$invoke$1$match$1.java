package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.HallOfFameMatchDetailQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HallOfFameMatchDetailQuery$HallOfFame$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HallOfFameMatchDetailQuery.Match> {
    public static final HallOfFameMatchDetailQuery$HallOfFame$Companion$invoke$1$match$1 INSTANCE = new HallOfFameMatchDetailQuery$HallOfFame$Companion$invoke$1$match$1();

    HallOfFameMatchDetailQuery$HallOfFame$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final HallOfFameMatchDetailQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return HallOfFameMatchDetailQuery.Match.Companion.invoke(removecancellable);
    }
}
