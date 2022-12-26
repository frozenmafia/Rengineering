package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
final class bqd extends bqf {
    private static final Class a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private bqd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bqd(byte[] bArr) {
    }

    static List a(Object obj, long j) {
        return (List) bsb.h(obj, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List g(Object obj, long j, int i) {
        bqb bqbVar;
        List arrayList;
        List a2 = a(obj, j);
        if (a2.isEmpty()) {
            if (a2 instanceof bqc) {
                arrayList = new bqb(i);
            } else if (!(a2 instanceof bqw) || !(a2 instanceof bpq)) {
                arrayList = new ArrayList(i);
            } else {
                arrayList = ((bpq) a2).d(i);
            }
            bsb.w(obj, j, arrayList);
            return arrayList;
        }
        if (a.isAssignableFrom(a2.getClass())) {
            ArrayList arrayList2 = new ArrayList(a2.size() + i);
            arrayList2.addAll(a2);
            bsb.w(obj, j, arrayList2);
            bqbVar = arrayList2;
        } else if (a2 instanceof brw) {
            bqb bqbVar2 = new bqb(a2.size() + i);
            bqbVar2.addAll((brw) a2);
            bsb.w(obj, j, bqbVar2);
            bqbVar = bqbVar2;
        } else if ((a2 instanceof bqw) && (a2 instanceof bpq)) {
            bpq bpqVar = (bpq) a2;
            if (bpqVar.c()) {
                return a2;
            }
            bpq d = bpqVar.d(a2.size() + i);
            bsb.w(obj, j, d);
            return d;
        } else {
            return a2;
        }
        return bqbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.bqf
    public final List b(Object obj, long j) {
        return g(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.bqf
    public final void c(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) bsb.h(obj, j);
        if (list instanceof bqc) {
            unmodifiableList = ((bqc) list).e();
        } else if (a.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if (!(list instanceof bqw) || !(list instanceof bpq)) {
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                bpq bpqVar = (bpq) list;
                if (bpqVar.c()) {
                    bpqVar.b();
                    return;
                }
                return;
            }
        }
        bsb.w(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.bqf
    public final void d(Object obj, Object obj2, long j) {
        List a2 = a(obj2, j);
        List g = g(obj, j, a2.size());
        int size = g.size();
        int size2 = a2.size();
        if (size > 0 && size2 > 0) {
            g.addAll(a2);
        }
        if (size > 0) {
            a2 = g;
        }
        bsb.w(obj, j, a2);
    }
}
