package com.dreampay.graphql.api;

import com.dreampay.graphql.api.CardBinEligibilityQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class CardBinEligibilityQuery$Type$Companion$invoke$1$artwork$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, CardBinEligibilityQuery.Artwork> {
    public static final CardBinEligibilityQuery$Type$Companion$invoke$1$artwork$1 INSTANCE = new CardBinEligibilityQuery$Type$Companion$invoke$1$artwork$1();

    CardBinEligibilityQuery$Type$Companion$invoke$1$artwork$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.dreampay.graphql.api.CardBinEligibilityQuery$Type$Companion$invoke$1$artwork$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CardBinEligibilityQuery.Artwork> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final CardBinEligibilityQuery.Artwork invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return CardBinEligibilityQuery.Artwork.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final CardBinEligibilityQuery.Artwork invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (CardBinEligibilityQuery.Artwork) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
