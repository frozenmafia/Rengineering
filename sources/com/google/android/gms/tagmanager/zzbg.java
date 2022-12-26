package com.google.android.gms.tagmanager;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzbg extends zzcn {
    private final /* synthetic */ AppMeasurement zzagp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbg(AppMeasurement appMeasurement) {
        this.zzagp = appMeasurement;
    }

    @Override // com.google.android.gms.tagmanager.zzcm
    public final void logEventInternalNoInterceptor(String str, String str2, Bundle bundle, long j) {
        this.zzagp.logEventInternalNoInterceptor(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.tagmanager.zzcm
    public final Map<String, Object> zzib() {
        return this.zzagp.getUserProperties(true);
    }

    @Override // com.google.android.gms.tagmanager.zzcm
    public final void zza(zzcj zzcjVar) {
        this.zzagp.setEventInterceptor(new zzbh(this, zzcjVar));
    }

    @Override // com.google.android.gms.tagmanager.zzcm
    public final void zza(zzcg zzcgVar) {
        this.zzagp.registerOnMeasurementEventListener(new zzbi(this, zzcgVar));
    }
}
