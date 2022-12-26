package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetSavedCardDetailQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GetSavedCardDetailQuery$SavedCard$Companion$invoke$1$expiry$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetSavedCardDetailQuery.Expiry> {
    public static final GetSavedCardDetailQuery$SavedCard$Companion$invoke$1$expiry$1 INSTANCE = new GetSavedCardDetailQuery$SavedCard$Companion$invoke$1$expiry$1();

    GetSavedCardDetailQuery$SavedCard$Companion$invoke$1$expiry$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetSavedCardDetailQuery.Expiry invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetSavedCardDetailQuery.Expiry.Companion.invoke(removecancellable);
    }
}
