package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.SideNavQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SideNavQuery$Me$Companion$invoke$1$loyalty$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, SideNavQuery.Loyalty> {
    public static final SideNavQuery$Me$Companion$invoke$1$loyalty$1 INSTANCE = new SideNavQuery$Me$Companion$invoke$1$loyalty$1();

    SideNavQuery$Me$Companion$invoke$1$loyalty$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final SideNavQuery.Loyalty invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return SideNavQuery.Loyalty.Companion.invoke(removecancellable);
    }
}
