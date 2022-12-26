package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetTeamPreviewQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetTeamPreviewQuery$Match$Companion$invoke$1$matchHighlight$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetTeamPreviewQuery.MatchHighlight> {
    public static final GetTeamPreviewQuery$Match$Companion$invoke$1$matchHighlight$1 INSTANCE = new GetTeamPreviewQuery$Match$Companion$invoke$1$matchHighlight$1();

    GetTeamPreviewQuery$Match$Companion$invoke$1$matchHighlight$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetTeamPreviewQuery.MatchHighlight invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetTeamPreviewQuery.MatchHighlight.Companion.invoke(removecancellable);
    }
}
