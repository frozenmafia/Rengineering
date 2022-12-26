package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.RolewisePreviewQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class RolewisePreviewQuery$Data$Companion$invoke$1$site$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, RolewisePreviewQuery.Site> {
    public static final RolewisePreviewQuery$Data$Companion$invoke$1$site$1 INSTANCE = new RolewisePreviewQuery$Data$Companion$invoke$1$site$1();

    RolewisePreviewQuery$Data$Companion$invoke$1$site$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final RolewisePreviewQuery.Site invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return RolewisePreviewQuery.Site.Companion.invoke(removecancellable);
    }
}
