package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.ProfilePicFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SideNavQuery$Me$Fragments$Companion$invoke$1$profilePicFragment$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ProfilePicFragment> {
    public static final SideNavQuery$Me$Fragments$Companion$invoke$1$profilePicFragment$1 INSTANCE = new SideNavQuery$Me$Fragments$Companion$invoke$1$profilePicFragment$1();

    SideNavQuery$Me$Fragments$Companion$invoke$1$profilePicFragment$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ProfilePicFragment invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ProfilePicFragment.Companion.invoke(removecancellable);
    }
}
