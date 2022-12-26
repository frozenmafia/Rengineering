package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
/* loaded from: classes7.dex */
final class zzc implements Runnable {
    private final /* synthetic */ BroadcastReceiver.PendingResult zzrj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(CampaignTrackingReceiver campaignTrackingReceiver, BroadcastReceiver.PendingResult pendingResult) {
        this.zzrj = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BroadcastReceiver.PendingResult pendingResult = this.zzrj;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
