package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.UserTeamData;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class UserTeamData$Player$Companion$invoke$1$squad$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserTeamData.Squad> {
    public static final UserTeamData$Player$Companion$invoke$1$squad$1 INSTANCE = new UserTeamData$Player$Companion$invoke$1$squad$1();

    UserTeamData$Player$Companion$invoke$1$squad$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UserTeamData.Squad invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UserTeamData.Squad.Companion.invoke(removecancellable);
    }
}
