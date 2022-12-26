package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchUserLangQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchUserLangQuery$Data$Companion$invoke$1$userLangPref$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchUserLangQuery.UserLangPref> {
    public static final FetchUserLangQuery$Data$Companion$invoke$1$userLangPref$1 INSTANCE = new FetchUserLangQuery$Data$Companion$invoke$1$userLangPref$1();

    FetchUserLangQuery$Data$Companion$invoke$1$userLangPref$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchUserLangQuery.UserLangPref invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchUserLangQuery.UserLangPref.Companion.invoke(removecancellable);
    }
}
