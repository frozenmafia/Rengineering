package com.app.dream11.core.service.graphql.api.verification.pan;

import com.app.dream11.core.service.graphql.api.verification.pan.PanDetailsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PanDetailsQuery$Data$Companion$invoke$1$getPanDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PanDetailsQuery.GetPanDetails> {
    public static final PanDetailsQuery$Data$Companion$invoke$1$getPanDetails$1 INSTANCE = new PanDetailsQuery$Data$Companion$invoke$1$getPanDetails$1();

    PanDetailsQuery$Data$Companion$invoke$1$getPanDetails$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PanDetailsQuery.GetPanDetails invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PanDetailsQuery.GetPanDetails.Companion.invoke(removecancellable);
    }
}
