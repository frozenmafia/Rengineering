package com.google.ads.interactivemedia.v3.internal;

import java.util.ListIterator;
/* loaded from: classes4.dex */
final class atu extends ats implements ListIterator {
    final /* synthetic */ atv d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atu(atv atvVar) {
        super(atvVar);
        this.d = atvVar;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.d.isEmpty();
        b().add(obj);
        atw.q(this.d.f);
        if (isEmpty) {
            this.d.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atu(atv atvVar, int i) {
        super(atvVar, atvVar.d().listIterator(i));
        this.d = atvVar;
    }
}
