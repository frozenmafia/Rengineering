package com.google.android.gms.internal.p002authapi;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: com.google.android.gms.internal.auth-api.zbaw  reason: invalid package */
/* loaded from: classes7.dex */
final class zbaw extends zbac {
    final /* synthetic */ TaskCompletionSource zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zbaw(zbay zbayVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p002authapi.zbad
    public final void zbb(Status status, PendingIntent pendingIntent) throws RemoteException {
        TaskUtil.setResultOrApiException(status, pendingIntent, this.zba);
    }
}
