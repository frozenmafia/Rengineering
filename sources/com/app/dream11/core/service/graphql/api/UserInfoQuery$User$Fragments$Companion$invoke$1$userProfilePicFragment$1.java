package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.UserProfilePicFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class UserInfoQuery$User$Fragments$Companion$invoke$1$userProfilePicFragment$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserProfilePicFragment> {
    public static final UserInfoQuery$User$Fragments$Companion$invoke$1$userProfilePicFragment$1 INSTANCE = new UserInfoQuery$User$Fragments$Companion$invoke$1$userProfilePicFragment$1();

    UserInfoQuery$User$Fragments$Companion$invoke$1$userProfilePicFragment$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UserProfilePicFragment invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UserProfilePicFragment.Companion.invoke(removecancellable);
    }
}
