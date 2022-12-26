package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvv  reason: invalid package */
/* loaded from: classes5.dex */
public final class zzvv extends AbstractSafeParcelable implements zzuj<zzvv> {
    public static final Parcelable.Creator<zzvv> CREATOR = new zzvw();
    private static final String zza = "zzvv";
    private String zzb;
    private boolean zzc;
    private String zzd;
    private boolean zze;
    private zzxo zzf;
    private List<String> zzg;

    public zzvv() {
        this.zzf = new zzxo(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeStringList(parcel, 7, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzuj
    public final /* synthetic */ zzvv zza(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optString("authUri", null);
            this.zzc = jSONObject.optBoolean("registered", false);
            this.zzd = jSONObject.optString("providerId", null);
            this.zze = jSONObject.optBoolean("forExistingProvider", false);
            if (!jSONObject.has("allProviders")) {
                this.zzf = new zzxo(null);
            } else {
                this.zzf = new zzxo(1, zzyc.zzb(jSONObject.optJSONArray("allProviders")));
            }
            this.zzg = zzyc.zzb(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzyc.zza(e, zza, str);
        }
    }

    public final List<String> zzb() {
        return this.zzg;
    }

    public zzvv(String str, boolean z, String str2, boolean z2, zzxo zzxoVar, List<String> list) {
        zzxo zza2;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = z2;
        if (zzxoVar != null) {
            zza2 = zzxo.zza(zzxoVar);
        } else {
            zza2 = new zzxo(null);
        }
        this.zzf = zza2;
        this.zzg = list;
    }
}
