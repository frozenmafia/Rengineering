package com.google.android.gms.internal.gtm;

import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzle extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        byte[] decode;
        String encodeToString;
        boolean z = true;
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length > 0);
        String zzd = zzha.zzd(zzoaVarArr[0]);
        String zzd2 = zzoaVarArr.length > 1 ? zzha.zzd(zzoaVarArr[1]) : "text";
        String zzd3 = zzoaVarArr.length > 2 ? zzha.zzd(zzoaVarArr[2]) : "base16";
        int i = (zzoaVarArr.length <= 3 || !zzha.zza(zzoaVarArr[3])) ? false : false ? 3 : 2;
        try {
            if ("text".equals(zzd2)) {
                decode = zzd.getBytes();
            } else if ("base16".equals(zzd2)) {
                decode = zzdp.decode(zzd);
            } else if ("base64".equals(zzd2)) {
                decode = Base64.decode(zzd, i);
            } else if ("base64url".equals(zzd2)) {
                decode = Base64.decode(zzd, i | 8);
            } else {
                String valueOf = String.valueOf(zzd2);
                throw new UnsupportedOperationException(valueOf.length() != 0 ? "Encode: unknown input format: ".concat(valueOf) : new String("Encode: unknown input format: "));
            }
            if ("base16".equals(zzd3)) {
                encodeToString = zzdp.encode(decode);
            } else if ("base64".equals(zzd3)) {
                encodeToString = Base64.encodeToString(decode, i);
            } else if ("base64url".equals(zzd3)) {
                encodeToString = Base64.encodeToString(decode, i | 8);
            } else {
                String valueOf2 = String.valueOf(zzd3);
                throw new RuntimeException(valueOf2.length() != 0 ? "Encode: unknown output format: ".concat(valueOf2) : new String("Encode: unknown output format: "));
            }
            return new zzom(encodeToString);
        } catch (IllegalArgumentException unused) {
            String valueOf3 = String.valueOf(zzd2);
            throw new RuntimeException(valueOf3.length() != 0 ? "Encode: invalid input:".concat(valueOf3) : new String("Encode: invalid input:"));
        }
    }
}
