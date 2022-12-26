package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlc  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzlc extends ThreadLocal<Mac> {
    final /* synthetic */ zzld zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlc(zzld zzldVar) {
        this.zza = zzldVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzkp<zzku, Mac> zzkpVar = zzkp.zzb;
            str = this.zza.zzb;
            Mac zza = zzkpVar.zza(str);
            key = this.zza.zzc;
            zza.init(key);
            return zza;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
