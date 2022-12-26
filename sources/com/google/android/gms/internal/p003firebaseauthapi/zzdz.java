package com.google.android.gms.internal.p003firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdz  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzdz implements zzay {
    private final SharedPreferences.Editor zza;
    private final String zzb = "GenericIdpKeyset";

    public zzdz(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.zza = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.zza = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzay
    public final void zzb(zzho zzhoVar) throws IOException {
        if (!this.zza.putString(this.zzb, zzky.zza(zzhoVar.zzr())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzay
    public final void zzc(zzir zzirVar) throws IOException {
        if (!this.zza.putString(this.zzb, zzky.zza(zzirVar.zzr())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
