package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: com.google.android.gms.internal.auth-api-phone.zzu  reason: invalid package */
/* loaded from: classes7.dex */
final class zzu extends IStatusCallback.Stub {
    final /* synthetic */ TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzu(zzv zzvVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        if (status.getStatusCode() == 6) {
            this.zza.trySetException(ApiExceptionUtil.fromStatus(status));
        } else {
            TaskUtil.setResultOrApiException(status, this.zza);
        }
    }
}
