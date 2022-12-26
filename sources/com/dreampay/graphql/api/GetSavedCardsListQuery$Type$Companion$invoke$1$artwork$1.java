package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetSavedCardsListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GetSavedCardsListQuery$Type$Companion$invoke$1$artwork$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetSavedCardsListQuery.Artwork> {
    public static final GetSavedCardsListQuery$Type$Companion$invoke$1$artwork$1 INSTANCE = new GetSavedCardsListQuery$Type$Companion$invoke$1$artwork$1();

    GetSavedCardsListQuery$Type$Companion$invoke$1$artwork$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.dreampay.graphql.api.GetSavedCardsListQuery$Type$Companion$invoke$1$artwork$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetSavedCardsListQuery.Artwork> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetSavedCardsListQuery.Artwork invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetSavedCardsListQuery.Artwork.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetSavedCardsListQuery.Artwork invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetSavedCardsListQuery.Artwork) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
