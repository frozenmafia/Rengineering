package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
public final class bew {
    private final azo a;

    /* renamed from: b  reason: collision with root package name */
    private final int f817b;
    private final aza c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bew(azo azoVar, int i, aza azaVar, byte[] bArr) {
        this.a = azoVar;
        this.f817b = i;
        this.c = azaVar;
    }

    public final int a() {
        return this.f817b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bew) {
            bew bewVar = (bew) obj;
            return this.a == bewVar.a && this.f817b == bewVar.f817b && this.c.equals(bewVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.f817b), Integer.valueOf(this.c.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", this.a, Integer.valueOf(this.f817b), this.c);
    }
}
