package o;

import android.content.Context;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
/* renamed from: o.package-info$ah$a  reason: invalid class name */
/* loaded from: classes3.dex */
final class packageinfo$ah$a {
    public static void valueOf(Context context, packageinfo packageinfoVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) FingerprintManagerCompat.toString((TelephonyManager) context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE));
            values valuesVar = new values(packageinfoVar);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), valuesVar);
            telephonyManager.unregisterTelephonyCallback(valuesVar);
        } catch (RuntimeException unused) {
            packageinfoVar.valueOf(5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.package-info$ah$a$values */
    /* loaded from: classes3.dex */
    public static final class values extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
        private final packageinfo valueOf;

        public values(packageinfo packageinfoVar) {
            this.valueOf = packageinfoVar;
        }

        @Override // android.telephony.TelephonyCallback.DisplayInfoListener
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            this.valueOf.valueOf(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
        }
    }
}
