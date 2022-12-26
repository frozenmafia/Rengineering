package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetSavedCardDetailQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GetSavedCardDetailQuery$Type$Companion$invoke$1$artwork$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetSavedCardDetailQuery.Artwork> {
    public static final GetSavedCardDetailQuery$Type$Companion$invoke$1$artwork$1 INSTANCE = new GetSavedCardDetailQuery$Type$Companion$invoke$1$artwork$1();

    GetSavedCardDetailQuery$Type$Companion$invoke$1$artwork$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.dreampay.graphql.api.GetSavedCardDetailQuery$Type$Companion$invoke$1$artwork$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetSavedCardDetailQuery.Artwork> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetSavedCardDetailQuery.Artwork invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetSavedCardDetailQuery.Artwork.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetSavedCardDetailQuery.Artwork invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetSavedCardDetailQuery.Artwork) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
