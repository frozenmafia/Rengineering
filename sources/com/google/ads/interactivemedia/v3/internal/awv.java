package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class awv extends awl implements Serializable {
    private static final long serialVersionUID = 0;
    final awl a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public awv(awl awlVar) {
        this.a = awlVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awl
    public final awl a() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awl, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awv) {
            return this.a.equals(((awv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        awl awlVar = this.a;
        Objects.toString(awlVar);
        return String.valueOf(awlVar).concat(".reverse()");
    }
}
