package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class aub extends awl implements Serializable {
    private static final long serialVersionUID = 0;
    final asv a;

    /* renamed from: b  reason: collision with root package name */
    final awl f721b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aub(asv asvVar, awl awlVar) {
        atc.k(asvVar);
        this.a = asvVar;
        this.f721b = awlVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awl, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f721b.compare(this.a.a(obj), this.a.a(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aub) {
            aub aubVar = (aub) obj;
            return this.a.equals(aubVar.a) && this.f721b.equals(aubVar.f721b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.f721b});
    }

    public final String toString() {
        return this.f721b + ".onResultOf(" + this.a + ")";
    }
}
