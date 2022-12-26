package com.app.dream11.core.service.graphql.api.Social;

import com.app.dream11.core.service.graphql.api.Social.GetUserActivitiesQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetUserActivitiesQuery$User$Companion$invoke$1$activities$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetUserActivitiesQuery.Activities> {
    public static final GetUserActivitiesQuery$User$Companion$invoke$1$activities$1 INSTANCE = new GetUserActivitiesQuery$User$Companion$invoke$1$activities$1();

    GetUserActivitiesQuery$User$Companion$invoke$1$activities$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetUserActivitiesQuery.Activities invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetUserActivitiesQuery.Activities.Companion.invoke(removecancellable);
    }
}
