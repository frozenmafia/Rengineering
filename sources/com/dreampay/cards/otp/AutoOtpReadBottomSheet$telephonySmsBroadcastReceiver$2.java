package com.dreampay.cards.otp;

import com.dreampay.sms.TelephonySmsBroadcastReceiver;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AutoOtpReadBottomSheet$telephonySmsBroadcastReceiver$2 extends Lambda implements Styleable.ArcMotion<TelephonySmsBroadcastReceiver> {
    final /* synthetic */ AutoOtpReadBottomSheet this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoOtpReadBottomSheet$telephonySmsBroadcastReceiver$2(AutoOtpReadBottomSheet autoOtpReadBottomSheet) {
        super(0);
        this.this$0 = autoOtpReadBottomSheet;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final TelephonySmsBroadcastReceiver invoke() {
        return new TelephonySmsBroadcastReceiver(this.this$0);
    }
}
