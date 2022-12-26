package com.dreampay.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class SmsRetrieverBroadcastReceiver extends BroadcastReceiver {
    private final SmsRetrieverBroadcastReceiver$ag$a values;

    public SmsRetrieverBroadcastReceiver(SmsRetrieverBroadcastReceiver$ag$a smsRetrieverBroadcastReceiver$ag$a) {
        runAnimators.ag$a(smsRetrieverBroadcastReceiver$ag$a, "smsRetrieverListener");
        this.values = smsRetrieverBroadcastReceiver$ag$a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(intent, "intent");
        if (runAnimators.values((Object) intent.getAction(), (Object) SmsRetriever.SMS_RETRIEVED_ACTION)) {
            Bundle extras = intent.getExtras();
            Object obj = extras == null ? null : extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.google.android.gms.common.api.Status");
            int statusCode = ((Status) obj).getStatusCode();
            if (statusCode != 0) {
                if (statusCode != 15) {
                    return;
                }
                this.values.HaptikSDK$c();
                return;
            }
            Intent intent2 = (Intent) extras.getParcelable(SmsRetriever.EXTRA_CONSENT_INTENT);
            if (intent2 != null) {
                this.values.toString(intent2);
            } else {
                this.values.HaptikSDK$c();
            }
        }
    }
}
