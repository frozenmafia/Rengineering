package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyTeamsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MyTeamsQuery$Player$Companion$invoke$1$role$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MyTeamsQuery.Role1> {
    public static final MyTeamsQuery$Player$Companion$invoke$1$role$1 INSTANCE = new MyTeamsQuery$Player$Companion$invoke$1$role$1();

    MyTeamsQuery$Player$Companion$invoke$1$role$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MyTeamsQuery.Role1 invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MyTeamsQuery.Role1.Companion.invoke(removecancellable);
    }
}
