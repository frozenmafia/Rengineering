package com.app.dream11.core.service.graphql.api.profile.myprofile;

import com.app.dream11.core.service.graphql.api.profile.myprofile.CareerStatsMyProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CareerStatsMyProfileQuery$Me$Companion$invoke$1$careerStatsBreakup$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CareerStatsMyProfileQuery.CareerStatsBreakup> {
    public static final CareerStatsMyProfileQuery$Me$Companion$invoke$1$careerStatsBreakup$1 INSTANCE = new CareerStatsMyProfileQuery$Me$Companion$invoke$1$careerStatsBreakup$1();

    CareerStatsMyProfileQuery$Me$Companion$invoke$1$careerStatsBreakup$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CareerStatsMyProfileQuery.CareerStatsBreakup invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CareerStatsMyProfileQuery.CareerStatsBreakup.Companion.invoke(removecancellable);
    }
}
