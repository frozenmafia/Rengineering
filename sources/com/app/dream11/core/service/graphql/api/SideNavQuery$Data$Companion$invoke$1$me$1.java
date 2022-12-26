package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.SideNavQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SideNavQuery$Data$Companion$invoke$1$me$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, SideNavQuery.Me> {
    public static final SideNavQuery$Data$Companion$invoke$1$me$1 INSTANCE = new SideNavQuery$Data$Companion$invoke$1$me$1();

    SideNavQuery$Data$Companion$invoke$1$me$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final SideNavQuery.Me invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return SideNavQuery.Me.Companion.invoke(removecancellable);
    }
}
