package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.http.client.methods.HttpHead;
/* loaded from: classes7.dex */
public final class zzec implements zzei {
    private static zzec zzanj;
    private zzfe zzank;
    private zzej zzanl;
    private static final Object zzadq = new Object();
    private static final Set<String> zzanm = new HashSet(Arrays.asList("GET", HttpHead.METHOD_NAME, "POST", "PUT"));

    private zzec(Context context) {
        this(zzek.zzq(context), new zzfm());
    }

    private zzec(zzej zzejVar, zzfe zzfeVar) {
        this.zzanl = zzejVar;
        this.zzank = zzfeVar;
    }

    public static zzei zzp(Context context) {
        zzec zzecVar;
        synchronized (zzadq) {
            if (zzanj == null) {
                zzanj = new zzec(context);
            }
            zzecVar = zzanj;
        }
        return zzecVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzei
    public final boolean zzay(String str) {
        return zza(str, null, null, null, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzei
    public final boolean zzf(String str, String str2) {
        return zza(str, null, str2, null, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzei
    public final boolean zza(String str, String str2, String str3, Map<String, String> map, String str4) {
        if (str2 != null && !zzanm.contains(str2)) {
            zzev.zzac(String.format("Unsupport http method %s. Drop the hit.", str2));
            return false;
        } else if (!zzfd.zzkr().isPreview() && !this.zzank.zzfm()) {
            zzev.zzac("Too many hits sent too quickly (rate throttled).");
            return false;
        } else {
            this.zzanl.zzb(str, str2, str3, map, str4);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzei
    public final void dispatch() {
        zzfo.zzkv().dispatch();
    }
}
