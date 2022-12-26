package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzrc;
/* loaded from: classes7.dex */
final class zzsx implements zzsi {
    private final int flags;
    private final String info;
    private final Object[] zzbcz;
    private final zzsk zzbdc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsx(zzsk zzskVar, String str, Object[] objArr) {
        this.zzbdc = zzskVar;
        this.info = str;
        this.zzbcz = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            char charAt2 = str.charAt(i2);
            if (charAt2 < 55296) {
                this.flags = i | (charAt2 << i3);
                return;
            }
            i |= (charAt2 & 8191) << i3;
            i3 += 13;
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzqt() {
        return this.info;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zzqu() {
        return this.zzbcz;
    }

    @Override // com.google.android.gms.internal.gtm.zzsi
    public final zzsk zzqn() {
        return this.zzbdc;
    }

    @Override // com.google.android.gms.internal.gtm.zzsi
    public final int zzql() {
        return (this.flags & 1) == 1 ? zzrc.zze.zzbaz : zzrc.zze.zzbba;
    }

    @Override // com.google.android.gms.internal.gtm.zzsi
    public final boolean zzqm() {
        return (this.flags & 2) == 2;
    }
}
