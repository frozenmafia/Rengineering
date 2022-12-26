package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ProfilePicQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ProfilePicQuery$Data$Companion$invoke$1$me$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ProfilePicQuery.Me> {
    public static final ProfilePicQuery$Data$Companion$invoke$1$me$1 INSTANCE = new ProfilePicQuery$Data$Companion$invoke$1$me$1();

    ProfilePicQuery$Data$Companion$invoke$1$me$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ProfilePicQuery.Me invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ProfilePicQuery.Me.Companion.invoke(removecancellable);
    }
}
