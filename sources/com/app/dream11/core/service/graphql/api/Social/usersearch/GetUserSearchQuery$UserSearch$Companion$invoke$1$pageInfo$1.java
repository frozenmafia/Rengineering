package com.app.dream11.core.service.graphql.api.Social.usersearch;

import com.app.dream11.core.service.graphql.api.Social.usersearch.GetUserSearchQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetUserSearchQuery$UserSearch$Companion$invoke$1$pageInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetUserSearchQuery.PageInfo> {
    public static final GetUserSearchQuery$UserSearch$Companion$invoke$1$pageInfo$1 INSTANCE = new GetUserSearchQuery$UserSearch$Companion$invoke$1$pageInfo$1();

    GetUserSearchQuery$UserSearch$Companion$invoke$1$pageInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetUserSearchQuery.PageInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetUserSearchQuery.PageInfo.Companion.invoke(removecancellable);
    }
}
