package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
/* loaded from: classes7.dex */
public final class zzli extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        byte[] decode;
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length > 0);
        if (zzoaVarArr[0] == zzog.zzaum) {
            return zzog.zzaum;
        }
        String zzd = zzha.zzd(zzoaVarArr[0]);
        String zzd2 = (zzoaVarArr.length <= 1 || zzoaVarArr[1] == zzog.zzaum) ? MessageDigestAlgorithms.MD5 : zzha.zzd(zzoaVarArr[1]);
        String zzd3 = (zzoaVarArr.length <= 2 || zzoaVarArr[2] == zzog.zzaum) ? "text" : zzha.zzd(zzoaVarArr[2]);
        if ("text".equals(zzd3)) {
            decode = zzd.getBytes();
        } else if ("base16".equals(zzd3)) {
            decode = zzdp.decode(zzd);
        } else {
            String valueOf = String.valueOf(zzd3);
            throw new RuntimeException(valueOf.length() != 0 ? "Hash: Unknown input format: ".concat(valueOf) : new String("Hash: Unknown input format: "));
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(zzd2);
            messageDigest.update(decode);
            return new zzom(zzdp.encode(messageDigest.digest()));
        } catch (NoSuchAlgorithmException e) {
            String valueOf2 = String.valueOf(zzd2);
            throw new RuntimeException(valueOf2.length() != 0 ? "Hash: Unknown algorithm: ".concat(valueOf2) : new String("Hash: Unknown algorithm: "), e);
        }
    }
}
