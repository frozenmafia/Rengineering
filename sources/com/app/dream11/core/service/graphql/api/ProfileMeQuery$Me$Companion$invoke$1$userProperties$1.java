package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ProfileMeQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ProfileMeQuery$Me$Companion$invoke$1$userProperties$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ProfileMeQuery.UserProperties> {
    public static final ProfileMeQuery$Me$Companion$invoke$1$userProperties$1 INSTANCE = new ProfileMeQuery$Me$Companion$invoke$1$userProperties$1();

    ProfileMeQuery$Me$Companion$invoke$1$userProperties$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ProfileMeQuery.UserProperties invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ProfileMeQuery.UserProperties.Companion.invoke(removecancellable);
    }
}
