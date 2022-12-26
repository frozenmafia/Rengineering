package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.MiniProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MiniProfileQuery$Data$Companion$invoke$1$user$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MiniProfileQuery.User> {
    public static final MiniProfileQuery$Data$Companion$invoke$1$user$1 INSTANCE = new MiniProfileQuery$Data$Companion$invoke$1$user$1();

    MiniProfileQuery$Data$Companion$invoke$1$user$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MiniProfileQuery.User invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MiniProfileQuery.User.Companion.invoke(removecancellable);
    }
}
