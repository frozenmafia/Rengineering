package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.FPVDetailQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FPVDetailQuery$Me$Companion$invoke$1$fpvDetail$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FPVDetailQuery.FpvDetail> {
    public static final FPVDetailQuery$Me$Companion$invoke$1$fpvDetail$1 INSTANCE = new FPVDetailQuery$Me$Companion$invoke$1$fpvDetail$1();

    FPVDetailQuery$Me$Companion$invoke$1$fpvDetail$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FPVDetailQuery.FpvDetail invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FPVDetailQuery.FpvDetail.Companion.invoke(removecancellable);
    }
}
