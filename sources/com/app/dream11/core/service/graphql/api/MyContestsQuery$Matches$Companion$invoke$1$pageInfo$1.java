package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyContestsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MyContestsQuery$Matches$Companion$invoke$1$pageInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MyContestsQuery.PageInfo> {
    public static final MyContestsQuery$Matches$Companion$invoke$1$pageInfo$1 INSTANCE = new MyContestsQuery$Matches$Companion$invoke$1$pageInfo$1();

    MyContestsQuery$Matches$Companion$invoke$1$pageInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MyContestsQuery.PageInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MyContestsQuery.PageInfo.Companion.invoke(removecancellable);
    }
}
