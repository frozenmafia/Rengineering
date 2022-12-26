package com.google.ads.interactivemedia.v3.internal;

import java.util.List;
/* loaded from: classes4.dex */
final class bqe extends bqf {
    private bqe() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bqe(byte[] bArr) {
    }

    static bpq a(Object obj, long j) {
        return (bpq) bsb.h(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.bqf
    public final List b(Object obj, long j) {
        bpq a = a(obj, j);
        if (a.c()) {
            return a;
        }
        int size = a.size();
        bpq d = a.d(size == 0 ? 10 : size + size);
        bsb.w(obj, j, d);
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.bqf
    public final void c(Object obj, long j) {
        a(obj, j).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.bqf
    public final void d(Object obj, Object obj2, long j) {
        bpq a = a(obj, j);
        bpq a2 = a(obj2, j);
        int size = a.size();
        int size2 = a2.size();
        if (size > 0 && size2 > 0) {
            if (!a.c()) {
                a = a.d(size2 + size);
            }
            a.addAll(a2);
        }
        if (size > 0) {
            a2 = a;
        }
        bsb.w(obj, j, a2);
    }
}
