package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes4.dex */
final class brd implements Iterator {
    private final ArrayDeque a;

    /* renamed from: b  reason: collision with root package name */
    private bnw f955b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ brd(bnz bnzVar) {
        bnz bnzVar2;
        if (bnzVar instanceof bre) {
            bre breVar = (bre) bnzVar;
            ArrayDeque arrayDeque = new ArrayDeque(breVar.f());
            this.a = arrayDeque;
            arrayDeque.push(breVar);
            bnzVar2 = breVar.d;
            this.f955b = b(bnzVar2);
            return;
        }
        this.a = null;
        this.f955b = (bnw) bnzVar;
    }

    private final bnw b(bnz bnzVar) {
        while (bnzVar instanceof bre) {
            bre breVar = (bre) bnzVar;
            this.a.push(breVar);
            bnzVar = breVar.d;
        }
        return (bnw) bnzVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final bnw next() {
        bnw bnwVar;
        bnz bnzVar;
        bnw bnwVar2 = this.f955b;
        if (bnwVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            bnwVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            bnzVar = ((bre) this.a.pop()).e;
            bnwVar = b(bnzVar);
        } while (bnwVar.B());
        this.f955b = bnwVar;
        return bnwVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f955b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
