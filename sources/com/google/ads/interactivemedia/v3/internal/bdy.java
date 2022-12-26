package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
final class bdy {
    private final Class a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f812b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bdy(Class cls, Class cls2) {
        this.a = cls;
        this.f812b = cls2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bdy) {
            bdy bdyVar = (bdy) obj;
            return bdyVar.a.equals(this.a) && bdyVar.f812b.equals(this.f812b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.f812b});
    }

    public final String toString() {
        String simpleName = this.a.getSimpleName();
        String simpleName2 = this.f812b.getSimpleName();
        return simpleName + " with serialization type: " + simpleName2;
    }
}
