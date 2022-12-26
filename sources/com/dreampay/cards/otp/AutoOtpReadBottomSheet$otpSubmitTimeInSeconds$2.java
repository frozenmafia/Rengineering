package com.dreampay.cards.otp;

import android.os.Bundle;
import com.dreampay.commons.constants.Constants;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AutoOtpReadBottomSheet$otpSubmitTimeInSeconds$2 extends Lambda implements Styleable.ArcMotion<Integer> {
    final /* synthetic */ AutoOtpReadBottomSheet this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoOtpReadBottomSheet$otpSubmitTimeInSeconds$2(AutoOtpReadBottomSheet autoOtpReadBottomSheet) {
        super(0);
        this.this$0 = autoOtpReadBottomSheet;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public /* synthetic */ Integer invoke2() {
        return Integer.valueOf(invoke());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Integer, int] */
    @Override // o.Styleable.ArcMotion
    public final Integer invoke() {
        Bundle arguments = this.this$0.getArguments();
        if (arguments == null) {
            return 5;
        }
        return arguments.getInt(Constants.Navigation.OTP_SUBMIT_TIME);
    }
}
