package com.google.android.gms.internal.p002authapi;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.auth-api.zbax  reason: invalid package */
/* loaded from: classes7.dex */
public final class zbax extends zbaa {
    final /* synthetic */ TaskCompletionSource zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zbax(zbay zbayVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p002authapi.zbab
    public final void zbb(Status status, PendingIntent pendingIntent) {
        TaskUtil.setResultOrApiException(status, pendingIntent, this.zba);
    }
}
