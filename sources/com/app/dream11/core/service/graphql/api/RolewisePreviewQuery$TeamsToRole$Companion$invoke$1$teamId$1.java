package com.app.dream11.core.service.graphql.api;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class RolewisePreviewQuery$TeamsToRole$Companion$invoke$1$teamId$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, Integer> {
    public static final RolewisePreviewQuery$TeamsToRole$Companion$invoke$1$teamId$1 INSTANCE = new RolewisePreviewQuery$TeamsToRole$Companion$invoke$1$teamId$1();

    RolewisePreviewQuery$TeamsToRole$Companion$invoke$1$teamId$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Integer invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return Integer.valueOf(valuesVar.values());
    }
}
