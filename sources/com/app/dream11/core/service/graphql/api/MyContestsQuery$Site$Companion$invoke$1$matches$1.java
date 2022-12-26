package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyContestsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MyContestsQuery$Site$Companion$invoke$1$matches$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MyContestsQuery.Matches> {
    public static final MyContestsQuery$Site$Companion$invoke$1$matches$1 INSTANCE = new MyContestsQuery$Site$Companion$invoke$1$matches$1();

    MyContestsQuery$Site$Companion$invoke$1$matches$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MyContestsQuery.Matches invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MyContestsQuery.Matches.Companion.invoke(removecancellable);
    }
}
