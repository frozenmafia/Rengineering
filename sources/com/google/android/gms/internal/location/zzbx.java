package com.google.android.gms.internal.location;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes7.dex */
public abstract class zzbx extends zzbu implements List, RandomAccess {
    private static final zzca zza = new zzbv(zzby.zza, 0);

    static zzbx zzi(Object[] objArr, int i) {
        if (i == 0) {
            return zzby.zza;
        }
        return new zzby(objArr, i);
    }

    public static zzbx zzj(Collection collection) {
        if (collection instanceof zzbu) {
            zzbx zzd = ((zzbu) collection).zzd();
            if (zzd.zzf()) {
                Object[] array = zzd.toArray();
                return zzi(array, array.length);
            }
            return zzd;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i = 0; i < length; i++) {
            if (array2[i] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        return zzi(array2, length);
    }

    public static zzbx zzk() {
        return zzby.zza;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    @Override // java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != r5) goto L4
            goto L59
        L4:
            boolean r1 = r6 instanceof java.util.List
            if (r1 != 0) goto L9
            goto L5a
        L9:
            java.util.List r6 = (java.util.List) r6
            int r1 = r5.size()
            int r2 = r6.size()
            if (r1 == r2) goto L16
            goto L5a
        L16:
            boolean r2 = r6 instanceof java.util.RandomAccess
            if (r2 == 0) goto L2f
            r2 = 0
        L1b:
            if (r2 >= r1) goto L59
            java.lang.Object r3 = r5.get(r2)
            java.lang.Object r4 = r6.get(r2)
            boolean r3 = com.google.android.gms.internal.location.zzbq.zza(r3, r4)
            if (r3 != 0) goto L2c
            goto L5a
        L2c:
            int r2 = r2 + 1
            goto L1b
        L2f:
            java.util.Iterator r1 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L37:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L53
            boolean r2 = r6.hasNext()
            if (r2 != 0) goto L44
            goto L5a
        L44:
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = r6.next()
            boolean r2 = com.google.android.gms.internal.location.zzbq.zza(r2, r3)
            if (r2 != 0) goto L37
            goto L5a
        L53:
            boolean r6 = r6.hasNext()
            if (r6 != 0) goto L5a
        L59:
            r0 = 1
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbx.equals(java.lang.Object):boolean");
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.location.zzbu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.location.zzbu
    int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    @Deprecated
    public final zzbx zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.location.zzbu
    public final zzbz zze() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzbx subList(int i, int i2) {
        zzbr.zzc(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 != 0) {
            return new zzbw(this, i, i3);
        }
        return zzby.zza;
    }

    @Override // java.util.List
    /* renamed from: zzl */
    public final zzca listIterator(int i) {
        zzbr.zzb(i, size(), "index");
        return isEmpty() ? zza : new zzbv(this, i);
    }
}
