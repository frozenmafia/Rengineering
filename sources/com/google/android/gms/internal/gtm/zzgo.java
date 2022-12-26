package com.google.android.gms.internal.gtm;

import java.util.Map;
/* loaded from: classes7.dex */
final class zzgo implements Runnable {
    private final /* synthetic */ zzgl zzaqv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgo(zzgl zzglVar) {
        this.zzaqv = zzglVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Map map2;
        map = this.zzaqv.zzaqs;
        if (map.isEmpty()) {
            zzev.zzac("TagManagerBackend dispatch called without loaded container.");
            return;
        }
        map2 = this.zzaqv.zzaqs;
        for (zzdq zzdqVar : map2.values()) {
            zzdqVar.dispatch();
        }
    }
}
