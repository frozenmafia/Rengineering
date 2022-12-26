package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaai  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzaai extends zzyf<String> implements RandomAccess, zzaaj {
    public static final zzaaj zza;
    private static final zzaai zzb;
    private final List<Object> zzc;

    static {
        zzaai zzaaiVar = new zzaai(10);
        zzb = zzaaiVar;
        zzaaiVar.zzb();
        zza = zzaaiVar;
    }

    public zzaai() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzyu) {
            return ((zzyu) obj).zzr(zzaac.zza);
        }
        return zzaac.zzh((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zza();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zza();
        if (collection instanceof zzaaj) {
            collection = ((zzaaj) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        zza();
        return zzj(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaab
    public final /* synthetic */ zzaab zzd(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzaai(arrayList);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaaj
    public final zzaaj zze() {
        return zzc() ? new zzace(this) : this;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaaj
    public final Object zzf(int i) {
        return this.zzc.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzyu) {
            zzyu zzyuVar = (zzyu) obj;
            String zzr = zzyuVar.zzr(zzaac.zza);
            if (zzyuVar.zzk()) {
                this.zzc.set(i, zzr);
            }
            return zzr;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzaac.zzh(bArr);
        if (zzaac.zzi(bArr)) {
            this.zzc.set(i, zzh);
        }
        return zzh;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaaj
    public final List<?> zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaaj
    public final void zzi(zzyu zzyuVar) {
        zza();
        this.zzc.add(zzyuVar);
        this.modCount++;
    }

    public zzaai(int i) {
        this.zzc = new ArrayList(i);
    }

    private zzaai(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
