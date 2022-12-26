package com.app.dream11.core.service.graphql.api.Social.OtherUser;

import com.app.dream11.core.service.graphql.api.fragment.UserProfilePicFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes2.dex */
final class OtherUserInfoQuery$User$Fragments$Companion$invoke$1$userProfilePicFragment$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserProfilePicFragment> {
    public static final OtherUserInfoQuery$User$Fragments$Companion$invoke$1$userProfilePicFragment$1 INSTANCE = new OtherUserInfoQuery$User$Fragments$Companion$invoke$1$userProfilePicFragment$1();

    OtherUserInfoQuery$User$Fragments$Companion$invoke$1$userProfilePicFragment$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UserProfilePicFragment invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UserProfilePicFragment.Companion.invoke(removecancellable);
    }
}
