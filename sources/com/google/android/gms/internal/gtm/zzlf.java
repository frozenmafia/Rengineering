package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes7.dex */
public final class zzlf extends zzhb {
    private static final Pattern zzart = Pattern.compile("(.+)/(.+)/(.+)");

    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length >= 3);
        String zzd = zzha.zzd(zzoaVarArr[0]);
        String zzd2 = zzha.zzd(zzoaVarArr[1]);
        String zzd3 = zzha.zzd(zzoaVarArr[2]);
        String zzd4 = zzoaVarArr.length < 4 ? "AES/CBC/NoPadding" : zzha.zzd(zzoaVarArr[3]);
        Matcher matcher = zzart.matcher(zzd4);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(zzd4);
            throw new RuntimeException(valueOf.length() != 0 ? "Encrypt: invalid transformation:".concat(valueOf) : new String("Encrypt: invalid transformation:"));
        }
        try {
            return new zzom(zza(Cipher.getInstance(zzd4), zzd, new SecretKeySpec(zzd2.getBytes(), matcher.group(1)), new IvParameterSpec(zzd3.getBytes())));
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            String valueOf2 = String.valueOf(zzd4);
            throw new RuntimeException(valueOf2.length() != 0 ? "Encrypt: invalid transformation:".concat(valueOf2) : new String("Encrypt: invalid transformation:"));
        }
    }

    private static String zza(Cipher cipher, String str, SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec) {
        if (str == null || str.length() == 0) {
            throw new RuntimeException("Encrypt: empty input string");
        }
        try {
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return zzdp.encode(cipher.doFinal(str.getBytes()));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new RuntimeException(valueOf.length() != 0 ? "Encrypt: ".concat(valueOf) : new String("Encrypt: "));
        }
    }
}
