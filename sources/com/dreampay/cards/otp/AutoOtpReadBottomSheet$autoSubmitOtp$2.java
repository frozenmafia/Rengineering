package com.dreampay.cards.otp;

import android.os.Bundle;
import com.dreampay.commons.constants.Constants;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AutoOtpReadBottomSheet$autoSubmitOtp$2 extends Lambda implements Styleable.ArcMotion<Boolean> {
    final /* synthetic */ AutoOtpReadBottomSheet this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoOtpReadBottomSheet$autoSubmitOtp$2(AutoOtpReadBottomSheet autoOtpReadBottomSheet) {
        super(0);
        this.this$0 = autoOtpReadBottomSheet;
    }

    @Override // o.Styleable.ArcMotion
    public /* synthetic */ Boolean invoke() {
        return Boolean.valueOf(invoke2());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, boolean] */
    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2() {
        Bundle arguments = this.this$0.getArguments();
        if (arguments == null) {
            return null;
        }
        return arguments.getBoolean(Constants.Navigation.AUTO_SUBMIT_OTP);
    }
}
