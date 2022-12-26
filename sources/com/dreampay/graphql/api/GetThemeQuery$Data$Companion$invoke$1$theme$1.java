package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetThemeQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetThemeQuery$Data$Companion$invoke$1$theme$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetThemeQuery.Theme> {
    public static final GetThemeQuery$Data$Companion$invoke$1$theme$1 INSTANCE = new GetThemeQuery$Data$Companion$invoke$1$theme$1();

    GetThemeQuery$Data$Companion$invoke$1$theme$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetThemeQuery.Theme invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetThemeQuery.Theme.Companion.invoke(removecancellable);
    }
}
