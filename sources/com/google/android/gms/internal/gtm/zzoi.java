package com.google.android.gms.internal.gtm;

import java.util.Iterator;
/* loaded from: classes7.dex */
final class zzoi implements Iterator<zzoa<?>> {
    private int currentIndex = 0;
    private final /* synthetic */ zzoh zzauq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzoi(zzoh zzohVar) {
        this.zzauq = zzohVar;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000c */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() {
        /*
            r2 = this;
            int r0 = r2.currentIndex
        L2:
            com.google.android.gms.internal.gtm.zzoh r1 = r2.zzauq
            java.util.ArrayList r1 = com.google.android.gms.internal.gtm.zzoh.zza(r1)
            int r1 = r1.size()
            if (r0 >= r1) goto L1f
            com.google.android.gms.internal.gtm.zzoh r1 = r2.zzauq
            java.util.ArrayList r1 = com.google.android.gms.internal.gtm.zzoh.zza(r1)
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L1c
            r0 = 1
            return r0
        L1c:
            int r0 = r0 + 1
            goto L2
        L1f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzoi.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x001a */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.android.gms.internal.gtm.zzoa<?> next() {
        /*
            r4 = this;
            int r0 = r4.currentIndex
            com.google.android.gms.internal.gtm.zzoh r1 = r4.zzauq
            java.util.ArrayList r1 = com.google.android.gms.internal.gtm.zzoh.zza(r1)
            int r1 = r1.size()
            if (r0 >= r1) goto L42
            int r0 = r4.currentIndex
        L10:
            com.google.android.gms.internal.gtm.zzoh r1 = r4.zzauq
            java.util.ArrayList r1 = com.google.android.gms.internal.gtm.zzoh.zza(r1)
            int r1 = r1.size()
            if (r0 >= r1) goto L3c
            com.google.android.gms.internal.gtm.zzoh r1 = r4.zzauq
            java.util.ArrayList r1 = com.google.android.gms.internal.gtm.zzoh.zza(r1)
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L39
            r4.currentIndex = r0
            int r1 = r0 + 1
            r4.currentIndex = r1
            com.google.android.gms.internal.gtm.zzoe r1 = new com.google.android.gms.internal.gtm.zzoe
            double r2 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r1.<init>(r0)
            return r1
        L39:
            int r0 = r0 + 1
            goto L10
        L3c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L42:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzoi.next():java.lang.Object");
    }
}
