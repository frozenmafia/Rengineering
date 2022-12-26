package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* loaded from: classes3.dex */
final class e {
    private IntentFilter AFInAppEventParameterName = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* loaded from: classes3.dex */
    static final class b {
        static final e values = new e();
    }

    e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d values(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, this.AFInAppEventParameterName);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? "other" : "wireless" : "usb" : "ac";
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable unused) {
        }
        return new d(f, str);
    }

    /* loaded from: classes3.dex */
    static final class d {
        final String valueOf;
        final float values;

        d(float f, String str) {
            this.values = f;
            this.valueOf = str;
        }
    }
}
