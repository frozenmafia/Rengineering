package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetSavedCardsListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GetSavedCardsListQuery$SavedCard$Companion$invoke$1$health$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetSavedCardsListQuery.Health> {
    public static final GetSavedCardsListQuery$SavedCard$Companion$invoke$1$health$1 INSTANCE = new GetSavedCardsListQuery$SavedCard$Companion$invoke$1$health$1();

    GetSavedCardsListQuery$SavedCard$Companion$invoke$1$health$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetSavedCardsListQuery.Health invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetSavedCardsListQuery.Health.Companion.invoke(removecancellable);
    }
}
