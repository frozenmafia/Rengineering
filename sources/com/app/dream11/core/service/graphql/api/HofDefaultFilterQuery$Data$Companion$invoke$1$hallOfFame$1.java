package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.HofDefaultFilterQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HofDefaultFilterQuery$Data$Companion$invoke$1$hallOfFame$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HofDefaultFilterQuery.HallOfFame> {
    public static final HofDefaultFilterQuery$Data$Companion$invoke$1$hallOfFame$1 INSTANCE = new HofDefaultFilterQuery$Data$Companion$invoke$1$hallOfFame$1();

    HofDefaultFilterQuery$Data$Companion$invoke$1$hallOfFame$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final HofDefaultFilterQuery.HallOfFame invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return HofDefaultFilterQuery.HallOfFame.Companion.invoke(removecancellable);
    }
}
