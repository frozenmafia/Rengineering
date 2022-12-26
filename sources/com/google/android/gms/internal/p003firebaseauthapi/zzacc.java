package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.ListIterator;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacc  reason: invalid package */
/* loaded from: classes7.dex */
final class zzacc implements ListIterator<String> {
    final ListIterator<String> zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzace zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacc(zzace zzaceVar, int i) {
        zzaaj zzaajVar;
        this.zzc = zzaceVar;
        this.zzb = i;
        zzaajVar = zzaceVar.zza;
        this.zza = zzaajVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zza.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.zza.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.zza.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zza.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
