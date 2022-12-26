package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzdm implements zzdo {
    private final /* synthetic */ zzdl zzamq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdm(zzdl zzdlVar) {
        this.zzamq = zzdlVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzdo
    public final AdvertisingIdClient.Info zzgv() {
        Context context;
        try {
            context = this.zzamq.zzrm;
            return AdvertisingIdClient.getAdvertisingIdInfo(context);
        } catch (GooglePlayServicesNotAvailableException e) {
            this.zzamq.zzamn = false;
            zzev.zzb("GooglePlayServicesNotAvailableException getting Advertising Id Info", e);
            return null;
        } catch (GooglePlayServicesRepairableException e2) {
            zzev.zzb("GooglePlayServicesRepairableException getting Advertising Id Info", e2);
            return null;
        } catch (IOException e3) {
            zzev.zzb("IOException getting Ad Id Info", e3);
            return null;
        } catch (IllegalStateException e4) {
            zzev.zzb("IllegalStateException getting Advertising Id Info", e4);
            return null;
        } catch (Exception e5) {
            zzev.zzb("Unknown exception. Could not get the Advertising Id Info.", e5);
            return null;
        }
    }
}
