package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetSavedCardsListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GetSavedCardsListQuery$SavedCard$Companion$invoke$1$expiry$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetSavedCardsListQuery.Expiry> {
    public static final GetSavedCardsListQuery$SavedCard$Companion$invoke$1$expiry$1 INSTANCE = new GetSavedCardsListQuery$SavedCard$Companion$invoke$1$expiry$1();

    GetSavedCardsListQuery$SavedCard$Companion$invoke$1$expiry$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetSavedCardsListQuery.Expiry invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetSavedCardsListQuery.Expiry.Companion.invoke(removecancellable);
    }
}
