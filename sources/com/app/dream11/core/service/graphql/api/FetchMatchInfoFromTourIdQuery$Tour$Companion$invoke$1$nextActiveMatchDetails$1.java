package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchMatchInfoFromTourIdQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchMatchInfoFromTourIdQuery$Tour$Companion$invoke$1$nextActiveMatchDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchMatchInfoFromTourIdQuery.NextActiveMatchDetails> {
    public static final FetchMatchInfoFromTourIdQuery$Tour$Companion$invoke$1$nextActiveMatchDetails$1 INSTANCE = new FetchMatchInfoFromTourIdQuery$Tour$Companion$invoke$1$nextActiveMatchDetails$1();

    FetchMatchInfoFromTourIdQuery$Tour$Companion$invoke$1$nextActiveMatchDetails$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchMatchInfoFromTourIdQuery.NextActiveMatchDetails invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchMatchInfoFromTourIdQuery.NextActiveMatchDetails.Companion.invoke(removecancellable);
    }
}
