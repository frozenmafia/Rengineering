package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes7.dex */
public final class zzfl {
    private zzfl zzape;
    private Map<String, zzoa> zzapf;

    public zzfl() {
        this(null);
    }

    private zzfl(zzfl zzflVar) {
        this.zzapf = null;
        this.zzape = zzflVar;
    }

    public final zzfl zzku() {
        return new zzfl(this);
    }

    public final boolean has(String str) {
        zzfl zzflVar = this;
        do {
            Map<String, zzoa> map = zzflVar.zzapf;
            if (map != null && map.containsKey(str)) {
                return true;
            }
            zzflVar = zzflVar.zzape;
        } while (zzflVar != null);
        return false;
    }

    public final zzoa<?> zzca(String str) {
        zzfl zzflVar = this;
        do {
            Map<String, zzoa> map = zzflVar.zzapf;
            if (map != null && map.containsKey(str)) {
                return zzflVar.zzapf.get(str);
            }
            zzflVar = zzflVar.zzape;
        } while (zzflVar != null);
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Trying to get a non existent symbol: ".concat(valueOf) : new String("Trying to get a non existent symbol: "));
    }

    public final void zza(String str, zzoa<?> zzoaVar) {
        if (this.zzapf == null) {
            this.zzapf = new HashMap();
        }
        this.zzapf.put(str, zzoaVar);
    }

    public final void zzb(String str, zzoa<?> zzoaVar) {
        zzfl zzflVar = this;
        do {
            Map<String, zzoa> map = zzflVar.zzapf;
            if (map != null && map.containsKey(str)) {
                zzflVar.zzapf.put(str, zzoaVar);
                return;
            }
            zzflVar = zzflVar.zzape;
        } while (zzflVar != null);
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Trying to modify a non existent symbol: ".concat(valueOf) : new String("Trying to modify a non existent symbol: "));
    }

    public final void remove(String str) {
        zzfl zzflVar = this;
        while (true) {
            Preconditions.checkState(zzflVar.has(str));
            Map<String, zzoa> map = zzflVar.zzapf;
            if (map != null && map.containsKey(str)) {
                zzflVar.zzapf.remove(str);
                return;
            }
            zzflVar = zzflVar.zzape;
        }
    }
}
