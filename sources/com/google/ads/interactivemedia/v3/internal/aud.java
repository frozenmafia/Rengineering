package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class aud extends awl implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aud(Comparator comparator) {
        atc.k(comparator);
        this.a = comparator;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awl, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aud) {
            return this.a.equals(((aud) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
