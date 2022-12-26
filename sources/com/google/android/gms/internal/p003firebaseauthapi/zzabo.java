package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabo  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzabo extends zzabv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabo(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzabv
    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzb(); i++) {
                Map.Entry zzg = zzg(i);
                if (((zzzn) zzg.getKey()).zzc()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzzn) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
