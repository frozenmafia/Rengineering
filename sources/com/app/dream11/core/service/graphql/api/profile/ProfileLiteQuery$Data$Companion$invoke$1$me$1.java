package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.ProfileLiteQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ProfileLiteQuery$Data$Companion$invoke$1$me$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ProfileLiteQuery.Me> {
    public static final ProfileLiteQuery$Data$Companion$invoke$1$me$1 INSTANCE = new ProfileLiteQuery$Data$Companion$invoke$1$me$1();

    ProfileLiteQuery$Data$Companion$invoke$1$me$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ProfileLiteQuery.Me invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ProfileLiteQuery.Me.Companion.invoke(removecancellable);
    }
}
