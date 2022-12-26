package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.Arrays;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabi  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzabi<E> extends zzyf<E> implements RandomAccess {
    private static final zzabi<Object> zza;
    private E[] zzb;
    private int zzc;

    static {
        zzabi<Object> zzabiVar = new zzabi<>(new Object[0], 0);
        zza = zzabiVar;
        zzabiVar.zzb();
    }

    zzabi() {
        this(new Object[10], 0);
    }

    public static <E> zzabi<E> zze() {
        return (zzabi<E>) zza;
    }

    private final String zzf(int i) {
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
        E[] eArr = this.zzb;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.zzb, i, eArr2, i + 1, this.zzc - i);
            this.zzb = eArr2;
        }
        this.zzb[i] = e;
        this.zzc++;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        zzg(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        zza();
        zzg(i);
        E[] eArr = this.zzb;
        E e = eArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return e;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        zza();
        zzg(i);
        E[] eArr = this.zzb;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaab
    public final /* synthetic */ zzaab zzd(int i) {
        if (i < this.zzc) {
            throw new IllegalArgumentException();
        }
        return new zzabi(Arrays.copyOf(this.zzb, i), this.zzc);
    }

    private zzabi(E[] eArr, int i) {
        this.zzb = eArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        zza();
        int i = this.zzc;
        E[] eArr = this.zzb;
        if (i == eArr.length) {
            this.zzb = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }
}
