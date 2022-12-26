package com.google.android.gms.internal.p003firebaseauthapi;

import java.lang.reflect.Type;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuh  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzuh {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzuh";

    private zzuh() {
    }

    public static Object zza(String str, Type type) throws zzpz {
        if (type == String.class) {
            try {
                zzvt zzvtVar = new zzvt();
                zzvtVar.zzb(str);
                if (zzvtVar.zzd()) {
                    return zzvtVar.zzc();
                }
                String valueOf = String.valueOf(str);
                throw new zzpz(valueOf.length() != 0 ? "No error message: ".concat(valueOf) : new String("No error message: "));
            } catch (Exception e) {
                String valueOf2 = String.valueOf(e.getMessage());
                throw new zzpz(valueOf2.length() != 0 ? "Json conversion failed! ".concat(valueOf2) : new String("Json conversion failed! "), e);
            }
        } else if (type != Void.class) {
            try {
                zzuj zzujVar = (zzuj) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0]);
                try {
                    zzujVar.zza(str);
                    return zzujVar;
                } catch (Exception e2) {
                    String valueOf3 = String.valueOf(e2.getMessage());
                    throw new zzpz(valueOf3.length() != 0 ? "Json conversion failed! ".concat(valueOf3) : new String("Json conversion failed! "), e2);
                }
            } catch (Exception e3) {
                String valueOf4 = String.valueOf(type);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf4).length() + 38);
                sb.append("Instantiation of JsonResponse failed! ");
                sb.append(valueOf4);
                throw new zzpz(sb.toString(), e3);
            }
        } else {
            return null;
        }
    }
}
