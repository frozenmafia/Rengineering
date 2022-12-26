package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.UserPropertiesQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class UserPropertiesQuery$Data$Companion$invoke$1$me$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserPropertiesQuery.Me> {
    public static final UserPropertiesQuery$Data$Companion$invoke$1$me$1 INSTANCE = new UserPropertiesQuery$Data$Companion$invoke$1$me$1();

    UserPropertiesQuery$Data$Companion$invoke$1$me$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UserPropertiesQuery.Me invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UserPropertiesQuery.Me.Companion.invoke(removecancellable);
    }
}
