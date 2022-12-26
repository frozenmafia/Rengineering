package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzkw implements zzgz {
    private final Context zzrm;

    public zzkw(Context context) {
        this.zzrm = (Context) Preconditions.checkNotNull(context);
    }

    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        String networkOperatorName;
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length == 0);
        TelephonyManager telephonyManager = (TelephonyManager) this.zzrm.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        zzog zzogVar = zzog.zzaum;
        return (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) ? zzogVar : new zzom(networkOperatorName);
    }
}
