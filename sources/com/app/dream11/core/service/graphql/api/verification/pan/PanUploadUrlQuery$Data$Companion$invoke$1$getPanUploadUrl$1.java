package com.app.dream11.core.service.graphql.api.verification.pan;

import com.app.dream11.core.service.graphql.api.verification.pan.PanUploadUrlQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PanUploadUrlQuery$Data$Companion$invoke$1$getPanUploadUrl$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PanUploadUrlQuery.GetPanUploadUrl> {
    public static final PanUploadUrlQuery$Data$Companion$invoke$1$getPanUploadUrl$1 INSTANCE = new PanUploadUrlQuery$Data$Companion$invoke$1$getPanUploadUrl$1();

    PanUploadUrlQuery$Data$Companion$invoke$1$getPanUploadUrl$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PanUploadUrlQuery.GetPanUploadUrl invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PanUploadUrlQuery.GetPanUploadUrl.Companion.invoke(removecancellable);
    }
}
