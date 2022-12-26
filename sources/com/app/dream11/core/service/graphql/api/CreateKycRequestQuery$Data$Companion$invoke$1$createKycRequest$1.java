package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.CreateKycRequestQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CreateKycRequestQuery$Data$Companion$invoke$1$createKycRequest$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CreateKycRequestQuery.CreateKycRequest> {
    public static final CreateKycRequestQuery$Data$Companion$invoke$1$createKycRequest$1 INSTANCE = new CreateKycRequestQuery$Data$Companion$invoke$1$createKycRequest$1();

    CreateKycRequestQuery$Data$Companion$invoke$1$createKycRequest$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CreateKycRequestQuery.CreateKycRequest invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CreateKycRequestQuery.CreateKycRequest.Companion.invoke(removecancellable);
    }
}
