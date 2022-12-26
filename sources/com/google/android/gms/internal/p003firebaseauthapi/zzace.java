package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzace  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzace extends AbstractList<String> implements RandomAccess, zzaaj {
    private final zzaaj zza;

    public zzace(zzaaj zzaajVar) {
        this.zza = zzaajVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return ((zzaai) this.zza).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzacd(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new zzacc(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaaj
    public final zzaaj zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaaj
    public final Object zzf(int i) {
        return this.zza.zzf(i);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaaj
    public final List<?> zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaaj
    public final void zzi(zzyu zzyuVar) {
        throw new UnsupportedOperationException();
    }
}
