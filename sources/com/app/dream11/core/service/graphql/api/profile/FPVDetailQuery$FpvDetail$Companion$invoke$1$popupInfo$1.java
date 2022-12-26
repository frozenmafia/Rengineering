package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.FPVDetailQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FPVDetailQuery$FpvDetail$Companion$invoke$1$popupInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FPVDetailQuery.PopupInfo> {
    public static final FPVDetailQuery$FpvDetail$Companion$invoke$1$popupInfo$1 INSTANCE = new FPVDetailQuery$FpvDetail$Companion$invoke$1$popupInfo$1();

    FPVDetailQuery$FpvDetail$Companion$invoke$1$popupInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FPVDetailQuery.PopupInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FPVDetailQuery.PopupInfo.Companion.invoke(removecancellable);
    }
}
