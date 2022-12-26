package com.app.dream11.core.service.graphql.api.Social.OtherUser;

import com.app.dream11.core.service.graphql.api.Social.OtherUser.OtherFollowerListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class OtherFollowerListQuery$Data$Companion$invoke$1$user$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, OtherFollowerListQuery.User> {
    public static final OtherFollowerListQuery$Data$Companion$invoke$1$user$1 INSTANCE = new OtherFollowerListQuery$Data$Companion$invoke$1$user$1();

    OtherFollowerListQuery$Data$Companion$invoke$1$user$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final OtherFollowerListQuery.User invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return OtherFollowerListQuery.User.Companion.invoke(removecancellable);
    }
}
