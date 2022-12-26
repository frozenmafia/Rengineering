package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class tp {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1284b;

    public tp(int i, boolean z) {
        this.a = i;
        this.f1284b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tp tpVar = (tp) obj;
        return this.a == tpVar.a && this.f1284b == tpVar.f1284b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.f1284b ? 1 : 0);
    }
}
