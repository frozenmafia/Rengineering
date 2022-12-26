package com.app.dream11.core.service.graphql.api.Social.OtherUser;

import com.app.dream11.core.service.graphql.api.Social.OtherUser.OtherFollowerListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class OtherFollowerListQuery$Data$Companion$invoke$1$followers$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, OtherFollowerListQuery.Followers> {
    public static final OtherFollowerListQuery$Data$Companion$invoke$1$followers$1 INSTANCE = new OtherFollowerListQuery$Data$Companion$invoke$1$followers$1();

    OtherFollowerListQuery$Data$Companion$invoke$1$followers$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final OtherFollowerListQuery.Followers invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return OtherFollowerListQuery.Followers.Companion.invoke(removecancellable);
    }
}
