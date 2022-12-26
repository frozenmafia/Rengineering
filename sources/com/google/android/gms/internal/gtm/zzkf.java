package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
/* loaded from: classes7.dex */
public final class zzkf extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        try {
            return new zzom(decode(zzha.zzd(zzoaVarArr.length > 0 ? (zzoa) Preconditions.checkNotNull(zzoaVarArr[0]) : zzog.zzaum), "#;/?:@&=+$,"));
        } catch (UnsupportedEncodingException unused) {
            return zzog.zzaum;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String decode(String str, String str2) throws UnsupportedEncodingException {
        Charset forName = Charset.forName("UTF-8");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != '%') {
                sb.append(charAt);
                i++;
            } else {
                byte zzc = zzc(str, i);
                int i2 = i + 3;
                if ((zzc & 128) == 0) {
                    if (str2.indexOf(zzc) == -1) {
                        sb.append((char) zzc);
                    } else {
                        sb.append(str.substring(i2 - 3, i2));
                    }
                } else {
                    int i3 = 0;
                    while (((zzc << i3) & 128) != 0) {
                        i3++;
                    }
                    if (i3 < 2 || i3 > 4) {
                        throw new UnsupportedEncodingException();
                    }
                    byte[] bArr = new byte[i3];
                    bArr[0] = zzc;
                    for (int i4 = 1; i4 < i3; i4++) {
                        byte zzc2 = zzc(str, i2);
                        i2 += 3;
                        if ((zzc2 & 192) != 128) {
                            throw new UnsupportedEncodingException();
                        }
                        bArr[i4] = zzc2;
                    }
                    CharBuffer decode = forName.decode(ByteBuffer.wrap(bArr));
                    if (decode.length() == 1 && str2.indexOf(decode.charAt(0)) != -1) {
                        sb.append(str.substring(i, i2));
                    } else {
                        sb.append((CharSequence) decode);
                    }
                }
                i = i2;
            }
        }
        return sb.toString();
    }

    private static byte zzc(String str, int i) throws UnsupportedEncodingException {
        int i2 = i + 3;
        if (i2 > str.length() || str.charAt(i) != '%') {
            throw new UnsupportedEncodingException();
        }
        String substring = str.substring(i + 1, i2);
        if (substring.charAt(0) == '+' || substring.charAt(0) == '-') {
            throw new UnsupportedEncodingException();
        }
        try {
            return (byte) Integer.parseInt(substring, 16);
        } catch (NumberFormatException unused) {
            throw new UnsupportedEncodingException();
        }
    }
}
