package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes4.dex */
public abstract class awl implements Comparator {
    public static awl b(Comparator comparator) {
        if (comparator instanceof awl) {
            return (awl) comparator;
        }
        return new aud(comparator);
    }

    public static awl c() {
        return awk.a;
    }

    public awl a() {
        return new awv(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public final awl d(asv asvVar) {
        return new aub(asvVar, this);
    }

    public final List e(Iterable iterable) {
        Object[] A = axb.A(iterable);
        Arrays.sort(A, this);
        List asList = Arrays.asList(A);
        atc.k(asList);
        if (asList instanceof Collection) {
            return new ArrayList(asList);
        }
        return axb.t(asList.iterator());
    }
}
