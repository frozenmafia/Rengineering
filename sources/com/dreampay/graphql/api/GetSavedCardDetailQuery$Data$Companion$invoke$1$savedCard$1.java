package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetSavedCardDetailQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GetSavedCardDetailQuery$Data$Companion$invoke$1$savedCard$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetSavedCardDetailQuery.SavedCard> {
    public static final GetSavedCardDetailQuery$Data$Companion$invoke$1$savedCard$1 INSTANCE = new GetSavedCardDetailQuery$Data$Companion$invoke$1$savedCard$1();

    GetSavedCardDetailQuery$Data$Companion$invoke$1$savedCard$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetSavedCardDetailQuery.SavedCard invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetSavedCardDetailQuery.SavedCard.Companion.invoke(removecancellable);
    }
}
