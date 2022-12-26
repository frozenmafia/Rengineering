package com.google.ads.interactivemedia.v3.internal;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ava extends avb {
    final transient int a;

    /* renamed from: b  reason: collision with root package name */
    final transient int f733b;
    final /* synthetic */ avb c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ava(avb avbVar, int i, int i2) {
        this.c = avbVar;
        this.a = i;
        this.f733b = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public final int b() {
        return this.c.c() + this.a + this.f733b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public final int c() {
        return this.c.c() + this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public final boolean f() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public final Object[] g() {
        return this.c.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        atc.j(i, this.f733b);
        return this.c.get(i + this.a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avb
    public final avb i(int i, int i2) {
        atc.h(i, i2, this.f733b);
        avb avbVar = this.c;
        int i3 = this.a;
        return avbVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f733b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avb, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
