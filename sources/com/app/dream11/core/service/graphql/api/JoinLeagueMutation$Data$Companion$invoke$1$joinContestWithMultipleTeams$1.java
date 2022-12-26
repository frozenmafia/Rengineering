package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.JoinLeagueMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class JoinLeagueMutation$Data$Companion$invoke$1$joinContestWithMultipleTeams$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, JoinLeagueMutation.JoinContestWithMultipleTeams> {
    public static final JoinLeagueMutation$Data$Companion$invoke$1$joinContestWithMultipleTeams$1 INSTANCE = new JoinLeagueMutation$Data$Companion$invoke$1$joinContestWithMultipleTeams$1();

    JoinLeagueMutation$Data$Companion$invoke$1$joinContestWithMultipleTeams$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final JoinLeagueMutation.JoinContestWithMultipleTeams invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return JoinLeagueMutation.JoinContestWithMultipleTeams.Companion.invoke(removecancellable);
    }
}
