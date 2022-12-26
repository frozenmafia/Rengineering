package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GRecentCommonMatch;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GRecentCommonMatch$OppTeamSummary$Companion$invoke$1$bestUserTeam$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GRecentCommonMatch.BestUserTeam1> {
    public static final GRecentCommonMatch$OppTeamSummary$Companion$invoke$1$bestUserTeam$1 INSTANCE = new GRecentCommonMatch$OppTeamSummary$Companion$invoke$1$bestUserTeam$1();

    GRecentCommonMatch$OppTeamSummary$Companion$invoke$1$bestUserTeam$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GRecentCommonMatch.BestUserTeam1 invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GRecentCommonMatch.BestUserTeam1.Companion.invoke(removecancellable);
    }
}
