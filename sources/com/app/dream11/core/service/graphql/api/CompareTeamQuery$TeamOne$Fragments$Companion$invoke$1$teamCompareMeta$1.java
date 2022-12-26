package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.TeamCompareMeta;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CompareTeamQuery$TeamOne$Fragments$Companion$invoke$1$teamCompareMeta$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, TeamCompareMeta> {
    public static final CompareTeamQuery$TeamOne$Fragments$Companion$invoke$1$teamCompareMeta$1 INSTANCE = new CompareTeamQuery$TeamOne$Fragments$Companion$invoke$1$teamCompareMeta$1();

    CompareTeamQuery$TeamOne$Fragments$Companion$invoke$1$teamCompareMeta$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final TeamCompareMeta invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return TeamCompareMeta.Companion.invoke(removecancellable);
    }
}
