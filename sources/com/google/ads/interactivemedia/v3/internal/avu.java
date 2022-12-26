package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;
/* loaded from: classes4.dex */
final class avu extends axd {
    boolean a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f741b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public avu(Object obj) {
        this.f741b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.f741b;
    }
}
