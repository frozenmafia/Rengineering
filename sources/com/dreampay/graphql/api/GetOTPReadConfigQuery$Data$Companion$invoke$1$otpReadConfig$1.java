package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetOTPReadConfigQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GetOTPReadConfigQuery$Data$Companion$invoke$1$otpReadConfig$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetOTPReadConfigQuery.OtpReadConfig> {
    public static final GetOTPReadConfigQuery$Data$Companion$invoke$1$otpReadConfig$1 INSTANCE = new GetOTPReadConfigQuery$Data$Companion$invoke$1$otpReadConfig$1();

    GetOTPReadConfigQuery$Data$Companion$invoke$1$otpReadConfig$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetOTPReadConfigQuery.OtpReadConfig invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetOTPReadConfigQuery.OtpReadConfig.Companion.invoke(removecancellable);
    }
}
