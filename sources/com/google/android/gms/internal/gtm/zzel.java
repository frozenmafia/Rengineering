package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.Map;
/* loaded from: classes7.dex */
final class zzel implements Runnable {
    private final /* synthetic */ long zzahg;
    private final /* synthetic */ String zzahh;
    private final /* synthetic */ zzej zzany;
    private final /* synthetic */ String zzanz;
    private final /* synthetic */ String zzaoa;
    private final /* synthetic */ Map zzaob;
    private final /* synthetic */ String zzaoc;
    private final /* synthetic */ zzek zzaod;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzel(zzek zzekVar, zzej zzejVar, long j, String str, String str2, String str3, Map map, String str4) {
        this.zzaod = zzekVar;
        this.zzany = zzejVar;
        this.zzahg = j;
        this.zzahh = str;
        this.zzanz = str2;
        this.zzaoa = str3;
        this.zzaob = map;
        this.zzaoc = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzem zzemVar;
        zzem zzemVar2;
        Context context;
        zzemVar = this.zzaod.zzanx;
        if (zzemVar == null) {
            zzfo zzkv = zzfo.zzkv();
            context = this.zzaod.zzrm;
            zzkv.zza(context, this.zzany);
            this.zzaod.zzanx = zzkv.zzkw();
        }
        zzemVar2 = this.zzaod.zzanx;
        zzemVar2.zza(this.zzahg, this.zzahh, this.zzanz, this.zzaoa, this.zzaob, this.zzaoc);
    }
}
