package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyTeamsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MyTeamsQuery$Site$Companion$invoke$1$teamCriteria$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MyTeamsQuery.TeamCriteria> {
    public static final MyTeamsQuery$Site$Companion$invoke$1$teamCriteria$1 INSTANCE = new MyTeamsQuery$Site$Companion$invoke$1$teamCriteria$1();

    MyTeamsQuery$Site$Companion$invoke$1$teamCriteria$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MyTeamsQuery.TeamCriteria invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MyTeamsQuery.TeamCriteria.Companion.invoke(removecancellable);
    }
}
