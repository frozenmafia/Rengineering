package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.SideNavQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SideNavQuery$Account$Companion$invoke$1$totalBalance$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, SideNavQuery.TotalBalance> {
    public static final SideNavQuery$Account$Companion$invoke$1$totalBalance$1 INSTANCE = new SideNavQuery$Account$Companion$invoke$1$totalBalance$1();

    SideNavQuery$Account$Companion$invoke$1$totalBalance$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final SideNavQuery.TotalBalance invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return SideNavQuery.TotalBalance.Companion.invoke(removecancellable);
    }
}
