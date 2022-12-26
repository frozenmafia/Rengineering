package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FomoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FomoQuery$Data$Companion$invoke$1$fomo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FomoQuery.Fomo> {
    public static final FomoQuery$Data$Companion$invoke$1$fomo$1 INSTANCE = new FomoQuery$Data$Companion$invoke$1$fomo$1();

    FomoQuery$Data$Companion$invoke$1$fomo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FomoQuery.Fomo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FomoQuery.Fomo.Companion.invoke(removecancellable);
    }
}
