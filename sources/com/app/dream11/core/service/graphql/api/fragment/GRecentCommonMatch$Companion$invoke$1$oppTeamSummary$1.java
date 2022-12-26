package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GRecentCommonMatch;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GRecentCommonMatch$Companion$invoke$1$oppTeamSummary$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GRecentCommonMatch.OppTeamSummary> {
    public static final GRecentCommonMatch$Companion$invoke$1$oppTeamSummary$1 INSTANCE = new GRecentCommonMatch$Companion$invoke$1$oppTeamSummary$1();

    GRecentCommonMatch$Companion$invoke$1$oppTeamSummary$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GRecentCommonMatch.OppTeamSummary invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GRecentCommonMatch.OppTeamSummary.Companion.invoke(removecancellable);
    }
}
