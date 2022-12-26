package com.dreampay.cards.otp;

import android.os.Bundle;
import com.dreampay.commons.constants.Constants;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AutoOtpReadBottomSheet$cardIssuer$2 extends Lambda implements Styleable.ArcMotion<String> {
    final /* synthetic */ AutoOtpReadBottomSheet this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoOtpReadBottomSheet$cardIssuer$2(AutoOtpReadBottomSheet autoOtpReadBottomSheet) {
        super(0);
        this.this$0 = autoOtpReadBottomSheet;
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        String string;
        Bundle arguments = this.this$0.getArguments();
        return (arguments == null || (string = arguments.getString(Constants.Navigation.CARD_ISSUER)) == null) ? "" : string;
    }
}
