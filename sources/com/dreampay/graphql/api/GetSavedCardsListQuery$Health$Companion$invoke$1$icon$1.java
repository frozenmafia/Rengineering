package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetSavedCardsListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GetSavedCardsListQuery$Health$Companion$invoke$1$icon$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetSavedCardsListQuery.Icon> {
    public static final GetSavedCardsListQuery$Health$Companion$invoke$1$icon$1 INSTANCE = new GetSavedCardsListQuery$Health$Companion$invoke$1$icon$1();

    GetSavedCardsListQuery$Health$Companion$invoke$1$icon$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetSavedCardsListQuery.Icon invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetSavedCardsListQuery.Icon.Companion.invoke(removecancellable);
    }
}
