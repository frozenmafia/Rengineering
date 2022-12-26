package o;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import java.util.HashMap;
/* loaded from: classes5.dex */
public class addMigrations {
    private lambda$endTransaction$1$androidxroomRoomDatabase ag$a;
    private runInTransaction toString;
    private String HaptikSDK$a = "https://securegw.paytm.in/theia/api/v1/showPaymentPage";
    private boolean valueOf = true;
    private boolean values = true;
    private boolean ah$a = true;

    private boolean values() {
        return this.ah$a;
    }

    public addMigrations(lambda$endTransaction$1$androidxroomRoomDatabase lambda_endtransaction_1_androidxroomroomdatabase, runInTransaction runintransaction) {
        if (lambda_endtransaction_1_androidxroomroomdatabase == null) {
            throw new IllegalArgumentException("Transaction params cannot be null");
        }
        this.toString = runintransaction;
        this.ag$a = lambda_endtransaction_1_androidxroomroomdatabase;
    }

    public void valueOf(Activity activity, int i) {
        if (toString(activity) && this.valueOf) {
            ah$a(activity, i);
        } else if (this.values) {
            valueOf(activity);
        } else {
            this.toString.valueOf("Some Error Occurred in Selected payment Flow . Please  enableRedirectionFlow true ");
            allowMainThreadQueries.valueOf("No payment flow opted");
        }
    }

    private boolean toString(Context context) {
        try {
            context.getPackageManager().getPackageInfo("net.one97.paytm", 0);
            return true;
        } catch (Exception unused) {
            allowMainThreadQueries.valueOf("Paytm app not installed");
            return false;
        }
    }

    private String ag$a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("net.one97.paytm", 0).versionName;
        } catch (Exception unused) {
            allowMainThreadQueries.valueOf("Paytm app not installed");
            return null;
        }
    }

    private int ah$a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 1;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i = 0;
        while (i < split.length && i < split2.length && split[i].equalsIgnoreCase(split2[i])) {
            i++;
        }
        if (i < split.length && i < split2.length) {
            return Integer.signum(Integer.valueOf(split[i]).compareTo(Integer.valueOf(split2[i])));
        }
        return Integer.signum(split.length - split2.length);
    }

    private void ah$a(Activity activity, int i) {
        double d;
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        HashMap<String, String> ag$a = this.ag$a.ag$a();
        String str = ag$a.get("TXN_AMOUNT");
        try {
            d = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            d = 0.0d;
        }
        bundle.putBoolean("nativeSdkEnabled", true);
        bundle.putString("orderid", ag$a.get("ORDER_ID"));
        bundle.putString("txnToken", ag$a.get("TXN_TOKEN"));
        bundle.putString(easypay.manager.Constants.EXTRA_MID, ag$a.get("MID"));
        bundle.putDouble("nativeSdkForMerchantAmount", d);
        try {
            if (ah$a(ag$a(activity), "8.6.0") < 0) {
                intent.setComponent(new ComponentName("net.one97.paytm", "net.one97.paytm.AJRJarvisSplash"));
            } else {
                intent.setComponent(new ComponentName("net.one97.paytm", "net.one97.paytm.AJRRechargePaymentActivity"));
                intent.putExtra("enable_paytm_invoke", true);
                intent.putExtra("paytm_invoke", true);
                intent.putExtra("price", str);
                intent.putExtra("nativeSdkEnabled", true);
                intent.putExtra("orderid", ag$a.get("ORDER_ID"));
                intent.putExtra("txnToken", ag$a.get("TXN_TOKEN"));
                intent.putExtra(easypay.manager.Constants.EXTRA_MID, ag$a.get("MID"));
                intent.addFlags(C.BUFFER_FLAG_FIRST_SAMPLE);
            }
            intent.putExtra("paymentmode", 2);
            intent.putExtra("bill", bundle);
            try {
                activity.startActivityForResult(intent, i);
            } catch (Exception unused) {
                valueOf(activity);
            }
        } catch (Exception unused2) {
        }
    }

    private void valueOf(Context context) {
        lambda$beginTransaction$0$androidxroomRoomDatabase ah$a = lambda$beginTransaction$0$androidxroomRoomDatabase.ah$a(this.ag$a, this.HaptikSDK$a);
        ah$a.ah$a(this.ag$a, (RoomDatabase$$ExternalSyntheticLambda0) null);
        ah$a.values(values());
        ah$a.ah$a(context, true, this.toString);
    }
}
