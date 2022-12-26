package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* loaded from: classes5.dex */
class didChildRangeChange {
    private final Float ah$a;
    private final boolean values;

    private didChildRangeChange(Float f, boolean z) {
        this.values = z;
        this.ah$a = f;
    }

    public Float valueOf() {
        return this.ah$a;
    }

    public int ag$a() {
        Float f;
        if (!this.values || (f = this.ah$a) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }

    public static didChildRangeChange values(Context context) {
        createScroller createscroller;
        boolean z = false;
        Float f = null;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = ah$a(registerReceiver);
                f = ag$a(registerReceiver);
            }
        } catch (IllegalStateException e) {
            createscroller = createScroller.valueOf;
            createscroller.ag$a("An error occurred getting battery state.", e);
        }
        return new didChildRangeChange(f, z);
    }

    private static boolean ah$a(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    private static Float ag$a(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }
}
