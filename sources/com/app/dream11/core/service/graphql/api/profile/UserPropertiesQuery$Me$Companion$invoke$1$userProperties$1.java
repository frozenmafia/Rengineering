package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.UserPropertiesQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class UserPropertiesQuery$Me$Companion$invoke$1$userProperties$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserPropertiesQuery.UserProperties> {
    public static final UserPropertiesQuery$Me$Companion$invoke$1$userProperties$1 INSTANCE = new UserPropertiesQuery$Me$Companion$invoke$1$userProperties$1();

    UserPropertiesQuery$Me$Companion$invoke$1$userProperties$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UserPropertiesQuery.UserProperties invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UserPropertiesQuery.UserProperties.Companion.invoke(removecancellable);
    }
}
