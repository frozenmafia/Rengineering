package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
/* loaded from: classes4.dex */
class aut extends auu {
    Object[] a;

    /* renamed from: b  reason: collision with root package name */
    int f731b;
    boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aut() {
        axb.K(4, "initialCapacity");
        this.a = new Object[4];
        this.f731b = 0;
    }

    private final void f(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length < i) {
            this.a = Arrays.copyOf(objArr, e(length, i));
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }

    public final void a(Object obj) {
        atc.k(obj);
        f(this.f731b + 1);
        Object[] objArr = this.a;
        int i = this.f731b;
        this.f731b = i + 1;
        objArr[i] = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auu
    public /* bridge */ /* synthetic */ void b(Object obj) {
        throw null;
    }

    public final void c(Object... objArr) {
        int length = objArr.length;
        axb.l(objArr, length);
        f(this.f731b + length);
        System.arraycopy(objArr, 0, this.a, this.f731b, length);
        this.f731b += length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            f(this.f731b + iterable.size());
            if (iterable instanceof auv) {
                this.f731b = ((auv) iterable).a(this.a, this.f731b);
                return;
            }
        }
        for (Object obj : iterable) {
            b(obj);
        }
    }
}
