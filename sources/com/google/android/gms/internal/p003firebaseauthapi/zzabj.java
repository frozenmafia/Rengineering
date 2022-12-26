package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabj  reason: invalid package */
/* loaded from: classes7.dex */
final class zzabj implements zzaaw {
    private final zzaaz zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabj(zzaaz zzaazVar, String str, Object[] objArr) {
        char charAt;
        this.zza = zzaazVar;
        this.zzb = str;
        this.zzc = objArr;
        int i = 1;
        try {
            charAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str2 = new String(charArray);
            try {
                try {
                    charAt = str2.charAt(0);
                    str = str2;
                } catch (StringIndexOutOfBoundsException unused2) {
                    char[] cArr = new char[str2.length()];
                    str2.getChars(0, str2.length(), cArr, 0);
                    String str3 = new String(cArr);
                    try {
                        charAt = str3.charAt(0);
                        str = str3;
                    } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
                        e = e;
                        str2 = str3;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            } catch (StringIndexOutOfBoundsException e3) {
                e = e3;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            }
        }
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        while (true) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 55296) {
                this.zzd = (charAt2 << i3) | i2;
                return;
            }
            i2 |= (charAt2 & 8191) << i3;
            i3 += 13;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaaw
    public final zzaaz zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaaw
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaaw
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }
}
