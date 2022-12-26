package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes4.dex */
final class ath extends avz {
    final /* synthetic */ atj a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ath(atj atjVar) {
        this.a = atjVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avz
    final Map a() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avz, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return axb.H(this.a.a.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ati(this.a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avz, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (contains(obj)) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            atw.n(this.a.f712b, entry.getKey());
            return true;
        }
        return false;
    }
}
