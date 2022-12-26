package com.app.dream11.core.service.graphql.api.profile.myprofile;

import com.app.dream11.core.service.graphql.api.profile.myprofile.CareerStatsMyProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CareerStatsMyProfileQuery$Data$Companion$invoke$1$me$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CareerStatsMyProfileQuery.Me> {
    public static final CareerStatsMyProfileQuery$Data$Companion$invoke$1$me$1 INSTANCE = new CareerStatsMyProfileQuery$Data$Companion$invoke$1$me$1();

    CareerStatsMyProfileQuery$Data$Companion$invoke$1$me$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CareerStatsMyProfileQuery.Me invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CareerStatsMyProfileQuery.Me.Companion.invoke(removecancellable);
    }
}
