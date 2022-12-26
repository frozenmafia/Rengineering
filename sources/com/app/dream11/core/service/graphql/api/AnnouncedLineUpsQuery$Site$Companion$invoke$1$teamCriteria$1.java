package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.AnnouncedLineUpsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AnnouncedLineUpsQuery$Site$Companion$invoke$1$teamCriteria$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, AnnouncedLineUpsQuery.TeamCriteria> {
    public static final AnnouncedLineUpsQuery$Site$Companion$invoke$1$teamCriteria$1 INSTANCE = new AnnouncedLineUpsQuery$Site$Companion$invoke$1$teamCriteria$1();

    AnnouncedLineUpsQuery$Site$Companion$invoke$1$teamCriteria$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final AnnouncedLineUpsQuery.TeamCriteria invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return AnnouncedLineUpsQuery.TeamCriteria.Companion.invoke(removecancellable);
    }
}
