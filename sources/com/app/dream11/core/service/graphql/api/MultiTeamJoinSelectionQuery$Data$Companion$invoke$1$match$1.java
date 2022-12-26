package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MultiTeamJoinSelectionQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MultiTeamJoinSelectionQuery$Data$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MultiTeamJoinSelectionQuery.Match> {
    public static final MultiTeamJoinSelectionQuery$Data$Companion$invoke$1$match$1 INSTANCE = new MultiTeamJoinSelectionQuery$Data$Companion$invoke$1$match$1();

    MultiTeamJoinSelectionQuery$Data$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MultiTeamJoinSelectionQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MultiTeamJoinSelectionQuery.Match.Companion.invoke(removecancellable);
    }
}
