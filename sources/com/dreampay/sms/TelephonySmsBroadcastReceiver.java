package com.dreampay.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import java.util.Objects;
import o.FontRequestEmojiCompatConfig;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class TelephonySmsBroadcastReceiver extends BroadcastReceiver {
    public static final TelephonySmsBroadcastReceiver$ah$a values = new TelephonySmsBroadcastReceiver$ah$a(null);
    private final FontRequestEmojiCompatConfig.RetryPolicy valueOf;

    public TelephonySmsBroadcastReceiver(FontRequestEmojiCompatConfig.RetryPolicy retryPolicy) {
        runAnimators.ag$a(retryPolicy, "smsListener");
        this.valueOf = retryPolicy;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(intent, "intent");
        if (!runAnimators.values((Object) intent.getAction(), (Object) "android.provider.Telephony.SMS_RECEIVED")) {
            return;
        }
        Bundle extras = intent.getExtras();
        Object[] objArr = (Object[]) (extras == null ? null : extras.get("pdus"));
        if (objArr == null) {
            return;
        }
        int i = 0;
        int length = objArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = i + 1;
            Object obj = objArr[i];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.ByteArray");
            SmsMessage createFromPdu = SmsMessage.createFromPdu((byte[]) obj);
            this.valueOf.toString(createFromPdu.getDisplayOriginatingAddress(), createFromPdu.getMessageBody());
            if (i2 > length) {
                return;
            }
            i = i2;
        }
    }
}
