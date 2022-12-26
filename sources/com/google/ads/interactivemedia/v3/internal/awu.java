package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
/* loaded from: classes4.dex */
final class awu extends awl implements Serializable {
    static final awu a = new awu();
    private static final long serialVersionUID = 0;

    private awu() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awl
    public final awl a() {
        return awk.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awl, java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        atc.k(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
