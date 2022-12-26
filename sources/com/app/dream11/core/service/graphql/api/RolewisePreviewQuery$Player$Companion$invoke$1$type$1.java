package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.RolewisePreviewQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class RolewisePreviewQuery$Player$Companion$invoke$1$type$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, RolewisePreviewQuery.Type> {
    public static final RolewisePreviewQuery$Player$Companion$invoke$1$type$1 INSTANCE = new RolewisePreviewQuery$Player$Companion$invoke$1$type$1();

    RolewisePreviewQuery$Player$Companion$invoke$1$type$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final RolewisePreviewQuery.Type invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return RolewisePreviewQuery.Type.Companion.invoke(removecancellable);
    }
}
