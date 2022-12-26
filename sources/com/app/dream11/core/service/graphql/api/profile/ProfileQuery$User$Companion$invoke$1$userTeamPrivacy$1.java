package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.ProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ProfileQuery$User$Companion$invoke$1$userTeamPrivacy$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ProfileQuery.UserTeamPrivacy> {
    public static final ProfileQuery$User$Companion$invoke$1$userTeamPrivacy$1 INSTANCE = new ProfileQuery$User$Companion$invoke$1$userTeamPrivacy$1();

    ProfileQuery$User$Companion$invoke$1$userTeamPrivacy$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ProfileQuery.UserTeamPrivacy invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ProfileQuery.UserTeamPrivacy.Companion.invoke(removecancellable);
    }
}
