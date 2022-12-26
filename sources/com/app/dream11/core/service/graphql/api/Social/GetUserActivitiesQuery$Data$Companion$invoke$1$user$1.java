package com.app.dream11.core.service.graphql.api.Social;

import com.app.dream11.core.service.graphql.api.Social.GetUserActivitiesQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetUserActivitiesQuery$Data$Companion$invoke$1$user$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetUserActivitiesQuery.User> {
    public static final GetUserActivitiesQuery$Data$Companion$invoke$1$user$1 INSTANCE = new GetUserActivitiesQuery$Data$Companion$invoke$1$user$1();

    GetUserActivitiesQuery$Data$Companion$invoke$1$user$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetUserActivitiesQuery.User invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetUserActivitiesQuery.User.Companion.invoke(removecancellable);
    }
}
