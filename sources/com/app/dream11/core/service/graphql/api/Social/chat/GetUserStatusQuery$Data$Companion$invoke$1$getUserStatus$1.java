package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.GetUserStatusQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetUserStatusQuery$Data$Companion$invoke$1$getUserStatus$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetUserStatusQuery.GetUserStatus> {
    public static final GetUserStatusQuery$Data$Companion$invoke$1$getUserStatus$1 INSTANCE = new GetUserStatusQuery$Data$Companion$invoke$1$getUserStatus$1();

    GetUserStatusQuery$Data$Companion$invoke$1$getUserStatus$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetUserStatusQuery.GetUserStatus invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetUserStatusQuery.GetUserStatus.Companion.invoke(removecancellable);
    }
}
