package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.JoinLeagueMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class JoinLeagueMutation$JoinContestWithMultipleTeams$Companion$invoke$1$contest$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, JoinLeagueMutation.Contest> {
    public static final JoinLeagueMutation$JoinContestWithMultipleTeams$Companion$invoke$1$contest$1 INSTANCE = new JoinLeagueMutation$JoinContestWithMultipleTeams$Companion$invoke$1$contest$1();

    JoinLeagueMutation$JoinContestWithMultipleTeams$Companion$invoke$1$contest$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final JoinLeagueMutation.Contest invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return JoinLeagueMutation.Contest.Companion.invoke(removecancellable);
    }
}
