package com.app.dream11.core.service.graphql.api.Social.Me;

import com.app.dream11.core.service.graphql.api.Social.Me.FriendsListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FriendsListQuery$Me$Companion$invoke$1$countOfFriends$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FriendsListQuery.CountOfFriends> {
    public static final FriendsListQuery$Me$Companion$invoke$1$countOfFriends$1 INSTANCE = new FriendsListQuery$Me$Companion$invoke$1$countOfFriends$1();

    FriendsListQuery$Me$Companion$invoke$1$countOfFriends$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FriendsListQuery.CountOfFriends invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FriendsListQuery.CountOfFriends.Companion.invoke(removecancellable);
    }
}
