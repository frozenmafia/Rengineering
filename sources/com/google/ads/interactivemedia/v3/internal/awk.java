package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class awk extends awl implements Serializable {
    static final awk a = new awk();
    private static final long serialVersionUID = 0;

    private awk() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awl
    public final awl a() {
        return awu.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awl, java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        atc.k(comparable);
        atc.k(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
