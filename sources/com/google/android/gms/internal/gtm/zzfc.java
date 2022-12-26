package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzfc implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzfb zzaop;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfc(zzfb zzfbVar) {
        this.zzaop = zzfbVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        Context context2;
        Context context3;
        context = this.zzaop.zzaon;
        String packageName = context.getPackageName();
        context2 = this.zzaop.zzaon;
        Intent launchIntentForPackage = context2.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage != null) {
            String valueOf = String.valueOf(packageName);
            zzev.zzaw(valueOf.length() != 0 ? "Invoke the launch activity for package name: ".concat(valueOf) : new String("Invoke the launch activity for package name: "));
            context3 = this.zzaop.zzaon;
            context3.startActivity(launchIntentForPackage);
            return;
        }
        String valueOf2 = String.valueOf(packageName);
        zzev.zzac(valueOf2.length() != 0 ? "No launch activity found for package name: ".concat(valueOf2) : new String("No launch activity found for package name: "));
    }
}
