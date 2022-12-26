package com.google.android.gms.internal.gtm;

import java.util.Map;
/* loaded from: classes7.dex */
final class zzgn implements Runnable {
    private final /* synthetic */ zzgl zzaqv;
    private final /* synthetic */ zzee zzaqw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgn(zzgl zzglVar, zzee zzeeVar) {
        this.zzaqv = zzglVar;
        this.zzaqw = zzeeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Map map2;
        map = this.zzaqv.zzaqs;
        if (map.isEmpty()) {
            zzev.zzav("TagManagerBackend emit called without loaded container.");
            return;
        }
        map2 = this.zzaqv.zzaqs;
        for (zzdq zzdqVar : map2.values()) {
            zzdqVar.zza(this.zzaqw);
        }
    }
}
