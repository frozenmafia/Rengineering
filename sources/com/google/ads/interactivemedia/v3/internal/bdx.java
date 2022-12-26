package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
final class bdx {
    private final Class a;

    /* renamed from: b  reason: collision with root package name */
    private final bie f811b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bdx(Class cls, bie bieVar) {
        this.a = cls;
        this.f811b = bieVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bdx) {
            bdx bdxVar = (bdx) obj;
            return bdxVar.a.equals(this.a) && bdxVar.f811b.equals(this.f811b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.f811b});
    }

    public final String toString() {
        String simpleName = this.a.getSimpleName();
        String valueOf = String.valueOf(this.f811b);
        return simpleName + ", object identifier: " + valueOf;
    }
}
