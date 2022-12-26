package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ank implements Runnable {
    final /* synthetic */ int a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ anl f653b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ank(anl anlVar, int i) {
        this.f653b = anlVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afv afvVar;
        anl anlVar = this.f653b;
        int i = this.a;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = anlVar.a.getPackageManager().getPackageInfo(anlVar.a.getPackageName(), 0);
            Context context = anlVar.a;
            afvVar = arn.b(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            afvVar = null;
        }
        this.f653b.m = afvVar;
        if (this.a < 4) {
            if (afvVar != null && afvVar.aj() && !afvVar.f().equals("0000000000000000000000000000000000000000000000000000000000000000") && afvVar.ak() && afvVar.d().d() && afvVar.d().a() != -2) {
                return;
            }
            this.f653b.s(this.a + 1);
        }
    }
}
