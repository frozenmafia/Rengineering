package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zas {
    final /* synthetic */ BasePendingResult zaa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zas(BasePendingResult basePendingResult, zar zarVar) {
        this.zaa = basePendingResult;
    }

    protected final void finalize() throws Throwable {
        Result result;
        result = this.zaa.zaj;
        BasePendingResult.zal(result);
        super.finalize();
    }
}
