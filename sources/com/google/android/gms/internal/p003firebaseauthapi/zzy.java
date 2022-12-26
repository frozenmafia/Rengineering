package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzy  reason: invalid package */
/* loaded from: classes5.dex */
final class zzy extends zzac {
    final /* synthetic */ zzz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(zzz zzzVar, zzae zzaeVar, CharSequence charSequence) {
        super(zzaeVar, charSequence);
        this.zza = zzzVar;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzac
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzac
    final int zzd(int i) {
        String zzb;
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        if (i >= 0 && i <= length) {
            while (i < length) {
                if (charSequence.charAt(i) == '.') {
                    return i;
                }
                i++;
            }
            return -1;
        }
        if (i < 0) {
            zzb = zzaf.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (length < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else {
            zzb = zzaf.zzb("%s (%s) must not be greater than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(length));
        }
        throw new IndexOutOfBoundsException(zzb);
    }
}
