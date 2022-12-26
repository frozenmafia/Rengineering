package com.app.dream11.core.service.graphql.api.profile.careerstatsdrilldown;

import com.app.dream11.core.service.graphql.api.profile.careerstatsdrilldown.CareerStatsDrillDownQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CareerStatsDrillDownQuery$User$Companion$invoke$1$asOpponent$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CareerStatsDrillDownQuery.AsOpponent> {
    public static final CareerStatsDrillDownQuery$User$Companion$invoke$1$asOpponent$1 INSTANCE = new CareerStatsDrillDownQuery$User$Companion$invoke$1$asOpponent$1();

    CareerStatsDrillDownQuery$User$Companion$invoke$1$asOpponent$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CareerStatsDrillDownQuery.AsOpponent invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CareerStatsDrillDownQuery.AsOpponent.Companion.invoke(removecancellable);
    }
}
