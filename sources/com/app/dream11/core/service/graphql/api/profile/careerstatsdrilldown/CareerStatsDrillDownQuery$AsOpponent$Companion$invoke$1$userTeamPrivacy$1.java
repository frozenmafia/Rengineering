package com.app.dream11.core.service.graphql.api.profile.careerstatsdrilldown;

import com.app.dream11.core.service.graphql.api.profile.careerstatsdrilldown.CareerStatsDrillDownQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CareerStatsDrillDownQuery$AsOpponent$Companion$invoke$1$userTeamPrivacy$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CareerStatsDrillDownQuery.UserTeamPrivacy> {
    public static final CareerStatsDrillDownQuery$AsOpponent$Companion$invoke$1$userTeamPrivacy$1 INSTANCE = new CareerStatsDrillDownQuery$AsOpponent$Companion$invoke$1$userTeamPrivacy$1();

    CareerStatsDrillDownQuery$AsOpponent$Companion$invoke$1$userTeamPrivacy$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CareerStatsDrillDownQuery.UserTeamPrivacy invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CareerStatsDrillDownQuery.UserTeamPrivacy.Companion.invoke(removecancellable);
    }
}
