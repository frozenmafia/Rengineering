package com.google.android.gms.internal.p002authapi;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.internal.auth-api.zbf  reason: invalid package */
/* loaded from: classes7.dex */
final class zbf extends zbd {
    final /* synthetic */ zbg zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zbf(zbg zbgVar) {
        this.zba = zbgVar;
    }

    @Override // com.google.android.gms.internal.p002authapi.zbd, com.google.android.gms.internal.p002authapi.zbs
    public final void zbb(Status status, Credential credential) {
        this.zba.setResult((zbg) new zbe(status, credential));
    }

    @Override // com.google.android.gms.internal.p002authapi.zbd, com.google.android.gms.internal.p002authapi.zbs
    public final void zbc(Status status) {
        this.zba.setResult((zbg) new zbe(status, null));
    }
}
