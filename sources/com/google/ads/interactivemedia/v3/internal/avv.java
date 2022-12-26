package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class avv implements Iterator {
    public static final avv a;

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ avv[] f742b;

    static {
        avv avvVar = new avv();
        a = avvVar;
        f742b = new avv[]{avvVar};
    }

    private avv() {
    }

    public static avv[] values() {
        return (avv[]) f742b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        axb.J(false);
    }
}
