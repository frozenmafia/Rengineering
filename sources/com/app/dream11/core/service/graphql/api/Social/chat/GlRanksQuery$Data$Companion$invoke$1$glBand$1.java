package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.GlRanksQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GlRanksQuery$Data$Companion$invoke$1$glBand$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GlRanksQuery.GlBand> {
    public static final GlRanksQuery$Data$Companion$invoke$1$glBand$1 INSTANCE = new GlRanksQuery$Data$Companion$invoke$1$glBand$1();

    GlRanksQuery$Data$Companion$invoke$1$glBand$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GlRanksQuery.GlBand invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GlRanksQuery.GlBand.Companion.invoke(removecancellable);
    }
}
