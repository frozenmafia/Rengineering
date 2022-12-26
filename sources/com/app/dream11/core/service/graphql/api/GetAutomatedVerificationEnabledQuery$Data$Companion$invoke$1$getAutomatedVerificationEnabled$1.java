package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetAutomatedVerificationEnabledQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetAutomatedVerificationEnabledQuery$Data$Companion$invoke$1$getAutomatedVerificationEnabled$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetAutomatedVerificationEnabledQuery.GetAutomatedVerificationEnabled> {
    public static final GetAutomatedVerificationEnabledQuery$Data$Companion$invoke$1$getAutomatedVerificationEnabled$1 INSTANCE = new GetAutomatedVerificationEnabledQuery$Data$Companion$invoke$1$getAutomatedVerificationEnabled$1();

    GetAutomatedVerificationEnabledQuery$Data$Companion$invoke$1$getAutomatedVerificationEnabled$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetAutomatedVerificationEnabledQuery.GetAutomatedVerificationEnabled invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetAutomatedVerificationEnabledQuery.GetAutomatedVerificationEnabled.Companion.invoke(removecancellable);
    }
}
