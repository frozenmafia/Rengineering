package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabt  reason: invalid package */
/* loaded from: classes7.dex */
final class zzabt implements Iterator<Map.Entry> {
    final /* synthetic */ zzabv zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator<Map.Entry> zzd;

    private final Iterator<Map.Entry> zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.zzb;
        list = this.zza.zzb;
        if (i + 1 >= list.size()) {
            map = this.zza.zzc;
            return !map.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Map.Entry next() {
        List list;
        List list2;
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        list = this.zza.zzb;
        if (i < list.size()) {
            list2 = this.zza.zzb;
            return (Map.Entry) list2.get(this.zzb);
        }
        return zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.zzc) {
            this.zzc = false;
            this.zza.zzn();
            int i = this.zzb;
            list = this.zza.zzb;
            if (i < list.size()) {
                zzabv zzabvVar = this.zza;
                int i2 = this.zzb;
                this.zzb = i2 - 1;
                zzabvVar.zzl(i2);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
