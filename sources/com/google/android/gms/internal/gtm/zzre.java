package com.google.android.gms.internal.gtm;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes7.dex */
public final class zzre {
    public static final byte[] zzbbh;
    private static final ByteBuffer zzbbi;
    private static final zzqe zzbbj;
    static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzf(zzsk zzskVar) {
        return false;
    }

    public static int zzk(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzz(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T zza(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static boolean zzi(byte[] bArr) {
        return zztz.zzi(bArr);
    }

    public static String zzj(byte[] bArr) {
        return new String(bArr, UTF_8);
    }

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        int zza = zza(length, bArr, 0, length);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzb(Object obj, Object obj2) {
        return ((zzsk) obj).zzpg().zza((zzsk) obj2).zzpl();
    }

    static {
        byte[] bArr = new byte[0];
        zzbbh = bArr;
        zzbbi = ByteBuffer.wrap(bArr);
        zzbbj = zzqe.zza(bArr, 0, 0, false);
    }
}
