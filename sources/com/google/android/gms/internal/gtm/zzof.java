package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes7.dex */
public final class zzof extends zzoa<zzgz> {
    private static final Map<String, zzgz> zzaug;
    private zzgz zzaui;

    public zzof(zzgz zzgzVar) {
        this.zzaui = zzgzVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzoa
    public final Iterator<zzoa<?>> zzmf() {
        return zzmg();
    }

    @Override // com.google.android.gms.internal.gtm.zzoa
    public final boolean zzcp(String str) {
        return zzaug.containsKey(str);
    }

    @Override // com.google.android.gms.internal.gtm.zzoa
    public final zzgz zzcq(String str) {
        if (zzcp(str)) {
            return zzaug.get(str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 60);
        sb.append("Native Method ");
        sb.append(str);
        sb.append(" is not defined for type InstructionReference.");
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.internal.gtm.zzoa
    public final String toString() {
        return this.zzaui.toString();
    }

    @Override // com.google.android.gms.internal.gtm.zzoa
    public final /* synthetic */ zzgz value() {
        return this.zzaui;
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", zzja.zzark);
        zzaug = Collections.unmodifiableMap(hashMap);
    }
}
