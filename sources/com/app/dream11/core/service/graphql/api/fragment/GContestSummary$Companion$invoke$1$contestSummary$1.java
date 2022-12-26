package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GContestSummary;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GContestSummary$Companion$invoke$1$contestSummary$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GContestSummary.ContestSummary> {
    public static final GContestSummary$Companion$invoke$1$contestSummary$1 INSTANCE = new GContestSummary$Companion$invoke$1$contestSummary$1();

    GContestSummary$Companion$invoke$1$contestSummary$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GContestSummary.ContestSummary invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GContestSummary.ContestSummary.Companion.invoke(removecancellable);
    }
}
