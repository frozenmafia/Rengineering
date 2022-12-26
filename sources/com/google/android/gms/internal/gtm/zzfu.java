package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzfu implements zzed {
    private final String zzabp;
    private final zzfx zzapo;
    private final zzfw zzapp;
    private final Context zzrm;

    private zzfu(zzfx zzfxVar, Context context, zzfw zzfwVar) {
        String str;
        this.zzapo = zzfxVar;
        this.zzrm = context.getApplicationContext();
        this.zzapp = zzfwVar;
        String str2 = Build.VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        if (locale == null || locale.getLanguage() == null || locale.getLanguage().length() == 0) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage().toLowerCase());
            if (locale.getCountry() != null && locale.getCountry().length() != 0) {
                sb.append("-");
                sb.append(locale.getCountry().toLowerCase());
            }
            str = sb.toString();
        }
        this.zzabp = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleTagManager", "5.06", str2, str, Build.MODEL, Build.ID);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfu(Context context, zzfw zzfwVar) {
        this(new zzfv(), context, zzfwVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzed
    public final boolean zzhy() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzrm.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            zzev.zzab("...no network connectivity");
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0219 A[Catch: all -> 0x0233, TRY_ENTER, TryCatch #0 {all -> 0x0233, blocks: (B:72:0x015c, B:77:0x0169, B:82:0x01af, B:100:0x0219, B:101:0x021c, B:110:0x022f, B:111:0x0232, B:69:0x014b, B:71:0x0159), top: B:129:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x023c A[Catch: IOException -> 0x0243, TRY_ENTER, TryCatch #5 {IOException -> 0x0243, blocks: (B:104:0x0224, B:105:0x0227, B:119:0x023c, B:120:0x023f, B:121:0x0242), top: B:139:0x0224 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0224 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0145 A[Catch: all -> 0x0109, TRY_LEAVE, TryCatch #6 {all -> 0x0109, blocks: (B:40:0x00e9, B:62:0x0118, B:64:0x011d, B:67:0x0145, B:43:0x00f1, B:46:0x00f9, B:49:0x0101), top: B:141:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e2 A[Catch: all -> 0x022b, TRY_LEAVE, TryCatch #7 {all -> 0x022b, blocks: (B:83:0x01dc, B:85:0x01e2), top: B:143:0x01dc }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0216  */
    @Override // com.google.android.gms.internal.gtm.zzed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(java.util.List<com.google.android.gms.internal.gtm.zzeh> r18) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfu.zzd(java.util.List):void");
    }

    private static URL zzd(zzeh zzehVar) {
        try {
            return new URL(zzehVar.zzij());
        } catch (MalformedURLException unused) {
            zzev.zzav("Error trying to parse the GTM url.");
            return null;
        }
    }
}
