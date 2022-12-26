package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.ProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ProfileQuery$Data$Companion$invoke$1$user$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ProfileQuery.User> {
    public static final ProfileQuery$Data$Companion$invoke$1$user$1 INSTANCE = new ProfileQuery$Data$Companion$invoke$1$user$1();

    ProfileQuery$Data$Companion$invoke$1$user$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ProfileQuery.User invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ProfileQuery.User.Companion.invoke(removecancellable);
    }
}
