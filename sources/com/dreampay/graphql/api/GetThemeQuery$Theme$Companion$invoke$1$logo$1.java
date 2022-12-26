package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetThemeQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetThemeQuery$Theme$Companion$invoke$1$logo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetThemeQuery.Logo> {
    public static final GetThemeQuery$Theme$Companion$invoke$1$logo$1 INSTANCE = new GetThemeQuery$Theme$Companion$invoke$1$logo$1();

    GetThemeQuery$Theme$Companion$invoke$1$logo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetThemeQuery.Logo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetThemeQuery.Logo.Companion.invoke(removecancellable);
    }
}
