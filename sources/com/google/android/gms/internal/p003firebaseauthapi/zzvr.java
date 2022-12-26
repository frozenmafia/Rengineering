package com.google.android.gms.internal.p003firebaseauthapi;

import androidx.collection.ArrayMap;
import com.google.firebase.FirebaseApp;
import java.lang.ref.WeakReference;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvr  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzvr {
    private static final Map<String, zzvp> zza = new ArrayMap();
    private static final Map<String, WeakReference<zzvq>> zzb = new ArrayMap();

    public static String zza(String str) {
        zzvp zzvpVar;
        Map<String, zzvp> map = zza;
        synchronized (map) {
            zzvpVar = map.get(str);
        }
        if (zzvpVar == null) {
            throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
        }
        return String.valueOf(zzh(zzvpVar.zzb(), zzvpVar.zza(), zzvpVar.zzb().contains(":"))).concat("emulator/auth/handler");
    }

    public static String zzb(String str) {
        zzvp zzvpVar;
        String str2;
        Map<String, zzvp> map = zza;
        synchronized (map) {
            zzvpVar = map.get(str);
        }
        if (zzvpVar != null) {
            String valueOf = String.valueOf(zzh(zzvpVar.zzb(), zzvpVar.zza(), zzvpVar.zzb().contains(":")));
            str2 = valueOf.length() != 0 ? "".concat(valueOf) : new String("");
        } else {
            str2 = "https://";
        }
        return String.valueOf(str2).concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzvp zzvpVar;
        String str2;
        Map<String, zzvp> map = zza;
        synchronized (map) {
            zzvpVar = map.get(str);
        }
        if (zzvpVar != null) {
            String valueOf = String.valueOf(zzh(zzvpVar.zzb(), zzvpVar.zza(), zzvpVar.zzb().contains(":")));
            str2 = valueOf.length() != 0 ? "".concat(valueOf) : new String("");
        } else {
            str2 = "https://";
        }
        return String.valueOf(str2).concat("identitytoolkit.googleapis.com/v2/accounts");
    }

    public static String zzd(String str) {
        zzvp zzvpVar;
        String str2;
        Map<String, zzvp> map = zza;
        synchronized (map) {
            zzvpVar = map.get(str);
        }
        if (zzvpVar != null) {
            String valueOf = String.valueOf(zzh(zzvpVar.zzb(), zzvpVar.zza(), zzvpVar.zzb().contains(":")));
            str2 = valueOf.length() != 0 ? "".concat(valueOf) : new String("");
        } else {
            str2 = "https://";
        }
        return String.valueOf(str2).concat("securetoken.googleapis.com/v1");
    }

    public static void zze(String str, zzvq zzvqVar) {
        Map<String, WeakReference<zzvq>> map = zzb;
        synchronized (map) {
            map.put(str, new WeakReference<>(zzvqVar));
        }
    }

    public static void zzf(FirebaseApp firebaseApp, String str, int i) {
        String ah$a = firebaseApp.ah$b().ah$a();
        Map<String, zzvp> map = zza;
        synchronized (map) {
            map.put(ah$a, new zzvp(str, i));
        }
        Map<String, WeakReference<zzvq>> map2 = zzb;
        synchronized (map2) {
            if (map2.containsKey(ah$a)) {
                zzvq zzvqVar = map2.get(ah$a).get();
                if (zzvqVar != null) {
                    zzvqVar.zzi();
                } else {
                    map.remove(ah$a);
                }
            }
        }
    }

    public static boolean zzg(FirebaseApp firebaseApp) {
        return zza.containsKey(firebaseApp.ah$b().ah$a());
    }

    private static String zzh(String str, int i, boolean z) {
        if (z) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("http://[");
            sb.append(str);
            sb.append("]:");
            sb.append(i);
            sb.append("/");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 20);
        sb2.append("http://");
        sb2.append(str);
        sb2.append(":");
        sb2.append(i);
        sb2.append("/");
        return sb2.toString();
    }
}
