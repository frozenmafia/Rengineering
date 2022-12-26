package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.UserStatsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class UserStatsQuery$User$Companion$invoke$1$profilePic$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, UserStatsQuery.ProfilePic> {
    public static final UserStatsQuery$User$Companion$invoke$1$profilePic$1 INSTANCE = new UserStatsQuery$User$Companion$invoke$1$profilePic$1();

    UserStatsQuery$User$Companion$invoke$1$profilePic$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.UserStatsQuery$User$Companion$invoke$1$profilePic$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserStatsQuery.ProfilePic> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final UserStatsQuery.ProfilePic invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return UserStatsQuery.ProfilePic.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final UserStatsQuery.ProfilePic invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (UserStatsQuery.ProfilePic) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
