package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyTeamsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MyTeamsQuery$Data$Companion$invoke$1$site$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MyTeamsQuery.Site> {
    public static final MyTeamsQuery$Data$Companion$invoke$1$site$1 INSTANCE = new MyTeamsQuery$Data$Companion$invoke$1$site$1();

    MyTeamsQuery$Data$Companion$invoke$1$site$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MyTeamsQuery.Site invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MyTeamsQuery.Site.Companion.invoke(removecancellable);
    }
}
