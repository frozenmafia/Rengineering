package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetUserIdFromShortCodeQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetUserIdFromShortCodeQuery$Data$Companion$invoke$1$user$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetUserIdFromShortCodeQuery.User> {
    public static final GetUserIdFromShortCodeQuery$Data$Companion$invoke$1$user$1 INSTANCE = new GetUserIdFromShortCodeQuery$Data$Companion$invoke$1$user$1();

    GetUserIdFromShortCodeQuery$Data$Companion$invoke$1$user$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetUserIdFromShortCodeQuery.User invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetUserIdFromShortCodeQuery.User.Companion.invoke(removecancellable);
    }
}
