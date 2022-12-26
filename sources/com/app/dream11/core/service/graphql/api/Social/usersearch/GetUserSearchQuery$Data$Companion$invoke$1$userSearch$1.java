package com.app.dream11.core.service.graphql.api.Social.usersearch;

import com.app.dream11.core.service.graphql.api.Social.usersearch.GetUserSearchQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetUserSearchQuery$Data$Companion$invoke$1$userSearch$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetUserSearchQuery.UserSearch> {
    public static final GetUserSearchQuery$Data$Companion$invoke$1$userSearch$1 INSTANCE = new GetUserSearchQuery$Data$Companion$invoke$1$userSearch$1();

    GetUserSearchQuery$Data$Companion$invoke$1$userSearch$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetUserSearchQuery.UserSearch invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetUserSearchQuery.UserSearch.Companion.invoke(removecancellable);
    }
}
