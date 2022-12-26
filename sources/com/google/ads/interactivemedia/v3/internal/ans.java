package com.google.ads.interactivemedia.v3.internal;

import android.app.AppOpsManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ans implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ ant a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ans(ant antVar) {
        this.a = antVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        long j;
        long j2;
        long j3;
        if (z) {
            this.a.f659b = System.currentTimeMillis();
            this.a.e = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ant antVar = this.a;
        j = antVar.c;
        if (j > 0) {
            j2 = antVar.c;
            if (currentTimeMillis >= j2) {
                j3 = antVar.c;
                antVar.d = currentTimeMillis - j3;
            }
        }
        this.a.e = false;
    }
}
