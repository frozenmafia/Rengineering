package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.UserProfilePicFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class UserProfilePicFragment$Companion$invoke$1$profilePic$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, UserProfilePicFragment.ProfilePic> {
    public static final UserProfilePicFragment$Companion$invoke$1$profilePic$1 INSTANCE = new UserProfilePicFragment$Companion$invoke$1$profilePic$1();

    UserProfilePicFragment$Companion$invoke$1$profilePic$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.UserProfilePicFragment$Companion$invoke$1$profilePic$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserProfilePicFragment.ProfilePic> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final UserProfilePicFragment.ProfilePic invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return UserProfilePicFragment.ProfilePic.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final UserProfilePicFragment.ProfilePic invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (UserProfilePicFragment.ProfilePic) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
