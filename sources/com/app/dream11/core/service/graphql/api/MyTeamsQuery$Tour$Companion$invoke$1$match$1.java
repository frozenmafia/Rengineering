package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyTeamsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MyTeamsQuery$Tour$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MyTeamsQuery.Match> {
    public static final MyTeamsQuery$Tour$Companion$invoke$1$match$1 INSTANCE = new MyTeamsQuery$Tour$Companion$invoke$1$match$1();

    MyTeamsQuery$Tour$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MyTeamsQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MyTeamsQuery.Match.Companion.invoke(removecancellable);
    }
}
