package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetTeamPreviewQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetTeamPreviewQuery$Data$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetTeamPreviewQuery.Match> {
    public static final GetTeamPreviewQuery$Data$Companion$invoke$1$match$1 INSTANCE = new GetTeamPreviewQuery$Data$Companion$invoke$1$match$1();

    GetTeamPreviewQuery$Data$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetTeamPreviewQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetTeamPreviewQuery.Match.Companion.invoke(removecancellable);
    }
}
