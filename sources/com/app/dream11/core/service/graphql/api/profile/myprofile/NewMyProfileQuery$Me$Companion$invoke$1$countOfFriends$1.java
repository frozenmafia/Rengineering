package com.app.dream11.core.service.graphql.api.profile.myprofile;

import com.app.dream11.core.service.graphql.api.profile.myprofile.NewMyProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class NewMyProfileQuery$Me$Companion$invoke$1$countOfFriends$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, NewMyProfileQuery.CountOfFriends> {
    public static final NewMyProfileQuery$Me$Companion$invoke$1$countOfFriends$1 INSTANCE = new NewMyProfileQuery$Me$Companion$invoke$1$countOfFriends$1();

    NewMyProfileQuery$Me$Companion$invoke$1$countOfFriends$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final NewMyProfileQuery.CountOfFriends invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return NewMyProfileQuery.CountOfFriends.Companion.invoke(removecancellable);
    }
}
