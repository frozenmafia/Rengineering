package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyTeamsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MyTeamsQuery$Player$Companion$invoke$1$squad$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MyTeamsQuery.Squad1> {
    public static final MyTeamsQuery$Player$Companion$invoke$1$squad$1 INSTANCE = new MyTeamsQuery$Player$Companion$invoke$1$squad$1();

    MyTeamsQuery$Player$Companion$invoke$1$squad$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MyTeamsQuery.Squad1 invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MyTeamsQuery.Squad1.Companion.invoke(removecancellable);
    }
}
