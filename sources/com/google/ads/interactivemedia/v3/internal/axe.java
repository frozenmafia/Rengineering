package com.google.ads.interactivemedia.v3.internal;

import java.util.ListIterator;
import java.util.NoSuchElementException;
/* loaded from: classes4.dex */
public final class axe extends axd implements ListIterator {
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private int f750b;
    private final avb c;

    protected axe() {
    }

    protected axe(int i, int i2) {
        this();
        atc.m(i2, i);
        this.a = i;
        this.f750b = i2;
    }

    protected final Object a(int i) {
        return this.c.get(i);
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f750b < this.a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f750b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f750b;
        this.f750b = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f750b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f750b - 1;
        this.f750b = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f750b - 1;
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public axe(avb avbVar, int i) {
        this(avbVar.size(), i);
        this.c = avbVar;
    }
}
