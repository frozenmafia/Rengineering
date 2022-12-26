package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetSavedCardsListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GetSavedCardsListQuery$Data$Companion$invoke$1$savedCards$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetSavedCardsListQuery.SavedCard> {
    public static final GetSavedCardsListQuery$Data$Companion$invoke$1$savedCards$1 INSTANCE = new GetSavedCardsListQuery$Data$Companion$invoke$1$savedCards$1();

    GetSavedCardsListQuery$Data$Companion$invoke$1$savedCards$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.dreampay.graphql.api.GetSavedCardsListQuery$Data$Companion$invoke$1$savedCards$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetSavedCardsListQuery.SavedCard> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetSavedCardsListQuery.SavedCard invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetSavedCardsListQuery.SavedCard.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetSavedCardsListQuery.SavedCard invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetSavedCardsListQuery.SavedCard) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
