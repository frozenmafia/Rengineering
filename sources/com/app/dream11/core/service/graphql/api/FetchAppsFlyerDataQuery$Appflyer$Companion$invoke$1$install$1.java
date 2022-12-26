package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchAppsFlyerDataQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchAppsFlyerDataQuery$Appflyer$Companion$invoke$1$install$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchAppsFlyerDataQuery.Install> {
    public static final FetchAppsFlyerDataQuery$Appflyer$Companion$invoke$1$install$1 INSTANCE = new FetchAppsFlyerDataQuery$Appflyer$Companion$invoke$1$install$1();

    FetchAppsFlyerDataQuery$Appflyer$Companion$invoke$1$install$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchAppsFlyerDataQuery.Install invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchAppsFlyerDataQuery.Install.Companion.invoke(removecancellable);
    }
}
