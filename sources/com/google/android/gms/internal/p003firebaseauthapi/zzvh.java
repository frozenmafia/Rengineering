package com.google.android.gms.internal.p003firebaseauthapi;

import android.app.Activity;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Map;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvh  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzvh {
    private static final Map<String, zzvg> zza = new ArrayMap();

    public static PhoneAuthProvider.toString zza(String str, PhoneAuthProvider.toString tostring, zzux zzuxVar) {
        zze(str, zzuxVar);
        return new zzvf(tostring, str);
    }

    public static void zzc() {
        zza.clear();
    }

    public static boolean zzd(String str, PhoneAuthProvider.toString tostring, Activity activity, Executor executor) {
        Map<String, zzvg> map = zza;
        if (map.containsKey(str)) {
            zzvg zzvgVar = map.get(str);
            if (DefaultClock.getInstance().currentTimeMillis() - zzvgVar.zzb < 120000) {
                zzux zzuxVar = zzvgVar.zza;
                if (zzuxVar != null) {
                    zzuxVar.zzi(tostring, activity, executor, str);
                    return true;
                }
                return true;
            }
            zze(str, null);
            return false;
        }
        zze(str, null);
        return false;
    }

    private static void zze(String str, zzux zzuxVar) {
        zza.put(str, new zzvg(zzuxVar, DefaultClock.getInstance().currentTimeMillis()));
    }
}
